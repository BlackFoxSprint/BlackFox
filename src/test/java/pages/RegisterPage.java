package pages;

import elements.RegisterElements;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends RegisterElements {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage fillFirstName() {
        waitUntilElementToBeClickableByXpath(FIRST_NAME_FIELD).sendKeys("Obob");
        return this;
    }

    public RegisterPage fillLastName() {
        waitUntilElementToBeClickableByXpath(LAST_NAME_FIELD).sendKeys("Alkmaar");
        return this;
    }

    public RegisterPage fillEmail() {
        waitUntilElementToBeClickableByXpath(EMAIL_FIELD).sendKeys("maksbidzura@gmail.com");
        return this;
    }

    public RegisterPage fillPassword() {
        waitUntilElementToBeClickableByXpath(PASSWORD_FIELD).sendKeys("&GfD5?BH68m2PLF");
        return this;
    }

    public RegisterPage clickRegister() {
        waitUntilElementToBeClickableByXpath(REGISTER_BUTTON).click();
        return this;
    }
}
