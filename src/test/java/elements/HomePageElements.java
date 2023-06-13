package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class HomePageElements extends AbstractBasePage {
    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    protected final static String CLOSE_POP_UP = "//button[@data-test-id='close-btn']";
    protected final static String CLOSE_COOKIE = "//button[@data-test-id='cookie-banner-close-btn']";
    protected final static String CLOSE_COOKIE_OFF = "//button[@data-test-id='newsletter-sign-up-form-button']";
    protected final static String CLOSE_COOKIE_EMAIl = "//button[@data-test-id='sign-up-form-close-button']";
    protected final static String SEARCH_BUTTON = "//button[@data-test-id='search-button-nav']";


}
