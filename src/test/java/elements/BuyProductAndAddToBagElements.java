package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class BuyProductAndAddToBagElements extends AbstractBasePage {
    public BuyProductAndAddToBagElements(WebDriver driver) {
        super(driver);
    }
    protected final static String COLLABORATIONS_BUTTON = "//a[@data-link-name='Collaborations']";
    protected final static String PUMA_VOGUE_BUTTON = "//a[@data-link-name='PUMA x VOGUE']";
    protected final static String PRODUCT_ELEMENTS = dataTestId("product-results");
    protected final static String SCROLL_TO_FILTER = "//div[@aria-label='Product filters']";
    protected final static String GENDER_WOMAN_CATEGORIES = "//label[@for='Women']";
    protected final static String CATEGORIES_BUTTON = dataTestId("productdivName-filter-pill");
    protected final static String SHOES_BUTTON = "//label[@for='Shoes']";
    protected final static String SIZE_BUTTON =  dataTestId("size-filter-pill");
    protected final static String NUMBER_SIZE = dataTestId("6-btn");
    protected final static String FIT_BUTTON = dataTestId("fit-filter-pill");
    protected final static String REGULAR_BUTTON = "//label[@for='Regular']";
    protected final static String PRODUCT_LIST = "//a[@data-test-id='product-list-item-link']";

}
