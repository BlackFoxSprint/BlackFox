package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountElements extends AbstractBasePage {

    public MyAccountElements(WebDriver driver) {
        super(driver);
    }

    private static final String ACCOUNT_LOGOUT_BTN = dataTestId("account-logout-button");
    private static final String ADD_NEW_ADDRESS = dataTestId("add-new-address");
    private static final String DELETE_ADDRESS_BTN = dataTestId("delete-address");
    private static final String CONFIRM_DELETE_BTN = dataTestId("confirm-button");
    private static final String EDIT_PASSWORD_BTN = dataTestId("edit-password-button");
    private static final String NEWS_LETTER_PREFERENCES_BTN = "//div[text()='Newsletter preferences']";
    private static final String NOTIFICATION_PREFERENCES_BTN = "//div[text()='Notification preferences']";

    //address book section
    private static final String ADDRESS_TITLE_FIELD = "//input[@id='address-title-input']";
    private static final String COUNTRY_SELECT = ("(//div[@class='w-full'])[3]//div[2]");
    private static final String FIRST_NAME_FIELD = "//input[@id='firstName-input']";
    private static final String LAST_NAME_FIELD = "//input[@id='lastName-input']";
    private static final String ADDRESS1_FIELD = "//input[@id='address1']";
    private static final String ADDRESS2_FIELD = "//input[@id='address2-input']";
    private static final String CITY_FIELD = "//input[@id='city-input']";
    private static final String POSTAL_CODE_FIELD = "//input[@id='postalCode-input']";
    private static final String STATE_SELECT = "//select[@id='address-form-state-select']";
    private static final String PHONE_NUMBER_FIELD = "//input[@id='phone-input']";
    private static final String SAVE_BTN = dataTestId("add-address-button");

    //Change Password
    private static final String CURRENT_PASSWORD_FIELD = dataTestId("current-password");
    private static final String NEW_PASSWORD_FIELD = dataTestId("new-password");
    private static final String NEW_PASSWORD_CONFIRMATION_FIELD = dataTestId("new-password-confirmation");
    private static final String BACK_TO_MY_ACCOUNT_BTN = "//div[@class='flex items-center justify-center']";

    //Newsletter preferences
    private static final String NEWSLETTER_SUBMIT_BTN = dataTestId("submit-newsletter-preferences");
    private static final String RETURN_TO_MY_ACCOUNT = "//div[text()='return to my account']";

    //Notification preferences
    private static final String SUBMIT_NOTIFICATION_PREFERENCES_BTN = dataTestId("submit-notification-preferences");

    protected WebElement getAccountLogoutBtn() {
        return waitUntilElementToBeClickableByCss(ACCOUNT_LOGOUT_BTN);
    }

    protected WebElement getAddNewAddress() {
        return waitUntilElementToBeClickableByCss(ADD_NEW_ADDRESS);
    }

    protected WebElement getAddressTitleField() {
        return waitUntilElementToBeClickableByXpath(ADDRESS_TITLE_FIELD);
    }

    protected WebElement getCountrySelect() {
        return waitUntilElementToBeClickableByXpath(COUNTRY_SELECT);
    }

    protected WebElement getFirstNameField() {
        return waitUntilElementToBeClickableByXpath(FIRST_NAME_FIELD);
    }

    protected WebElement getLastNameField() {
        return waitUntilElementToBeClickableByXpath(LAST_NAME_FIELD);
    }

    protected WebElement getAddress1Field() {
        return waitUntilElementToBeClickableByXpath(ADDRESS1_FIELD);
    }

    protected WebElement getAddress2Field() {
        return waitUntilElementToBeClickableByXpath(ADDRESS2_FIELD);
    }

    protected WebElement getCityField() {
        return waitUntilElementToBeClickableByXpath(CITY_FIELD);
    }

    protected WebElement getPostalCodeField() {
        return waitUntilElementToBeClickableByXpath(POSTAL_CODE_FIELD);
    }

    protected WebElement getPhoneNumberField() {
        return waitUntilElementToBeClickableByXpath(PHONE_NUMBER_FIELD);
    }

    protected WebElement getSaveBtn() {
        return waitUntilElementToBeClickableByCss(SAVE_BTN);
    }

    protected WebElement getDeleteAddressBtn() {
        return waitUntilElementToBeClickableByCss(DELETE_ADDRESS_BTN);
    }

    protected WebElement getConfirmDeleteBtn() {
        return waitUntilElementToBeClickableByCss(CONFIRM_DELETE_BTN);
    }

    protected WebElement getStateSelect() {
        return waitUntilPresenceOfElementByXpath(STATE_SELECT);
    }

    protected WebElement getEditPasswordBtn() {
        return waitUntilElementToBeClickableByCss(EDIT_PASSWORD_BTN);
    }

    protected WebElement getCurrentPasswordField() {
        return waitUntilElementToBeClickableByCss(CURRENT_PASSWORD_FIELD);
    }

    protected WebElement getNewPasswordField() {
        return waitUntilElementToBeClickableByCss(NEW_PASSWORD_FIELD);
    }

    protected WebElement getNewPasswordConfirmationField() {
        return waitUntilElementToBeClickableByCss(NEW_PASSWORD_CONFIRMATION_FIELD);
    }

    protected WebElement getBackToMyAccountBtn() {
        return waitUntilElementToBeClickableByXpath(BACK_TO_MY_ACCOUNT_BTN);
    }

    protected WebElement getNewsLetterPreferencesBtn() {
        return waitUntilElementToBeClickableByXpath(NEWS_LETTER_PREFERENCES_BTN);
    }

    protected WebElement getNewsletterSubmitBtn() {
        return waitUntilElementToBeClickableByCss(NEWSLETTER_SUBMIT_BTN);
    }

    protected WebElement getReturnToMyAccountBtn() {
        return waitUntilElementToBeClickableByXpath(RETURN_TO_MY_ACCOUNT);
    }

    protected WebElement getNotificationPreferencesBtn() {
        return waitUntilElementToBeClickableByXpath(NOTIFICATION_PREFERENCES_BTN);
    }

    protected WebElement getSubmitNotificationPreferencesBtn() {
        return waitUntilElementToBeClickableByCss(SUBMIT_NOTIFICATION_PREFERENCES_BTN);
    }
}
