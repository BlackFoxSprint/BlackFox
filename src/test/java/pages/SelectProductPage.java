package pages;

import elements.SelectProductElements;
import org.openqa.selenium.WebDriver;

public class SelectProductPage extends SelectProductElements {
    public SelectProductPage(WebDriver driver) {
        super(driver);
    }

    public String getTextProductTittle() {
        return getProductTittle().getText();
    }
    public String getTextProductPrice() {
        return getProductPrice().getText();
    }
}
