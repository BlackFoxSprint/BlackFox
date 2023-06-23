package pages;

import elements.MyAccountElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage extends MyAccountElements {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public MyAccountPage clickAccountLogoutBtn() {
        getAccountLogoutBtn().click();
        return this;
    }

    public MyAccountPage clickAddNewAddress() {
        getAddNewAddress().click();
        return this;
    }

    public boolean isVisibleAddNewAddress() {
        return getAddNewAddress().isDisplayed();
    }

    public MyAccountPage fillAddressTitleField() {
        getAddressTitleField().sendKeys("123");
        return this;
    }

    public MyAccountPage clickCountry() {
        getCountrySelect().click();
        return this;
    }

    public MyAccountPage fillFirstNameField() {
        getFirstNameField().sendKeys("1234");
        return this;
    }

    public MyAccountPage fillLastNameField() {
        getLastNameField().sendKeys("12345");
        return this;
    }

    public MyAccountPage fillAddress1Field() {
        getAddress1Field().sendKeys("1805 East Sky Harbor Circle South");
        return this;
    }

    public MyAccountPage fillAddress2Field() {
        getAddress2Field().sendKeys("38");
        return this;
    }

    public MyAccountPage filltCityField() {
        getCityField().sendKeys("Regina");
        return this;
    }

    public MyAccountPage fillPostalCodeField() {
        getPostalCodeField().sendKeys("35202");
        return this;
    }

    public MyAccountPage fillPhoneNumberField() {
        getPhoneNumberField().sendKeys("9542287691");
        return this;
    }

    public MyAccountPage selectStateByVisibleText(String stateText) {
        WebElement selectElement = getStateSelect();
        Select select = new Select(selectElement);
        select.selectByVisibleText(stateText);
        return this;
    }

    public MyAccountPage clickSaveBtn() {
        getSaveBtn().click();
        return this;
    }

    public MyAccountPage clickDeleteAddressBtn() {
        getDeleteAddressBtn().click();
        return this;
    }

    public MyAccountPage clickConfirmDeleteBtn() {
        getConfirmDeleteBtn().click();
        return this;
    }

    public MyAccountPage clickEditPasswordBtn() {
        getEditPasswordBtn().click();
        return this;
    }

    public MyAccountPage fillCurrentPasswordField() {
        getCurrentPasswordField().sendKeys("123123");
        return this;
    }

    public MyAccountPage fillNewPasswordField() {
        getNewPasswordField().sendKeys("123123");
        return this;
    }

    public MyAccountPage fillNewPasswordConfirmationField() {
        getNewPasswordConfirmationField().sendKeys("123123");
        return this;
    }

    public MyAccountPage clickBackToMyAccountBtn() {
        getBackToMyAccountBtn().click();
        return this;
    }

    public MyAccountPage clickNewsLetterPreferencesBtn() {
        getNewsLetterPreferencesBtn().click();
        return this;
    }

    public MyAccountPage clickNewsletterSubmitBtn() {
        getNewsletterSubmitBtn().click();
        return this;
    }

    public MyAccountPage clickReturnToMyAccountBtn() {
        getReturnToMyAccountBtn().click();
        return this;
    }

    public MyAccountPage clickNotificationPreferencesBtn() {
        getNotificationPreferencesBtn().click();
        return this;
    }

    public MyAccountPage clickSubmitNotificationPreferencesBtn() {
        getSubmitNotificationPreferencesBtn().click();
        return this;
    }
}
