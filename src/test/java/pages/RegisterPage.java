package pages;

import elements.RegisterElements;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends RegisterElements {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage fillFirstName(String firstname) {
        waitUntilElementToBeClickableByCss(FIRST_NAME_FIELD).sendKeys(firstname);
        return this;
    }

    public RegisterPage fillLastName(String lastname) {
        waitUntilElementToBeClickableByCss(LAST_NAME_FIELD).sendKeys(lastname);
        return this;
    }

    public RegisterPage fillEmail(String email) {
        waitUntilElementToBeClickableByCss(EMAIL_FIELD).sendKeys(email);
        return this;
    }

    public RegisterPage fillPassword(String password) {
        waitUntilElementToBeClickableByCss(PASSWORD_FIELD).sendKeys(password);
        return this;
    }

    public RegisterPage clickRegister() {
        waitUntilElementToBeClickableByCss(REGISTER_BUTTON).click();
        return this;
    }

    public RegisterPage waitLoginAlreadyInUse() {
        waitUntilElementToBeVisibleByCss(LOGIN_ALREADY_IN_USE_TEXT);
        return this;
    }

    public RegisterPage waitTermsAndConditions() {
        waitUntilElementToBeVisibleByXpath(GENERAL_TERMS_AND_CONDITIONS);
        return this;
    }

    public RegisterPage clickCreateAccountOnTop() {
        waitUntilElementToBeClickableByCss(CREATE_ACCOUNT_BUTTON_ON_TOP).click();
        return this;
    }

    public RegisterPage clickTermsAndConditions() {
        waitUntilElementToBeClickableByXpath(TERMS_AND_CONDITIONS).click();
        return this;
    }

    public RegisterPage clickPrivacyPolicy() {
        waitUntilElementToBeClickableByXpath(PRIVACY_POLICY).click();
        return this;
    }

    public RegisterPage clickFrogottenYourPassword() {
        waitUntilElementToBeClickableByCss(FORGOTTEN_YOUR_PASSWORD).click();
        return this;
    }

    public RegisterPage clickSumbitInForgottenPassword() {
        waitUntilElementToBeClickableByCss(SUBMIT_IN_FORGOTTEN_PASSWORD).click();
        return this;
    }

    public RegisterPage fillEmailInForgottenPassword() {
        waitUntilElementToBeClickableByCss(EMAIL_FIELD_IN_FORGOTTEN_PASSWORD).sendKeys("maksbidzura@gmail.com");
        return this;
    }

    public RegisterPage fillLoginEmail(String LoginEmail) {
        waitUntilElementToBeClickableByCss(EMAIL_FIELD_ON_LOGIN_PAGE).sendKeys(LoginEmail);
        return this;
    }

    public RegisterPage fillLoginPassword(String LoginPassword) {
        waitUntilElementToBeClickableByCss(PASSWORD_FIELD_ON_LOGIN_PAGE).sendKeys(LoginPassword);
        return this;
    }

    public RegisterPage clickLoginButtonOnLoginPage() {
        waitUntilElementToBeClickableByCss(LOGIN_BUTTON_ON_LOGIN_PAGE).click();
        return this;
    }
}
