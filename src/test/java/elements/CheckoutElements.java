package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutElements extends AbstractBasePage {

    public CheckoutElements(WebDriver driver) {
        super(driver);
    }

    private final String FIRST_NAME_SHIPPING_ADDRESS = dataTestId("first-name");
    private final String LAST_NAME_SHIPPING_ADDRESS = dataTestId("last-name");
    private final String STREET_NUMBER_AND_NAME = dataTestId("address1");
    private final String OKLAHOMA_STREET = "//span[@class='flex-1'][contains(text(), 'Оклахома')]";
    private final String EMAIL_CONTACT_INFO = dataTestId("checkout-email-field");
    private final String PHONE_NUMBER_CONTACT_INFO = dataTestId("phone-number");
    private final String CONTINUE_TO_PAYMENT_BTN = dataTestId("continue-to-payment");
    private final String CREDIT_CARD_NAME_INPUT = dataTestId("credit-card-holder-name");
    private final String CREDIT_CARD_NUMBER_INPUT = dataTestId("credit-card-number");
    private final String CREDIT_CARD_EXPIRATION_DATE_INPUT = dataTestId("credit-card-expiration-date");
    private final String CREDIT_CARD_CVV_INPUT = dataTestId("credit-card-cvv");
    private final String PLACE_ORDER_BTN = dataTestId("place-order");
    private final String PAYMENT_FORM_ERROR = dataTestId("payment-form-error");
    private final String CREDIT_CARD_NUMBER_ERROR = dataTestId("credit-card-number-error");

    protected WebElement getFirstNameShippingAddressInput() {
        return waitUntilElementToBeClickableByCss(FIRST_NAME_SHIPPING_ADDRESS);
    }

    protected WebElement getLastNameShippingAddressInput() {
        return waitUntilElementToBeClickableByCss(LAST_NAME_SHIPPING_ADDRESS);
    }

    protected WebElement getStreetNumberAndNameInput() {
        return waitUntilElementToBeClickableByCss(STREET_NUMBER_AND_NAME);
    }

    protected WebElement getOklahomaStreet() {
        return waitUntilElementToBeClickableByXpath(OKLAHOMA_STREET);
    }

    protected WebElement getEmailInput() {
        return waitUntilElementToBeClickableByCss(EMAIL_CONTACT_INFO);
    }

    protected WebElement getPhoneNumberInput() {
        return waitUntilElementToBeClickableByCss(PHONE_NUMBER_CONTACT_INFO);
    }

    protected WebElement getContinueToPaymentBtn() {
        return waitUntilElementToBeClickableByCss(CONTINUE_TO_PAYMENT_BTN);
    }

    protected WebElement getCreditCardNameInput() {
        return waitUntilElementToBeClickableByCss(CREDIT_CARD_NAME_INPUT);
    }

    protected WebElement getCreditCardNumberInput() {
        return waitUntilElementToBeClickableByCss(CREDIT_CARD_NUMBER_INPUT);
    }

    protected WebElement getCreditExpirationDateInput() {
        return waitUntilElementToBeClickableByCss(CREDIT_CARD_EXPIRATION_DATE_INPUT);
    }

    protected WebElement getCreditCardCvvInput() {
        return waitUntilElementToBeClickableByCss(CREDIT_CARD_CVV_INPUT);
    }

    protected WebElement getPlaceOrderBtn() {
        return waitUntilElementToBeClickableByCss(PLACE_ORDER_BTN);
    }

    protected WebElement getPaymentFormErrorTittle() {
        return waitUntilElementToBeClickableByCss(PAYMENT_FORM_ERROR);
    }

    protected WebElement getCreditCardNumberError() {
        return waitUntilElementToBeClickableByCss(CREDIT_CARD_NUMBER_ERROR);
    }

}
