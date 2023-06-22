package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectProductElements extends AbstractBasePage {

    public SelectProductElements(WebDriver driver) {
        super(driver);
    }
  
    private static final String PRODUCT_TITTLE = dataTestId("pdp-title");
    private static final String PRODUCT_PRICE = "//div[@class='flex flex-col pb-1']/span[1]";

    protected WebElement getProductTittle() {
        return waitUntilElementToBeVisibleByCss(PRODUCT_TITTLE);
    }
    protected WebElement getProductPrice() {
        return waitUntilElementToBeVisibleByXpath(PRODUCT_PRICE);
    }
}