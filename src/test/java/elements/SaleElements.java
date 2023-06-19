package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class SaleElements extends AbstractBasePage {

    public SaleElements(WebDriver driver) {
        super(driver);
    }

    protected static final String LIST_SALE_PRICE = dataTestId("sale-price");
    protected static final String LIST_PRICE = dataTestId("price");
    protected static final String PRODUCT_ITEMS = dataTestId("price");
}
