package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.AssertJUnit.assertEquals;

public class PaymentByEnteringInvalidDataTest extends AbstractBaseTest {

    @Test
    public void checkPayment() {
        HomePage homePage = new HomePage(driver);
        KidsPage kidsPage = new KidsPage(driver);
        ProductCardPage productCardPage = new ProductCardPage(driver);
        SelectProductPage selectProductPage = new SelectProductPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        homePage
                .clickSelectLocationCloseBtn()
                .clickCookieCloseBtn()
                .moveToCategory("Kids")
                .clickBoysSuedeCategoryBtn()
                .clickAgeGroup()
                .clickLittleKidsAgeGroup()
                .clickSortingBtn(1)
                .clickPriceLowToHigh();

        kidsPage
                .clickSuedeClassicsLfsKidsShoes();

        String selectProductName = selectProductPage.getTextProductTittle();
        String selectProductPrice = selectProductPage.getTextProductPrice();

        productCardPage
                .clickSizeOfShoesBtn()
                .clickAddToCart()
                .clickViewCart();

        assertEquals(selectProductName, shoppingCartPage.getNameProductFromOrder("1"));
        assertEquals(selectProductPrice, shoppingCartPage.getTextCartProductPrice("1"));
        assertEquals(selectProductPrice, shoppingCartPage.getTextCartProductTotalPrice());

        shoppingCartPage
                .clickCheckoutBtn();

        checkoutPage
                .entryFirstNameShippingAddress("Daryna")
                .entryLastNameShippingAddress("Yablonchuk")
                .entryStreetNumberAndName("2801 Northeast 50th Street")
                .clickOklahomaStreet()
                .entryEmail("1@a.a")
                .entryPhoneNumber("12655555555")
                .clickContinueToPaymentBtn();


    }
}
