package pages;

import elements.ProductPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends ProductPageElements {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage clickPumaSpongeBtn() {
        waitUntilElementToBeClickableByXpath(PUMA_SPONGEBOB_BTN).click();
        return this;
    }

    public List<WebElement> listProductNames() {
        return driver.findElements(new By.ByXPath(PRODUCTS_NAME_LIST));
    }

    public WebElement genderBtn() {
        return waitUntilElementToBeVisibleByXpath(GENDER_BTN);
    }

    public WebElement filterBtn() {
        return waitUntilElementToBeClickableByXpath(FILTER_BTN);
    }

    public WebElement girlsCategory() {
        return waitUntilPresenceOfElementByXpath(GIRLS_CATEGORY);
    }

    public WebElement menCategory() {
        return waitUntilElementToBeClickableByXpath(MEN_CATEGORY);
    }

    public WebElement unisexCategory() {
        return waitUntilElementToBeClickableByXpath(UNISEX_CATEGORY);
    }
}
