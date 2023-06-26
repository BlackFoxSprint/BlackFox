package pages;

import elements.SportCategoryElements;
import org.openqa.selenium.WebDriver;

public class SportCategoryPage extends SportCategoryElements {

    public SportCategoryPage(WebDriver driver) {
        super(driver);
    }

    public SportCategoryPage clickTeamBtn() {
        getTeamSelectBtn().click();
        return this;
    }

    public SportCategoryPage clickBmwMotorSportBtn() {
        getBMWMotorsportCheckBox().click();
        return this;
    }

    public SportCategoryPage clickFilterBtn() {
        getFilterBtnElement().click();
        return this;
    }

    public SportCategoryPage closeDiscount() {
        get20_OffCloseBtn().click();
        return this;
    }

    public SportCategoryPage closeFilter() {
        getCloseFilterBtn().click();
        return this;
    }

    public SportCategoryPage clickGenderBtn() {
        getGenderBtn().click();
        return this;
    }

    public SportCategoryPage chooseMenCheckbox () {
        getMenCheckBox().click();
        return this;
    }

    public SportCategoryPage clickCategoryBtn() {
        getCategoryBtn().click();
        return this;
    }

    public SportCategoryPage clickClothingBtn() {
        getClothingElement().click();
        return this;
    }

    public SportCategoryPage closeGenderBtn() {
        getGenderBtn().click();
        return this;
    }

    public SportCategoryPage clickPriceBtn() {
        getPriceElement().click();
        return this;
    }

    public SportCategoryPage clickColorBtn() {
        colorBtnElement().click();
        return this;
    }

    public SportCategoryPage clickBlackColorBtn() {
        getBlackColorBtn().click();
        return this;
    }

    public SportCategoryPage clickListNameItemsBtn() {
        getListItemsName().click();
        return this;
    }

    public SportCategoryPage clickPriceFromTo(int first, int second) {
        getPriceFromToElement(first,second).click();
        return this;
    }
}
