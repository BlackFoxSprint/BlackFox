package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class SelectProductElements extends AbstractBasePage {
    public SelectProductElements(WebDriver driver) {
        super(driver);
    }

    public static final String PRODUCT_TITTLE = "//h1[@data-test-id='pdp-title']";
    public static final String PRODUCT_PRICE = "//span[@data-test-id='item-price-pdp']";
}
