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

    public HomePage clickSelectLocationCloseBtn() {
        waitUntilElementToBeClickableByXpath(SELECT_LOCATION_CLOSE_BTN).click();
        return this;
    }

    public HomePage clickWomenClassicsCategoryBtn() {
        waitUntilElementToBeVisibleByXpath(WOMEN_CLASSICS_CATEGORY).click();
        return this;
    }

    public HomePage clickMenSoccerShoesBtn() {
        waitUntilElementToBeVisibleByXpath(SOCCER_SHOES_MEN_CATEGORY).click();
        return this;
    }

    public HomePage clickMenBasketballShoesBtn() {
        waitUntilElementToBeVisibleByXpath(BASKETBALL_SHOES_MEN_CATEGORY).click();
        return this;
    }

    public HomePage clickMenHatsAccessoriesBtn() {
        waitUntilElementToBeVisibleByXpath(HATS_ACCESSORIES_MEN_CATEGORY).click();
        return this;
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

    public WebElement getPopUpMenuSaleWomenAccessories() {
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

    public WebElement collaborationBtn() {
        return waitUntilElementToBeVisibleByXpath(COLLABORATION_BTN);
    }

    public WebElement searchInputField() {
        return waitUntilPresenceOfElementByXpath(SEARCH_INPUT_FIELD);
    }

    public HomePage clickSearchBtn() {
        waitUntilElementToBeVisibleByXpath(SEARCH_BTN).click();
        return this;
    }

    public HomePage clickSearchField() {
        waitUntilElementToBeVisibleByXpath(SEARCH_FIELD).click();
        return this;
    }

    public HomePage clickSortingBtn(int i) {
        getSortingBtn().get(i).click();
        return this;
    }

    public HomePage clickPriceLowToHigh() {
        getPriceLowToHigh().click();
        return this;
    }

    public HomePage clickPriceHowToLow() {
        getPriceHighToLow().click();
        return this;
    }

    public HomePage clickNewestPrice() {
        getNewestPrice().click();
        return this;
    }
}
