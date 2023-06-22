package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class SelectProductElements extends AbstractBasePage {
    public SelectProductElements(WebDriver driver) {
        super(driver);
    }

    public static final String PRODUCT_TITTLE = dataTestId("pdp-title");
    public static final String PRODUCT_PRICE ="//div[@class='flex flex-col pb-1']/span[1]";
}
