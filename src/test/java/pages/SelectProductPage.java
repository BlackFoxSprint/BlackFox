package pages;

import elements.SelectProductElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectProductPage extends SelectProductElements {
    public SelectProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductTittle() {
        return waitUntilElementToBeVisibleByXpath(PRODUCT_TITTLE).getText();
    }
    public String getProductPrice() {
        return waitUntilElementToBeVisibleByXpath(PRODUCT_PRICE).getText();
    }
}
