package pages;

import elements.HomeElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWomenCategory() {
       return waitUntilElementToBeVisibleByXpath("//a[@data-link-name='Women']");
    }

    public WebElement getMenCategory() {
        return waitUntilElementToBeVisibleByXpath("//a[@data-link-name='Men']");
    }

    public WebElement getKidsCategory() {
        return waitUntilElementToBeVisibleByXpath("//a[@data-link-name='Kids']");
    }

    public WebElement getSaleCategory() {
        return waitUntilElementToBeVisibleByXpath("//a[@data-link-name='Sale']");
    }

    public HomePage clickClassicsWomenShoes() {
        waitUntilElementToBeClickableByXpath("//a[@href='/us/en/women/shoes/classics']").click();
        return this;
    }

    public HomePage clickAccountButton() {
        waitUntilElementToBeClickableByXpath(ACCOUNT_ICON_BUTTON).click();
        return this;
    }

    public HomePage clickRegisterHereButton() {
        waitUntilElementToBeClickableByXpath(REGISTER_HERE_BUTTON).click();
        return this;
    }

    public HomePage clickLoginButtonOnAccountMenu() {
        waitUntilElementToBeClickableByXpath(LOGIN_BUTTON_ON_ACCOUNT_MENU).click();
        return this;
    }

    public HomePage clickReturnHomePagePumaIcon() {
        waitUntilElementToBeClickableByXpath(RETURN_HOME_PAGE_PUMA_ICON).click();
        return this;
    }
}
