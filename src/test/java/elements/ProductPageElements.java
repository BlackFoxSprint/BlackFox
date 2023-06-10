package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class ProductPageElements extends AbstractBasePage {
    public ProductPageElements(WebDriver driver) {
        super(driver);
    }

    public static final String PUMA_SPONGEBOB_BTN = "//a[contains(text() ,'SPONGEBOB')]";
    public static final String PRODUCTS_NAME_LIST = "//h3[contains(text() ,'PUMA x SPONGEBOB')]";
    public static final String FILTER_BTN = "//button[@data-test-id='search-flyout-form-submit']";
    public static final String GENDER_BTN = "//span[contains(text(), 'Gender')]";
    public static final String GIRLS_CATEGORY = "//input[@id='Girls']";
    public static final String MEN_CATEGORY = "//input[@id='Men']";
    public static final String UNISEX_CATEGORY = "//input[@id='Unisex']";
}
