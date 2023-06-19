package pages;

import elements.HomeElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.moveCursor;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCategory(String category) {
        return waitUntilElementToBeVisibleByXpath(String.format(CATEGORY, category));
    }

    public HomePage clickOnCategory(String category) {
        waitUntilElementToBeVisibleByXpath(String.format(CATEGORY, category)).click();
        return this;
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

    public HomePage moveToCategory(String category) {
        moveCursor(getCategory(category), driver);
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

    public WebElement getPopUpMenuSaleWomenAccessories(){
        return waitUntilPresenceOfElementByXpath(POP_UP_MENU_SALE_WOMEN_ACCESSORIES);
    }

    public HomePage clickPopUpMenuSaleWomenAccessories() {
        getPopUpMenuSaleWomenAccessories().click();
        return this;
    }

    public HomePage clickCookieCloseBtn() {
        waitUntilElementToBeClickableByXpath(COOKIE_CLOSE_BTN);
        return this;
    }
}
