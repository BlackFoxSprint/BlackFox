package pages;

import elements.CheckoutElements;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends CheckoutElements {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage entryFirstNameShippingAddress(String firstName) {
        getFirstNameShippingAddressInput().sendKeys(firstName);
        return this;
    }

    public CheckoutPage entryLastNameShippingAddress(String lastName) {
        getLastNameShippingAddressInput().sendKeys(lastName);
        return this;
    }

    public CheckoutPage entryStreetNumberAndName(String street) {
        getStreetNumberAndNameInput().sendKeys(street);
        return this;
    }

    public CheckoutPage clickOklahomaStreet() {
        getOklahomaStreet().click();
        return this;
    }

    public CheckoutPage entryEmail(String email) {
        getEmailInput().sendKeys(email);
        return this;
    }

    public CheckoutPage entryPhoneNumber(String phoneNumber) {
        getPhoneNumberInput().sendKeys(phoneNumber);
        return this;
    }

    public CheckoutPage clickContinueToPaymentBtn() {
        getContinueToPaymentBtn().click();
        return this;
    }

    public CheckoutPage entryCreditCardName(String cardName) {
        getCreditCardNameInput().sendKeys(cardName);
        return this;
    }

    public CheckoutPage entryCreditCardNumber(String cardNumber) {
        getCreditCardNumberInput().sendKeys(cardNumber);
        return this;
    }

    public CheckoutPage entryExpirationDate(String date) {
        getCreditExpirationDateInput().sendKeys(date);
        return this;
    }

    public CheckoutPage entryCreditCardCvv(String cvv) {
        getCreditCardCvvInput().sendKeys(cvv);
        return this;
    }

    public CheckoutPage clickPlaceOrderBtn() {
        getPlaceOrderBtn().click();
        return this;
    }

    public CheckoutPage getPaymentFormErrorTittleText() {
        getPaymentFormErrorTittle().getText();
        return this;
    }

    public CheckoutPage getCreditCardNumberErrorText() {
        getCreditCardNumberError().getText();
        return this;
    }
}
