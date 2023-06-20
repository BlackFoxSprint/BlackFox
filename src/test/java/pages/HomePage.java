package pages;

import elements.HomeElements;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.moveCursor;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickOnCategory(String category) {
        waitUntilElementToBeVisibleByXpath(String.format(CATEGORY, category)).click();
        return this;
    }

    public HomePage clickSelectLocationCloseBtn() {
        waitUntilElementToBeClickableByCss(SELECT_LOCATION_CLOSE_BTN).click();
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
        waitUntilElementToBeClickableByCss(ACCOUNT_ICON_BUTTON).click();
        return this;
    }

    public HomePage clickRegisterHereButton() {
        waitUntilElementToBeClickableByCss(REGISTER_HERE_BUTTON).click();
        return this;
    }

    public HomePage clickLoginButtonOnAccountMenu() {
        waitUntilElementToBeClickableByCss(LOGIN_BUTTON_ON_ACCOUNT_MENU).click();
        return this;
    }

    public HomePage clickReturnHomePagePumaIcon() {
        waitUntilElementToBeClickableByCss(RETURN_HOME_PAGE_PUMA_ICON).click();
        return this;
    }

    public HomePage clickPopUpMenuSaleWomenAccessories() {
        getPopUpMenuSaleWomenAccessories().click();
        return this;
    }

    public HomePage clickCookieCloseBtn() {
        waitUntilElementToBeClickableByCss(COOKIE_CLOSE_BTN).click();
        return this;
    }

    public HomePage clickSearchBtn() {
        waitUntilElementToBeVisibleByXpath(SEARCH_BTN).click();
        return this;
    }

    public HomePage clickSearchField() {
        waitUntilElementToBeVisibleByCss(SEARCH_FIELD).click();
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
