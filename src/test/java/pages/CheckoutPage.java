package pages;

import elements.CheckoutElements;
import org.openqa.selenium.Keys;
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
        getStreetNumberAndNameInput().sendKeys(Keys.ARROW_DOWN);
        getStreetNumberAndNameInput().sendKeys(Keys.ENTER);
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
}
