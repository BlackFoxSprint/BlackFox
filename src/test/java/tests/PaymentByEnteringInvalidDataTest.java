package tests;

import base.AbstractBaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.AssertJUnit.assertEquals;

public class PaymentByEnteringInvalidDataTest extends AbstractBaseTest {

    @DataProvider(name = "testDataForPayment")
    public Object[][] provideTestData() {
        return new Object[][]{
                {"/", "5355 5712 8250 5734", "05/33", "676"},
                {"!", "4205 5012 6959 5704", "02/44", "123"},
                {"Bob", "1201 8765 0274 7352", "06/54", "098"},
        };
    }

    @Test(dataProvider = "testDataForPayment")
    public void checkPayment(String userCreditCardName, String userCreditCardNumber, String userExpirationDate, String userCreditCardCvv) {
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
                .clickContinueToPaymentBtn()
                .entryCreditCardName(userCreditCardName)
                .entryCreditCardNumber(userCreditCardNumber)
                .entryExpirationDate(userExpirationDate)
                .entryCreditCardCvv(userCreditCardCvv);
        System.out.println(checkoutPage.getPaymentFormErrorTittleText());
//
//        if (userCreditCardNumber.equals("5355 5712 8250 5734")) {
//            checkoutPage.clickPlaceOrderBtn();
//            assertEquals("Bad Request", checkoutPage.getPaymentFormErrorTittleText());
//        }
//        else {
//            assertEquals("Please enter a valid value", checkoutPage.getCreditCardNumberErrorText());
//
//        }
    }
}
