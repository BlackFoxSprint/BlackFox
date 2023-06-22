package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeElements extends AbstractBasePage {

    public HomeElements(WebDriver driver) {
        super(driver);
    }

    //homepage elements
    public static final String CATEGORY = "//a[@data-link-name='%s']";
    public static final String RETURN_HOME_PAGE_PUMA_ICON = dataTestId("main-nav-home-link");
    protected static final String ACCOUNT_ICON_BUTTON = "//button[@data-test-id='account-button']";
    private static final String SALE_CATEGORY = "//a[@data-link-name='Sale']";
    private static final String WOMEN_CLASSICS_CATEGORY = "//ul[@aria-label='Shoes']//a[@data-link-name='Classics']";
    private static final String BOYS_SUEDE_CATEGORY = "(//a[@data-link-name='Suede'])[1]";
    protected static final String SELECT_LOCATION_CLOSE_BTN = dataTestId("close-btn");
    protected static final String COOKIE_CLOSE_BTN = dataTestId("cookie-banner-close-btn");
    private static final String POP_UP_MENU_SALE_WOMEN_ACCESSORIES = "//a[@href='/us/en/sale/womens-sale/accessories']";

    //account menu elements
    public static final String LOGIN_BUTTON_ON_ACCOUNT_MENU = dataTestId("login-button");
    public static final String REGISTER_HERE_BUTTON = dataTestId("register-button");
    public static final String COLLABORATION_BTN = "//span[contains(text(),'Collaborations')]";
    public static final String SEARCH_BTN = "//button[@type='submit']//div";
    public static final String SEARCH_INPUT_FIELD = "//input[@placeholder='SEARCH PUMA.COM']";

    //men menu elements
    private static final String SOCCER_SHOES_MEN_CATEGORY = "(//a[@data-link-name='Soccer'])[1]";
    private static final String PRICE_LOW_TO_HIGH_SORTING = "//select[@data-test-id='product-list-sort-select-input']//option[@value='price-low-to-high']";
    private static final String PRICE_HIGH_TO_LOW_SORTING = "//select[@data-test-id='product-list-sort-select-input']//option[@value='price-high-to-low']";
    private static final String NEWEST_PRICE_SORTING = "//select[@data-test-id='product-list-sort-select-input']//option[@value='newest']";
    private static final String LIST_OF_PRICE = "//div[@class='relative flex mobile:flex-col w-full items-start']/div/span[1]";
    private static final String LIST_OF_NEWEST_PRODUCT = dataTestId("product-badge");
    private static final String PRODUCT_SELECT_INPUT = "//select[@data-test-id='product-list-sort-select-input']//option";
    private static final String BASKETBALL_SHOES_MEN_CATEGORY = "//a[@data-link-name='Basketball']";
    private static final String HATS_ACCESSORIES_MEN_CATEGORY = "//a[@data-link-name='Hats']";

    //search field elements
    public static final String CLEAR_BTN = dataTestId("search-flyout-form-clear");
    public static final String CLOSE_BUTTON = "(//button[@type='button'])[3]";
    public static final String INPUT_FIELD_VISIBILITY = "//div[@class='h-6 w-px bg-neutral-30']";
    public static final String SEARCH_BAR_VISIBILITY = "//div[@class='flex flex-shrink-0 sh items-center w-full h-[104px] lg:h-[120px] bg-neutral-10']";
    public static final String SEARCH_FIELD = dataTestId("search-icon-nav");

    //filter panel
    private static final String AGE_GROUP = "//button[@aria-controls='ageGroup-filter-dropdown']";
    private static final String LITTLE_KIDS_AGE_GROUP = "//label[@for='Little Kids']";

    protected WebElement getPriceLowToHigh() {
        return waitUntilElementToBeVisibleByXpath(PRICE_LOW_TO_HIGH_SORTING);
    }

    protected WebElement getPriceHighToLow() {
        return waitUntilElementToBeVisibleByXpath(PRICE_HIGH_TO_LOW_SORTING);
    }

    protected WebElement getNewestPrice() {
        return waitUntilElementToBeVisibleByXpath(NEWEST_PRICE_SORTING);
    }

    public WebElement collaborationBtn() {
        return waitUntilElementToBeVisibleByXpath(COLLABORATION_BTN);
    }

    public WebElement searchInputField() {
        return waitUntilPresenceOfElementByXpath(SEARCH_INPUT_FIELD);
    }

    public List<WebElement> getListOfPrice() {
        return waitUntilPresenceOfAllElementsByXpath(LIST_OF_PRICE);
    }

    protected List<WebElement> getSortingBtn() {
        return waitUntilPresenceOfAllElementsByXpath(PRODUCT_SELECT_INPUT);
    }

    public List<WebElement> getListNewProduct() {
        return waitUntilPresenceOfAllElementsByCss(LIST_OF_NEWEST_PRODUCT);
    }

    public WebElement getCategory(String category) {
        return waitUntilElementToBeVisibleByXpath(String.format(CATEGORY, category));
    }

    protected WebElement getPopUpMenuSaleWomenAccessories() {
        return waitUntilPresenceOfElementByXpath(POP_UP_MENU_SALE_WOMEN_ACCESSORIES);
    }

    public WebElement getSaleCategory() {
        return waitUntilElementToBeVisibleByXpath(SALE_CATEGORY);
    }

    protected WebElement getAgeGroup() {
        return waitUntilElementToBeClickableByXpath(AGE_GROUP);
    }

    protected WebElement getLittleKidsAgeGroup() {
        return waitUntilElementToBeVisibleByXpath(LITTLE_KIDS_AGE_GROUP);
    }

    protected WebElement getWomenClassicsCategoryBtn() {
        return waitUntilElementToBeVisibleByXpath(WOMEN_CLASSICS_CATEGORY);
    }

    protected WebElement getBoysSuedeCategoryBtn() {
        return waitUntilElementToBeVisibleByXpath(BOYS_SUEDE_CATEGORY);
    }

    protected WebElement getReturnHomePagePumaIcon() {
        return waitUntilElementToBeClickableByCss(RETURN_HOME_PAGE_PUMA_ICON);
    }

    protected WebElement getSelectLocationCloseBtn() {
        return waitUntilElementToBeClickableByCss(SELECT_LOCATION_CLOSE_BTN);
    }

    protected WebElement getCookieCloseBtn() {
        return waitUntilElementToBeClickableByCss(COOKIE_CLOSE_BTN);
    }

    protected WebElement getMenSoccerShoesBtn() {
        return waitUntilElementToBeClickableByCss(SOCCER_SHOES_MEN_CATEGORY);
    }

    protected WebElement getMenBasketballShoesBtn() {
        return waitUntilElementToBeClickableByCss(BASKETBALL_SHOES_MEN_CATEGORY);
    }

    protected WebElement getMenHatsAccessoriesBtn() {
        return waitUntilElementToBeClickableByCss(HATS_ACCESSORIES_MEN_CATEGORY);
    }
}