package pages;

import elements.HomePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends HomePageElements {
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

    public HomePage closePopUp() {
        waitUntilElementToBeClickableByXpath(CLOSE_POP_UP).click();
        return this;
    }

    public HomePage closeCookie() {
        waitUntilElementToBeClickableByXpath(CLOSE_COOKIE).click();
        return this;
    }

    public HomePage closeCookieOff() {
        waitUntilElementToBeClickableByXpath(CLOSE_COOKIE_OFF).click();
        return this;
    }

    public HomePage closeCookieEmail() {
        waitUntilElementToBeClickableByXpath(CLOSE_COOKIE_EMAIl).click();
        return this;
    }
    public HomePage clickSearchButton() {
        waitUntilElementToBeClickableByXpath(SEARCH_BUTTON).click();
        return this;
    }
}


