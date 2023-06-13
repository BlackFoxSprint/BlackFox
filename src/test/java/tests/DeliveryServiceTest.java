package Tests;

import base.AbstractBaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SpongeBobCollectionPage;

import static org.testng.AssertJUnit.assertEquals;

public class DeliveryServiceTest extends AbstractBaseTest {

    @Test
    public void checkDeliveryService() {
        HomePage homePage = new HomePage(driver);
        SpongeBobCollectionPage productPage = new SpongeBobCollectionPage(driver);
        Actions actions = new Actions(driver);

        homePage.clickModalWindowClose();
        homePage.clickCookiesDismiss();
        homePage.clickSearchField();

        actions.sendKeys(homePage.searchInputField(), "PORSCHE").build().perform();

        homePage.clickSearchBtn();

        productPage.clickPorscheJacketBtn();
        productPage.clickSizeMBtn();
        productPage.clickAddToCartBtn();
        productPage.clickOpenCartBtn();
        productPage.clickCheckoutBtn();
        productPage.clickContinuePaymentBtn();

        assertEquals("Please fill out this field."
                ,productPage.warningEmptyFields().getText());

        actions.sendKeys(productPage.firstNameField(),"Peter").build().perform();

        productPage.clickContinuePaymentBtn();

        assertEquals("Please fill out this field."
                ,productPage.warningEmptyFields().getText());

        actions.sendKeys(productPage.lastNameField(),"Griffin").build().perform();

        productPage.clickContinuePaymentBtn();

        assertEquals("Please fill out this field."
                ,productPage.warningEmptyFields().getText());

        actions.sendKeys(productPage.addressField(),"520 12th Avenue").build().perform();

        productPage.clickContinuePaymentBtn();

        assertEquals("Please fill out this field."
                ,productPage.warningEmptyFields().getText());

        actions.sendKeys(productPage.cityField(),"New York").build().perform();

        productPage.clickContinuePaymentBtn();

        assertEquals("Please fill out this field."
                ,productPage.warningEmptyFields().getText());

        actions.sendKeys(productPage.postalCodeField(), "10036").build().perform();

        productPage.clickContinuePaymentBtn();

        assertEquals("Please fill out this field."
                ,productPage.warningEmptyFields().getText());

        actions.sendKeys(productPage.companyField(),"Someone’s COMPANY").build().perform();
        actions.sendKeys(productPage.emailField(),"petergriffin@familyman.com").build().perform();

        productPage.clickContinuePaymentBtn();

        assertEquals("Please fill out this field."
                ,productPage.warningEmptyFields().getText());

        actions.sendKeys(productPage.phoneNumberField(),"+12345678901").build().perform();

        productPage.clickContinuePaymentBtn();

        assertEquals("https://us.puma.com/us/en/checkout/payment?smsUpdate=true&emailList=true"
                ,getURL());
    }
}
