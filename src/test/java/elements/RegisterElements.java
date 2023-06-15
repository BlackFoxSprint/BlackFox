package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class RegisterElements extends AbstractBasePage {

    public RegisterElements(WebDriver driver) {
        super(driver);
    }

    //create account elements
    public static final String FIRST_NAME_FIELD = "//input[@data-test-id='first-name']";
    public static final String LAST_NAME_FIELD = "//input[@data-test-id='last-name']";
    public static final String EMAIL_FIELD = "//input[@data-test-id='email']";
    public static final String PASSWORD_FIELD = "//input[@data-test-id='password']";
    public static final String REGISTER_BUTTON = "//button[@data-test-id='register']";
    public static final String LOGIN_ALREADY_IN_USE_TEXT = "//p[@data-test-id='registration-form-error-content']";
    public static final String CREATE_ACCOUNT_BUTTON_ON_TOP = "//a[@data-test-id='register-action-button']";

    //login elements
    public static final String FORGOTTEN_YOUR_PASSWORD = "//button[@data-test-id='forgotten-password-link']";
    public static final String SUBMIT_IN_FORGOTTEN_PASSWORD = "//button[@data-test-id='submit-password-reset-btn']";
    public static final String EMAIL_FIELD_IN_FORGOTTEN_PASSWORD = "//input[@data-test-id='email-input']";
    public static final String EMAIL_FIELD_ON_LOGIN_PAGE = "//input[@data-test-id='auth-field-email']";
    public static final String PASSWORD_FIELD_ON_LOGIN_PAGE = "//input[@data-test-id='auth-field-password']";
    public static final String LOGIN_BUTTON_ON_LOGIN_PAGE = "//button[@data-test-id='auth-button-login']";

    //works the same for both
    public static final String TERMS_AND_CONDITIONS = "//a[text()='Terms and Conditions']";
    public static final String PRIVACY_POLICY = "//div[@class='text-xs normal-case']/p//a[text()='Privacy Policy']";
    public static final String GENERAL_TERMS_AND_CONDITIONS = "//h2[@class='font-bold']/strong";
}
