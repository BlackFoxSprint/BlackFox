package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class ElementsToBuyShoes extends AbstractBasePage {
    public ElementsToBuyShoes(WebDriver driver) {super(driver);}

    protected final static String BMW_SHOES_BUTTON = "//span[contains(text(),'Bmw')]";
    protected final static String GENDER_BUTTON = dataTestId("gender-filter-pill");
    protected final static String MEN_BUTTON = "//label[@for='Men']";
    protected final static String GENDER_MEN_CATEGORIES = "//label[@for='Men']";
    protected final static String CLOSE_COOKIE_BMW_PAGE = "//div[@class='signup-button-inner']//div[@class='relative w-6 opacity-100']";
    protected final static String CLOSE_FILTER = dataTestId("close-btn");
    protected final static String SCROLL_UP = "//nav[@id='breadcrumb']";
    protected final static String CLEAR_BUTTON = "//button[contains(text(),'Clear')][1]";
    protected final static String WOMEN_BUTTON = "//label[@for='Women']";
    protected final static String GENDER_WOMAN_CATEGORIES = "//label[@for='Women']";
    protected final static String CLOSE_COOKIE_BANNER = dataTestId("cookie-banner-close-btn");
    protected final static String UNISEX_BUTTON = "//label[@for='Unisex']";
    protected final static String BOYS_BUTTON = "//label[@for='Boys']";
    protected final static String PRICE_FILTER_BUTTON = dataTestId("price-filter-pill");
    protected final static String ELEMENTS_BOYS = "//a[@data-test-id='product-list-item-link";
}
