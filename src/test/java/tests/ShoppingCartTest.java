package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

import static java.lang.Thread.sleep;
import static org.testng.AssertJUnit.assertEquals;

public class ShoppingCartTest extends AbstractBaseTest {

    @Test
    public void checkShoppingCart() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        WomenPage womenPage = new WomenPage(driver);
        ProductCardPage productCardPage = new ProductCardPage(driver);
        MenPage menPage = new MenPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        SelectProductPage selectProductPage = new SelectProductPage(driver);
        SoftAssert softAssert = new SoftAssert();

        homePage
                .clickSelectLocationCloseBtn()
                .clickCookieCloseBtn()
                .moveToCategory("Women")
                .clickWomenClassicsCategoryBtn();

        womenPage
                .clickCaliWedgeMixSneakers();

        String selectProductName = selectProductPage.getTextProductTittle();
        String selectProductPrice = selectProductPage.getTextProductPrice();

        productCardPage
                .clickSizeOfShoesBtn()
                .clickAddToCart()
                .clickViewCart();

        softAssert.assertEquals(selectProductName, shoppingCartPage.getNameProductFromOrder("1"));
        softAssert.assertEquals(selectProductPrice, shoppingCartPage.getTextCartProductPrice("1"));
        softAssert.assertEquals(selectProductPrice, shoppingCartPage.getTextCartProductTotalPrice());

        homePage
                .moveToCategory("Men")
                .clickOnCategory("Polos");
        menPage
                .clickBmwMotorSportBtn();

        selectProductName = selectProductPage.getTextProductTittle();
        selectProductPrice = selectProductPage.getTextProductPrice();

        productCardPage
                .selectSizeOfClothing()
                .clickAddToCart()
                .clickViewCart();

        String priceFirstProduct = shoppingCartPage.getTextCartProductPrice("1").replace("$", "");
        String priceSecondProduct = shoppingCartPage.getTextCartProductPrice("2").replace("$", "");
        double dPriceFirstProduct = Double.parseDouble(priceFirstProduct);
        double dPriceSecondProduct = Double.parseDouble(priceSecondProduct);
        double dSumFirstAndTwoGoods = dPriceFirstProduct + dPriceSecondProduct;
        String cartTotal = shoppingCartPage.getTextCartProductTotalPrice().replace("$", "");
        double dCartTotal = Double.parseDouble(cartTotal);


        softAssert.assertEquals(selectProductName, shoppingCartPage.getNameProductFromOrder("2"));
        softAssert.assertEquals(selectProductPrice, shoppingCartPage.getTextCartProductPrice("2"));
        softAssert.assertEquals(dSumFirstAndTwoGoods, dCartTotal);

        shoppingCartPage
                .getCartProductTittle("2")
                .selectValue("2");
        sleep(3000);

        String priceFirstProductAnotherValue = shoppingCartPage.getTextCartProductPrice("1").replace("$", "");
        double dPriceFirstProductAnotherValue = Double.parseDouble(priceFirstProductAnotherValue);
        double amountFirstProductDoubleValue = dPriceFirstProduct + dPriceFirstProduct;

        assertEquals(amountFirstProductDoubleValue, dPriceFirstProductAnotherValue);

        String cartTotalForThreeProducts = shoppingCartPage.getTextCartProductTotalPrice().replace("$", "");
        double dCartTotalForThreeProducts = Double.parseDouble(cartTotalForThreeProducts);
        double amountThreeProduct = amountFirstProductDoubleValue + dPriceSecondProduct;

        softAssert.assertEquals(amountThreeProduct, dCartTotalForThreeProducts);

        shoppingCartPage
                .clickRemoveSecondProductBtn()
                .clickConfirmBtn();

        softAssert.assertEquals(amountFirstProductDoubleValue, dPriceFirstProductAnotherValue);
        softAssert.assertAll();
    }
}