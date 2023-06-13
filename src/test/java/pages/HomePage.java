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

    public WebElement collaborationBtn() {
        return waitUntilElementToBeVisibleByXpath(COLLABORATION_BTN);
    }

    public HomePage clickSearchField() {
        waitUntilElementToBeVisibleByXpath(SEARCH_FIELD).click();
        return this;
    }

    public WebElement searchInputField() {
        return waitUntilPresenceOfElementByXpath(SEARCH_INPUT_FIELD);
    }

    public HomePage clickSearchBtn() {
        waitUntilElementToBeVisibleByXpath(SEARCH_BTN).click();
        return this;
    }

    public HomePage clickCookiesDismiss() {
        waitUntilElementToBeVisibleByXpath(COOKIES_DISMISS).click();
        return this;
    }

    public HomePage clickModalWindowClose() {
        waitUntilElementToBeClickableByXpath(MODAL_WINDOW_CLOSE).click();
        return this;
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
}
