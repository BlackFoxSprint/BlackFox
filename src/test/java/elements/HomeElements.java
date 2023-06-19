package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class HomeElements extends AbstractBasePage {

    public HomeElements(WebDriver driver) {
        super(driver);
    }

    public static final String CATEGORY = "//a[@data-link-name='%s']";
    public static final String WOMEN_CLASSICS_CATEGORY = "//ul[@aria-label='Shoes']//a[@data-link-name='Classics']";
    public static final String SELECT_LOCATION_CLOSE_BTN = "//button[@data-test-id='close-btn']";
    public static final String COOKIE_CLOSE_BTN = "//button[@data-test-id='cookie-banner-close-btn']";
    protected static final String POP_UP_MENU_SALE_WOMEN_ACCESSORIES = "//a[@href='/us/en/sale/womens-sale/accessories']";

    //homepage elements
    public static final String RETURN_HOME_PAGE_PUMA_ICON = "//a[@data-test-id='main-nav-home-link']";
    public static final String ACCOUNT_ICON_BUTTON = "//button[@data-test-id='account-button']";

    //account menu elements
    public static final String LOGIN_BUTTON_ON_ACCOUNT_MENU = "//a[@data-test-id='login-button']";
    public static final String REGISTER_HERE_BUTTON = "//a[@data-test-id='register-button']";
    // collaboration elements
    public static final String COLLABORATION_BTN = "//span[contains(text(),'Collaborations')]";
    public static final String SEARCH_FIELD = "//button[@data-test-id='search-icon-nav']";
    public static final String SEARCH_INPUT_FIELD = "//input[@placeholder='SEARCH PUMA.COM']";
    public static final String MODAL_WINDOW_CLOSE ="//button[@data-test-id='close-btn']";
    public static final String COOKIES_DISMISS ="//div[@class='relative w-4 opacity-100 mr-0 ml-0 rtl:ml-0 rtl:mr-0']";
    public static final String SEARCH_BTN ="//button[@type='submit']//div";
    }
