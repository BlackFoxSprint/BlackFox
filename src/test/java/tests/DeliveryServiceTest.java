package tests;

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

        homePage
                .clickSelectLocationCloseBtn()
                .clickCookieCloseBtn()
                .clickSearchField();

        actions.sendKeys(homePage.searchInputField(), "PORSCHE").build().perform();

        homePage.clickSearchBtn();

        productPage
                .clickPorscheJacketBtn()
                .clickSizeMBtn()
                .clickAddToCartBtn()
                .clickOpenCartBtn()
                .clickCheckoutBtn()
                .clickContinuePaymentBtn();

        assertEquals("Please fill out this field."
                ,productPage.warningEmptyFields().getText());

        actions.sendKeys(productPage.firstNameField(),"Peter").build().perform();
        actions.sendKeys(productPage.lastNameField(),"Griffin").build().perform();
        actions.sendKeys(productPage.addressField(),"520 12th Avenue").build().perform();
        actions.sendKeys(productPage.cityField(),"New York").build().perform();
        actions.sendKeys(productPage.postalCodeField(), "10036").build().perform();
        actions.sendKeys(productPage.companyField(),"Someone’s COMPANY").build().perform();
        actions.sendKeys(productPage.emailField(),"petergriffin@familyman.com").build().perform();
        actions.sendKeys(productPage.phoneNumberField(),"+12345678901").build().perform();

        productPage.clickContinuePaymentBtn();

        assertEquals("https://us.puma.com/us/en/checkout/payment?smsUpdate=true&emailList=true"
                ,getURL());
    }
}
