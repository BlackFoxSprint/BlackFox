package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class HomeElements extends AbstractBasePage {

    public HomeElements(WebDriver driver) {
        super(driver);
    }

    protected final static String CLOSE_POP_UP = "//button[@data-test-id='close-btn']";
    protected final static String CLOSE_COOKIE = "//button[@data-test-id='cookie-banner-close-btn']";
    protected final static String CLOSE_COOKIE_OFF = "//button[@data-test-id='newsletter-sign-up-form-button']";
    protected final static String CLOSE_COOKIE_EMAIl = "//button[@data-test-id='sign-up-form-close-button']";
    public static final String CATEGORY = "//a[@data-link-name='%s']";
    public static final String WOMEN_CLASSICS_CATEGORY = "//ul[@aria-label='Shoes']//a[@data-link-name='Classics']";
    public static final String SELECT_LOCATION_CLOSE_BTN = "//button[@data-test-id='close-btn']";
    public static final String COOKIE_CLOSE_BTN = "//button[@data-test-id='cookie-banner-close-btn']";
    protected static final String POP_UP_MENU_SALE_WOMEN_ACCESSORIES = "//a[@href='/us/en/sale/womens-sale/accessories']";

    //homepage elements
    public static final String RETURN_HOME_PAGE_PUMA_ICON = "//a[@data-test-id='main-nav-home-link']";
    public static final String ACCOUNT_ICON_BUTTON = "//button[@data-test-id='account-button']";
    public static final String SPORT_BTN = "//span[text()='Sport']";


    //account menu elements
    public static final String LOGIN_BUTTON_ON_ACCOUNT_MENU = "//a[@data-test-id='login-button']";
    public static final String REGISTER_HERE_BUTTON = "//a[@data-test-id='register-button']";
}
