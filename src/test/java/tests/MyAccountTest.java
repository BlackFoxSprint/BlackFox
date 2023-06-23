package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegisterPage;

public class MyAccountTest extends AbstractBaseTest {

    public static final String EMAIL = "maksbidzura@gmail.com";
    public static final String PASSWORD = "&GfD5?BH68m2PLF";
    public static final String HOME_PAGE_LINK = "https://us.puma.com/us/en";
    public static final String MY_ACCOUNT_PAGE_LINK = "https://us.puma.com/us/en/account";
    public static final String ALABAMA = "Alabama";
    public static final String ADDRESS_CONTAINS = "123";
    public static final String PASSWORD_MUST_CONTAIN = "Your password must contain at least 8 characters";
    public static final String PREFERENCES_UPDATE = "Your preferences have been updated";

    @Test
    public void checkMyAccount(){

        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);

        homePage
                .clickAccountButton()
                .clickMyAccountButton();

        registerPage
                .fillLoginEmail(EMAIL)
                .fillLoginPassword(PASSWORD)
                .clickLoginButtonOnLoginPage();

        myAccountPage.waitUntiUrlToBe(MY_ACCOUNT_PAGE_LINK);
        String currentUrl = getCurrentUrl();
        softAssert.assertTrue(currentUrl.equals(MY_ACCOUNT_PAGE_LINK), "Користувач знаходиться на вірній сторінці1");

        myAccountPage
                .clickAccountLogoutBtn();

        myAccountPage.waitUntiUrlToBe(HOME_PAGE_LINK);
        currentUrl = getCurrentUrl();
        softAssert.assertTrue(currentUrl.equals(HOME_PAGE_LINK), "Користувач знаходиться на вірній сторінці2");

        homePage
                .clickAccountButton()
                .clickMyAccountButton();

        registerPage
                .fillLoginEmail(EMAIL)
                .fillLoginPassword(PASSWORD)
                .clickLoginButtonOnLoginPage();

        myAccountPage.waitUntiUrlToBe(MY_ACCOUNT_PAGE_LINK);
        currentUrl = getCurrentUrl();
        softAssert.assertTrue(currentUrl.equals(MY_ACCOUNT_PAGE_LINK), "Користувач знаходиться на вірній сторінці3");

        myAccountPage
                .clickAddNewAddress();

        myAccountPage
                .fillAddressTitleField()
                .clickCountry()
                .fillFirstNameField("1234")
                .fillLastNameField("12345")
                .fillAddress1Field("1805 East Sky Harbor Circle South")
                .fillAddress2Field("38")
                .filltCityField("Regina")
                .fillPostalCodeField("35202")
                .fillPhoneNumberField("9542287691")
                .selectStateByVisibleText(ALABAMA)
                .clickSaveBtn()
                .clickDeleteAddressBtn();

        String pageSource = getPageSource();
        softAssert.assertTrue(pageSource.contains(ADDRESS_CONTAINS), "address");

        myAccountPage
                .clickConfirmDeleteBtn();

        softAssert.assertTrue(myAccountPage.isVisibleAddNewAddress(), "Add New Address видимий");

        myAccountPage
                .clickEditPasswordBtn()
                .fillCurrentPasswordField()
                .fillNewPasswordField()
                .fillNewPasswordConfirmationField();

        pageSource = getPageSource();
        softAssert.assertTrue(pageSource.contains(PASSWORD_MUST_CONTAIN), "Your password");

        myAccountPage
                .clickBackToMyAccountBtn()
                .clickNewsLetterPreferencesBtn()
                .clickNewsletterSubmitBtn();

        pageSource = getPageSource();
        softAssert.assertTrue(pageSource.contains(PREFERENCES_UPDATE), "Your preferences");

        myAccountPage
                .clickReturnToMyAccountBtn()
                .clickNotificationPreferencesBtn()
                .clickSubmitNotificationPreferencesBtn();

        pageSource = getPageSource();
        softAssert.assertTrue(pageSource.contains(PREFERENCES_UPDATE), "Your preferences2");

        softAssert.assertAll();
    }
}
