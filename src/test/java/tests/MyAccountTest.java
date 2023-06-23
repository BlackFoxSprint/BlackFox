package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegisterPage;

public class MyAccountTest extends AbstractBaseTest {

    @Test
    public void checkMyaccont() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);

        homePage
                .clickAccountButton()
                .clickMyAccountButton();

        registerPage
                .fillLoginEmail("maksbidzura@gmail.com")
                .fillLoginPassword("&GfD5?BH68m2PLF")
                .clickLoginButtonOnLoginPage();

        myAccountPage.waitUntiUrlToBe("https://us.puma.com/us/en/account");
        String currentUrl = getCurrentUrl();
        softAssert.assertTrue(currentUrl.equals("https://us.puma.com/us/en/account"), "Користувач знаходиться на вірній сторінці1");

        myAccountPage
                .clickAccountLogoutBtn();

        myAccountPage.waitUntiUrlToBe("https://us.puma.com/us/en");
        currentUrl = getCurrentUrl();
        softAssert.assertTrue(currentUrl.equals("https://us.puma.com/us/en"), "Користувач знаходиться на вірній сторінці2");

        homePage
                .clickAccountButton()
                .clickMyAccountButton();

        registerPage
                .fillLoginEmail("maksbidzura@gmail.com")
                .fillLoginPassword("&GfD5?BH68m2PLF")
                .clickLoginButtonOnLoginPage();

        myAccountPage.waitUntiUrlToBe("https://us.puma.com/us/en/account");
        currentUrl = getCurrentUrl();
        softAssert.assertTrue(currentUrl.equals("https://us.puma.com/us/en/account"), "Користувач знаходиться на вірній сторінці3");

        myAccountPage
                .clickAddNewAddress();

        myAccountPage
                .fillAddressTitleField()
                .clickCountry()
                .fillFirstNameField()
                .fillLastNameField()
                .fillAddress1Field()
                .fillAddress2Field()
                .filltCityField()
                .fillPostalCodeField()
                .fillPhoneNumberField()
                .selectStateByVisibleText("Alabama")
                .clickSaveBtn()
                .clickDeleteAddressBtn();

        String pageSource = getPageSource();
        softAssert.assertTrue(pageSource.contains("123"), "address");

        myAccountPage
                .clickConfirmDeleteBtn();

        softAssert.assertTrue(myAccountPage.isVisibleAddNewAddress(), "Add New Address видимий");

        myAccountPage
                .clickEditPasswordBtn()
                .fillCurrentPasswordField()
                .fillNewPasswordField()
                .fillNewPasswordConfirmationField();

        pageSource = getPageSource();
        softAssert.assertTrue(pageSource.contains("Your password must contain at least 8 characters"), "Your password");

        myAccountPage
                .clickBackToMyAccountBtn()
                .clickNewsLetterPreferencesBtn()
                .clickNewsletterSubmitBtn();

        pageSource = getPageSource();
        softAssert.assertTrue(pageSource.contains("Your preferences have been updated"), "Your preferences");

        myAccountPage
                .clickReturnToMyAccountBtn()
                .clickNotificationPreferencesBtn()
                .clickSubmitNotificationPreferencesBtn();

        pageSource = getPageSource();
        softAssert.assertTrue(pageSource.contains("Your preferences have been updated"), "Your preferences2");

        softAssert.assertAll();
    }
}
