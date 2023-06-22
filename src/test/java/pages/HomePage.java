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
        getSelectLocationCloseBtn().click();
        return this;
    }

    public HomePage clickWomenClassicsCategoryBtn() {
        getWomenClassicsCategoryBtn().click();
        return this;
    }

    public HomePage clickBoysSuedeCategoryBtn() {
        getBoysSuedeCategoryBtn().click();
        return this;
    }

    public HomePage clickMenSoccerShoesBtn() {
        getMenSoccerShoesBtn().click();
        return this;
    }

    public HomePage clickMenBasketballShoesBtn() {
        getMenBasketballShoesBtn().click();
        return this;
    }

    public HomePage clickMenHatsAccessoriesBtn() {
        getMenHatsAccessoriesBtn().click();
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
        getReturnHomePagePumaIcon().click();
        return this;
    }

    public HomePage clickPopUpMenuSaleWomenAccessories() {
        getPopUpMenuSaleWomenAccessories().click();
        return this;
    }

    public HomePage clickCookieCloseBtn() {
        getCookieCloseBtn().click();
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

    public HomePage clickAgeGroup() {
        getAgeGroup().click();
        return this;
    }

    public HomePage clickLittleKidsAgeGroup() {
        getLittleKidsAgeGroup().click();
        return this;
    }
}
