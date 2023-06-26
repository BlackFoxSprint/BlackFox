package pages;

import elements.HomeElements;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.moveCursor;
import static java.lang.Thread.sleep;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickOnCategory(String category) {
        waitUntilElementToBeVisibleByXpath(String.format(CATEGORY, category)).click();
        return this;
    }

    @Step("Close select location pop-up")
    public HomePage clickSelectLocationCloseBtn() {
        getSelectLocationCloseBtn().click();
        return this;
    }

    @Step("Click Classics Shoes Women Category")
    public HomePage clickWomenClassicsCategoryBtn() {
        getWomenClassicsCategoryBtn().click();
        return this;
    }

    @Step("Click Boys Suede Category")
    public HomePage clickBoysSuedeCategoryBtn() {
        getBoysSuedeCategoryBtn().click();
        return this;
    }

    @Step("Click Soccer Men Category")
    public HomePage clickMenSoccerShoesBtn() {
        getMenSoccerShoesBtn().click();
        return this;
    }

    @Step("Click Men Basketball Shoes Category")
    public HomePage clickMenBasketballShoesBtn() {
        getMenBasketballShoesBtn().click();
        return this;
    }

    @Step("Click Men Hats Accessories Category")
    public HomePage clickMenHatsAccessoriesBtn() {
        getMenHatsAccessoriesBtn().click();
        return this;
    }

    @Step("Move to category {category}")
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
        getReturnHomePagePumaIcon().click();
        return this;
    }

    public HomePage clickPopUpMenuSaleWomenAccessories() {
        getPopUpMenuSaleWomenAccessories().click();
        return this;
    }

    @Step("Close cookie pop-up")
    public HomePage clickCookieCloseBtn() {
        getCookieCloseBtn().click();
        return this;
    }

    public HomePage clickSportBtn() {
        waitUntilElementToBeClickableByXpath(SPORT_BTN).click();
        return this;
    }

    @Step("Close search button")
    public HomePage clickSearchBtn() {
        waitUntilElementToBeVisibleByXpath(SEARCH_BTN).click();
        return this;
    }

    @Step("Click search field input")
    public HomePage clickSearchField() {
        waitUntilElementToBeVisibleByCss(SEARCH_FIELD).click();
        return this;
    }

    @Step("Click sorting select")
    public HomePage clickSortingBtn(int i) {
        getSortingBtn().get(i).click();
        return this;
    }

    @Step("Click price Low to High sorting select")
    public HomePage clickPriceLowToHigh() {
        getPriceLowToHigh().click();
        return this;
    }
    @Step("Click price High to Low sorting select")
    public HomePage clickPriceHowToLow() {
        getPriceHighToLow().click();
        return this;
    }

    public HomePage clickNewestPrice() {
        getNewestPrice().click();
        return this;
    }

    public HomePage clickGetClickHereToExploreCareers() {
        getClickHereToExploreCareers().click();
        return this;
    }

    public HomePage clickClearBtn() {
        waitUntilElementToBeVisibleByCss(CLEAR_BTN).click();
        return this;
    }

    public HomePage clickCloseButtonInSearchField() {
        waitUntilElementToBeVisibleByXpath(CLOSE_BUTTON).click();
        return this;
    }

    public boolean inputFieldIsNotPresent() {
        By elementLocator = By.xpath(INPUT_FIELD_VISIBILITY);
        boolean searchFieldElementPresent = driver.findElements(elementLocator).isEmpty();
        return searchFieldElementPresent;
    }

    public boolean searchBarIsNotPresent() throws InterruptedException {
        sleep(1000);
        By elementLocator = By.xpath(SEARCH_BAR_VISIBILITY);
        boolean searchElementPresent = driver.findElements(elementLocator).isEmpty();
        return searchElementPresent;
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
