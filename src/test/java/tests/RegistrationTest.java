package tests;

import base.AbstractBaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.RegisterPage;

public class RegistrationTest extends AbstractBaseTest {
    @DataProvider(name = "testData")
    public Object[][] provideTestData() {
        return new Object[][]{
                {"Obob", "Alkmaar", "maksbidzura@gmail.com", "&GfD5?BH68m2PLF", true},
                {"!!$$$#$@$#@#%@%()*", "dsf3redfCaey4v hdfvcbb", "87e28f724123213", "fdsdfsdf", false},
                {"Obob", "Alkmaar", "maksbidzura123213", "&GfD5?BH68m2PLF", false},
        };
    }

    @Test(dataProvider = "testData", description = "1-15 Steps Registration")
    public void checkRegistration1(String userFirstName, String userLastName, String userEmail, String userPassword, boolean shouldClickRegister) {
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        SoftAssert softAssert = new SoftAssert();

        String pageSource;

        homePage.clickAccountButton();
        homePage.clickRegisterHereButton();
        registerPage.fillFirstName(userFirstName);
        registerPage.fillLastName(userLastName);
        registerPage.fillEmail(userEmail);
        registerPage.fillPassword(userPassword);

        if (shouldClickRegister == true) {
            registerPage.clickRegister();
            registerPage.waitLoginAlreadyInUse();
        }

        pageSource = driver.getPageSource();
        if (userEmail.equals("maksbidzura@gmail.com")) {
            softAssert.assertTrue(pageSource.contains("Login already in use"), "Login already in use message not found");
        } else {
            softAssert.assertTrue(pageSource.contains("You need to have a valid email"), "You need to have a valid email message not found");
        }

        softAssert.assertAll();
    }

    @DataProvider(name = "testData2")
    public Object[][] provideTestData2() {
        return new Object[][]{
                {"Obob", "Alkmaar", "maksbidzura@gmail.com", "&GfD5?BH68m2PLF", true},
                {"!!$$$#$@$#@#%@%()*", "dsf3redfCaey4v hdfvcbb", "87e28f724123213", "fdsdfsdf", false},
                {"Obob", "Alkmaar", "maksbidzura123213", "&GfD5?BH68m2PLF", false},
        };
    }

    @Test(dataProvider = "testData2", description = "16-34 Steps Registration")
    public void checkRegistration2(String userFirstName, String userLastName, String userEmail, String userPassword, boolean shouldClickRegister) {
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        SoftAssert softAssert = new SoftAssert();

        String pageSource;

        homePage.clickAccountButton();
        homePage.clickLoginButtonOnAccountMenu();
        registerPage.clickCreateAccountOnTop();
        registerPage.fillFirstName(userFirstName);
        registerPage.fillLastName(userLastName);
        registerPage.fillEmail(userEmail);
        registerPage.fillPassword(userPassword);

        if (shouldClickRegister) {
            registerPage.clickRegister();
            registerPage.waitLoginAlreadyInUse();
        }

        pageSource = driver.getPageSource();
        if (userEmail.equals("maksbidzura@gmail.com")) {
            softAssert.assertTrue(pageSource.contains("Login already in use"), "Login already in use message not found");
        } else {
            softAssert.assertTrue(pageSource.contains("You need to have a valid email"), "You need to have a valid email message not found");
        }

        softAssert.assertAll();
    }

    @Test(description = "35-54 Steps Privacy Policy")
    public void checkConditions() {
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        SoftAssert softAssert = new SoftAssert();

        String pageSourceTermsAndConditions;
        String pageSourcePrivacyPolicy;

        homePage.clickAccountButton();
        homePage.clickRegisterHereButton();
        registerPage.clickTermsAndConditions();

        pageSourceTermsAndConditions = driver.getPageSource();
        registerPage.waitTermsAndConditions();
        softAssert.assertTrue(pageSourceTermsAndConditions.contains("General Terms and Conditions"), "PUMA.com General Terms and Conditions");

        homePage.clickReturnHomePagePumaIcon();
        homePage.clickAccountButton();
        homePage.clickRegisterHereButton();
        registerPage.clickPrivacyPolicy();

        pageSourcePrivacyPolicy = driver.getPageSource();
        softAssert.assertTrue(pageSourcePrivacyPolicy.contains("Privacy Policy"), "Privacy Policy");
    }

    @Test(description = "55-60 Steps Forgot Password Send Email")
    public void checkSendedEmail() {
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        SoftAssert softAssert = new SoftAssert();

        String pageSource;

        homePage.clickAccountButton();
        homePage.clickLoginButtonOnAccountMenu();
        registerPage.clickFrogottenYourPassword();
        registerPage.fillEmailInForgottenPassword();
        registerPage.clickSumbitInForgottenPassword();

        pageSource = driver.getPageSource();
        softAssert.assertTrue(pageSource.contains("We’ve sent an email to"), "SUCCESS_SEND_EMAIL");
        softAssert.assertAll();
    }

    @DataProvider(name = "loginData")
    public Object[][] provideLoginData() {
        return new Object[][]{
                {"maksbidzura@gmail.com", "&GfD5?BH68m2PLF", true},
                {"maksbidzura123123123", "&GfD5?BH68m2PLF", false},
        };
    }

    @Test(dataProvider = "loginData", description = "61-70 Steps Login")
    public void checkLogin(String userEmail, String userPassword, boolean shouldClickRegister) {
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        SoftAssert softAssert = new SoftAssert();

        String pageSource;

        homePage.clickAccountButton();
        homePage.clickLoginButtonOnAccountMenu();
        registerPage.fillLoginEmail(userEmail);
        registerPage.fillLoginPassword(userPassword);

        if (shouldClickRegister == true) {
            registerPage.clickLoginButtonOnLoginPage();
        }

        pageSource = driver.getPageSource();
        if (userEmail.equals("maksbidzura@gmail.com")) {
            softAssert.assertTrue(pageSource.contains("My account"), "My account");
        } else {
            softAssert.assertTrue(pageSource.contains("You need to have a valid email"), "You need to have a valid email");
        }

        softAssert.assertAll();
    }

}
