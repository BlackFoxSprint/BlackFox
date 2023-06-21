package pages;

import elements.SportCategoryElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SportCategoryPage extends SportCategoryElements {

    public SportCategoryPage(WebDriver driver) {
        super(driver);
    }

    public SportCategoryPage clickTeamBtn() {
        waitUntilElementToBeClickableByXpath(TEAM_SELECT_BTN).click();
        return this;
    }

    public SportCategoryPage clickBmwMotorSportBtn() {
        waitUntilElementToBeClickableByXpath(BMW_MOTORSPORT_CHECKBOX).click();
        return this;
    }

    public List<WebElement> listProductNames() {
    return listWaitUntilElementsToBeVisibleByXpath(MOTORSPORT_NAME);
    }

    public SportCategoryPage clickFilterBtn() {
        waitUntilElementToBeClickableByXpath(FILTER_BTN).click();
        return this;
    }

    public WebElement pumaLogo() {
        return waitUntilElementToBeVisibleByXpath(PUMA_LOGO);
    }

    public SportCategoryPage closeDiscount() {
        waitUntilElementToBeClickableByXpath(GET_20_OFF).click();
        return this;
    }

    public SportCategoryPage closeFilter() {
        waitUntilElementToBeClickableByXpath(CLOSE_FILTER_BTN).click();
        return this;
    }

    public SportCategoryPage clickGenderBtn() {
        waitUntilElementToBeClickableByXpath(GENDER_BTN).click();
        return this;
    }

    public SportCategoryPage chooseMenCheckbox () {
        waitUntilElementToBeClickableByXpath(MEN_CHECKBOX).click();
        return this;
    }

    public SportCategoryPage clickCategoryBtn() {
        waitUntilElementToBeClickableByXpath(CATEGORY_BTN).click();
        return this;
    }

    public SportCategoryPage clickClothingBtn() {
        waitUntilElementToBeClickableByXpath(CLOTHING_CHECKBOX).click();
        return this;
    }

    public SportCategoryPage closeGenderBtn() {
        waitUntilElementToBeClickableByXpath(CLOSE_GENDER_BTN).click();
        return this;
    }

    public SportCategoryPage clickPriceBtn() {
        waitUntilElementToBeClickableByXpath(PRICE_BTN).click();
        return this;
    }

    public SportCategoryPage choosePrice50_100() {
        waitUntilElementToBeClickableByXpath(PRICE_50_100).click();
        return this;
    }

}
