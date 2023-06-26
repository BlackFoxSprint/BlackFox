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

        homePage
                .clickAccountButton()
                .clickRegisterHereButton();

        registerPage
                .fillFirstName(userFirstName)
                .fillLastName(userLastName)
                .fillEmail(userEmail)
                .fillPassword(userPassword);

        if (shouldClickRegister == true) {
            registerPage.clickRegister();
            registerPage.waitLoginAlreadyInUse();
        }

        String pageSource = getPageSource();
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

        homePage
                .clickAccountButton()
                .clickLoginButtonOnAccountMenu();

        registerPage
                .clickCreateAccountOnTop()
                .fillFirstName(userFirstName)
                .fillLastName(userLastName)
                .fillEmail(userEmail)
                .fillPassword(userPassword);

        if (shouldClickRegister) {
            registerPage.clickRegister();
            registerPage.waitLoginAlreadyInUse();
        }

        String pageSource = getPageSource();
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

        homePage
                .clickAccountButton()
                .clickRegisterHereButton();

        registerPage
                .clickTermsAndConditions();

        String pageSource = getPageSource();
        registerPage.waitTermsAndConditions();
        softAssert.assertTrue(pageSource.contains("PUMA.com"), "PUMA.com General Terms and Conditions");

        homePage
                .clickReturnHomePagePumaIcon()
                .clickAccountButton()
                .clickRegisterHereButton();

        registerPage
                .clickPrivacyPolicy();

        softAssert.assertTrue(pageSource.contains("Privacy Policy"), "Privacy Policy");

        softAssert.assertAll();
    }

    @Test(description = "55-60 Steps Forgot Password Send Email")
    public void checkSendEmail() {

        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        SoftAssert softAssert = new SoftAssert();

        homePage
                .clickAccountButton()
                .clickLoginButtonOnAccountMenu();

        registerPage
                .clickFrogottenYourPassword()
                .fillEmailInForgottenPassword()
                .clickSumbitInForgottenPassword();

        String pageSource = getPageSource();
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

        homePage
                .clickAccountButton()
                .clickLoginButtonOnAccountMenu();

        registerPage
                .fillLoginEmail(userEmail)
                .fillLoginPassword(userPassword);

        if (shouldClickRegister == true) {
            registerPage.clickLoginButtonOnLoginPage();
        }

        String pageSource = getPageSource();
        if (userEmail.equals("maksbidzura@gmail.com")) {
            softAssert.assertTrue(pageSource.contains("My account"), "My account");
        } else {
            softAssert.assertTrue(pageSource.contains("You need to have a valid email"), "You need to have a valid email");
        }

        softAssert.assertAll();
    }
}
