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
        return waitUntilElementToBeClickableByCss(OKLAHOMA_STREET);
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

}
