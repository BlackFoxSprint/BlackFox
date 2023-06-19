package elements;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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
    public static final String COLLABORATION_BTN = "//span[contains(text(),'Collaborations')]";
    public static final String SEARCH_BTN ="//button[@type='submit']//div";
    public static final String SEARCH_INPUT_FIELD = "//input[@placeholder='SEARCH PUMA.COM']";
    public static final String SEARCH_FIELD = "//button[@data-test-id='search-icon-nav']";

    //men menu elements
    public static final String SOCCER_SHOES_MEN_CATEGORY = "(//a[@data-link-name='Soccer'])[1]";
    public static final String BASKETBALL_SHOES_MEN_CATEGORY = "//a[@data-link-name='Basketball']";
    public static final String HATS_ACCESSORIES_MEN_CATEGORY = "//a[@data-link-name='Hats']";
    public static final String PRODUCT_SELECT_INPUT = "//select[@data-test-id='product-list-sort-select-input']//option";
    public static final String PRICE_LOW_TO_HIGH_SORTING = "//select[@data-test-id='product-list-sort-select-input']//option[@value='price-low-to-high']";
    public static final String PRICE_HIGH_TO_LOW_SORTING = "//select[@data-test-id='product-list-sort-select-input']//option[@value='price-high-to-low']";
    public static final String NEWEST_PRICE_SORTING = "//select[@data-test-id='product-list-sort-select-input']//option[@value='newest']";
    public static final String LIST_OF_PRICE = "//div[@class='relative flex mobile:flex-col w-full items-start']/div/span[1]";
    public static final String LIST_OF_NEWEST_PRODUCT = "//p[@data-test-id='product-badge']";

    public WebElement getPriceLowToHigh() {
        return waitUntilElementToBeVisibleByXpath(PRICE_LOW_TO_HIGH_SORTING);
    }

    public WebElement getPriceHighToLow() {
        return waitUntilElementToBeVisibleByXpath(PRICE_HIGH_TO_LOW_SORTING);
    }

    public WebElement getNewestPrice() {
        return waitUntilElementToBeVisibleByXpath(NEWEST_PRICE_SORTING);
    }

    public List<WebElement> getListOfPrice() {
        return waitUntilPresenceOfAllElementsByXpath(LIST_OF_PRICE);
    }

    public List<WebElement> getSortingBtn() {
        return waitUntilPresenceOfAllElementsByXpath(PRODUCT_SELECT_INPUT);
    }

    public List<WebElement> listNewProduct() {
        return waitUntilPresenceOfAllElementsByXpath(LIST_OF_NEWEST_PRODUCT);
    }
}