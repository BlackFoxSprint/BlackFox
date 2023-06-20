package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
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

        homePage
                .clickSelectLocationCloseBtn()
                .clickCookieCloseBtn()
                .moveToCategory("Women")
                .clickWomenClassicsCategoryBtn();

        womenPage
                .clickCaliWedgeMixSneakers();

        String selectProductName = selectProductPage.getProductTittle();
        String selectProductPrice = selectProductPage.getProductPrice();

        productCardPage
                .clickSizeOfShoesBtn()
                .clickAddToCart()
                .clickViewCart();

        assertEquals(selectProductName, shoppingCartPage.getNameProductFromOrder("1"));
        assertEquals(selectProductPrice, shoppingCartPage.getCartProductPrice("1"));
        assertEquals(selectProductPrice, shoppingCartPage.getCartProductTotalPrice());

        homePage
                .moveToCategory("Men")
                .clickOnCategory("Polos");
        menPage
                .clickBmwMotorSportBtn();

        selectProductName = selectProductPage.getProductTittle();
        selectProductPrice = selectProductPage.getProductPrice();

        productCardPage
                .selectSizeOfClothing()
                .clickAddToCart()
                .clickViewCart();

        String priceFirstProduct = shoppingCartPage.getCartProductPrice("1").replace("$", "");
        String priceSecondProduct = shoppingCartPage.getCartProductPrice("2").replace("$", "");
        double dPriceFirstProduct = Double.parseDouble(priceFirstProduct);
        double dPriceSecondProduct = Double.parseDouble(priceSecondProduct);
        double dSumFirstAndTwoGoods = dPriceFirstProduct + dPriceSecondProduct;
        String cartTotal = shoppingCartPage.getCartProductTotalPrice().replace("$", "");
        double dCartTotal = Double.parseDouble(cartTotal);


        assertEquals(selectProductName, shoppingCartPage.getNameProductFromOrder("2"));
        assertEquals(selectProductPrice, shoppingCartPage.getCartProductPrice("2"));
        assertEquals(dSumFirstAndTwoGoods, dCartTotal);

        shoppingCartPage
                .getCartProductTittle("2")
//              .clickValueBtn(2)
                .selectValue("2");
        sleep(5000);

        String priceFirstProductAnotherValue = shoppingCartPage.getCartProductPrice("1").replace("$", "");
        double dPriceFirstProductAnotherValue = Double.parseDouble(priceFirstProductAnotherValue);
        double amountFirstProductDoubleValue = dPriceFirstProduct + dPriceFirstProduct;

        assertEquals(amountFirstProductDoubleValue, dPriceFirstProductAnotherValue);

        String cartTotalForThreeProducts = shoppingCartPage.getCartProductTotalPrice().replace("$", "");
        double dCartTotalForThreeProducts = Double.parseDouble(cartTotalForThreeProducts);
        double amountThreeProduct = amountFirstProductDoubleValue + dPriceSecondProduct;

        assertEquals(amountThreeProduct, dCartTotalForThreeProducts);

        shoppingCartPage
                .clickRemoveSecondProductBtn()
                .clickConfirmBtn();

        assertEquals(amountFirstProductDoubleValue, dPriceFirstProductAnotherValue);
    }
}
