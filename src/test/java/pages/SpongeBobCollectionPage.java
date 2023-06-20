package pages;

import elements.SpongeBobCollectionElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SpongeBobCollectionPage extends SpongeBobCollectionElements {
    public SpongeBobCollectionPage(WebDriver driver) {
        super(driver);
    }

    public SpongeBobCollectionPage clickPumaSpongeBtn() {
        waitUntilElementToBeClickableByXpath(PUMA_SPONGEBOB_BTN).click();
        return this;
    }

    public List<WebElement> listProductNames() {
        return driver.findElements(new By.ByXPath(PRODUCTS_NAME_LIST));
    }

    public SpongeBobCollectionPage clickGenderBtn() {
        waitUntilElementToBeVisibleByXpath(GENDER_BTN).click();
        return this;
    }

    public SpongeBobCollectionPage clickFilterBtn() {
         waitUntilElementToBeClickableByXpath(FILTER_BTN).click();
        return this;
    }

    public SpongeBobCollectionPage clickGirlsCategory() {
         waitUntilPresenceOfElementByXpath(GIRLS_CATEGORY).click();
        return this;
    }

    public SpongeBobCollectionPage clickMenCategory() {
         waitUntilElementToBeClickableByXpath(MEN_CATEGORY).click();
        return this;
    }

    public SpongeBobCollectionPage clickUnisexCategory() {
         waitUntilElementToBeClickableByXpath(UNISEX_CATEGORY).click();
        return this;
    }

    public SpongeBobCollectionPage clickPorscheJacketBtn() {
        waitUntilElementToBeClickableByXpath(PORSCHE_JACKET_PRODUCT).click();
        return this;
    }

    public SpongeBobCollectionPage clickSizeMBtn() {
        waitUntilElementToBeClickableByXpath(SIZE_M_btn).click();
        return this;
    }

    public SpongeBobCollectionPage clickAddToCartBtn() {
        waitUntilElementToBeClickableByXpath(ADD_TO_CART_BTN).click();
        return this;
    }

    public SpongeBobCollectionPage clickOpenCartBtn() {
        waitUntilElementToBeClickableByXpath(OPEN_CART_BTN).click();
        return this;
    }

    public SpongeBobCollectionPage clickCheckoutBtn() {
        waitUntilElementToBeClickableByXpath(CHECKOUT_BTN).click();
        return this;
    }

    public WebElement firstNameField() {
        return waitUntilElementToBeClickableByXpath(FIRST_NAME_FIELD);
    }

    public WebElement lastNameField() {
        return waitUntilElementToBeClickableByXpath(LAST_NAME_FIELD);
    }

    public SpongeBobCollectionPage clickContinuePaymentBtn() {
        waitUntilElementToBeClickableByXpath(CONTINUE_PAYMENT_BTN).click();
        return this;
    }

    public WebElement warningEmptyFields() {
        return waitUntilElementToBeClickableByXpath(WARNING_EMPTY_FIELDS);
    }

    public WebElement addressField() {
        return waitUntilElementToBeClickableByXpath(ADDRESS_FIELD);
    }

    public WebElement cityField() {
         return waitUntilElementToBeClickableByXpath(CITY_FIELD);
    }

    public WebElement postalCodeField() {
         return waitUntilElementToBeClickableByXpath(POSTAL_CODE_FIELD);
    }

    public WebElement emailField() {
         return waitUntilElementToBeClickableByXpath(EMAIL_FIELD);
    }

    public WebElement companyField() {
         return waitUntilElementToBeClickableByXpath(COMPANY_FIELD);
    }

    public WebElement phoneNumberField() {
         return waitUntilElementToBeClickableByXpath(PHONE_NUMBER_FIELD);
    }
}
