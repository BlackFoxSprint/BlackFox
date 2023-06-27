package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SportCategoryElements extends AbstractBasePage {

    public SportCategoryElements(WebDriver driver) {
        super(driver);
    }

    private static final String TEAM_SELECT_BTN = "//span[text()='Team']";
    private static final String BMW_MOTORSPORT_CHECKBOX = "//label[@for='BMW M Motorsport']/div";
    private static final String LIST_ITEMS_NAME = "//h3[@class='w-full mobile:text-sm mobile:pr-0 font-bold text-base pr-5 line-clamp-2']";
    private static final String FILTER_BTN = "//span[text()='Filters']";
    private static final String PUMA_LOGO = "//a[@data-link-name='puma-logo']";
    private static final String GET_20_OFF = "//button[@data-test-id='newsletter-sign-up-form-button']/div[@class='relative w-6 opacity-100']";
    private static final String CLOSE_FILTER_BTN = dataTestId("close-filters-btn");
    private static final String GENDER_BTN = "//button[@aria-controls='tabregion-gender']";
    private static final String MEN_CHECKBOX = "//input[@id='Men']/following-sibling::div";
    private static final String CATEGORY_BTN = "//span[text()='Category']";
    private static final String CLOTHING_CHECKBOX = "//input[@id='Clothing']/following-sibling::div";
    private static final String PRICE_BTN = "//button[@data-test-id='undefined-btn']/span[text()='Price']";
    private static final String BLACK_COLOR_BTN = dataTestId("black-btn");
    private static final String SALE_PRICE = dataTestId("sale-price");
    private static final String FULL_PRICE = "//span[@data-test-id='price' and @class='whitespace-nowrap text-base font-bold override:opacity-100']";
    private static final String DESCRIBE_COLOR_FIELD = "h4.text-sm";
    private static final String SIZE_BTN = "//span[text()='Size']";
    private static final String COLOR_BTN = "//button[@data-test-id='undefined-btn']/span[text()='Color']";

    public static String priceXpath(int first, int second) {
        final String xpathPrice = String.format("//input[@id='(%d..%d)']/../div",first,second);
        return xpathPrice;
    }

    protected WebElement getPriceFromToElement(int first, int second) {
        return waitUntilElementToBeClickableByXpath(priceXpath(first,second));
    }

    public WebElement getTeamSelectBtn() {
        return waitUntilElementToBeVisibleByXpath(TEAM_SELECT_BTN);
    }

    public WebElement getBMWMotorsportCheckBox() {
        return waitUntilElementToBeVisibleByXpath(BMW_MOTORSPORT_CHECKBOX);
    }

    protected WebElement getFilterBtnElement() {
        return waitUntilElementToBeVisibleByXpath(FILTER_BTN);
    }

    protected WebElement getListItemsName() {
        return waitUntilElementToBeVisibleByXpath(LIST_ITEMS_NAME);
    }

    protected WebElement get20_OffCloseBtn() {
        return waitUntilElementToBeVisibleByXpath(GET_20_OFF);
    }

    protected WebElement getCloseFilterBtn() {
        return waitUntilElementToBeVisibleByCss(CLOSE_FILTER_BTN);
    }

    protected WebElement getGenderBtn() {
        return waitUntilElementToBeVisibleByXpath(GENDER_BTN);
    }

    protected WebElement getBlackColorBtn() {
        return waitUntilElementToBeVisibleByCss(BLACK_COLOR_BTN);
    }

    protected WebElement getMenCheckBox() {
        return waitUntilElementToBeVisibleByXpath(MEN_CHECKBOX);
    }

    protected WebElement getCategoryBtn() {
        return waitUntilElementToBeVisibleByXpath(CATEGORY_BTN);
    }

    public WebElement colorBtnElement() {
        return waitUntilElementToBeVisibleByXpath(COLOR_BTN);
    }

    public WebElement getClothingElement() {
        return waitUntilElementToBeClickableByXpath(CLOTHING_CHECKBOX);
    }

    public WebElement getPriceElement() {
        return waitUntilElementToBeClickableByXpath(PRICE_BTN);
    }

    public WebElement sizeElement() {
        return waitUntilElementToBeClickableByXpath(SIZE_BTN);
    }

    public WebElement describeColorElement() {
        return waitUntilElementToBeClickableByCss(DESCRIBE_COLOR_FIELD);
    }

    public List<WebElement> listSalePriceElements() {
        return waitUntilPresenceOfAllElementsByCss(SALE_PRICE);
    }

    public List<WebElement> listFullPriceElements() {
        return waitUntilPresenceOfAllElementsByXpath(FULL_PRICE);
    }

    public WebElement pumaLogo() {
        return waitUntilElementToBeVisibleByXpath(PUMA_LOGO);
    }

    public List<WebElement> listProductNames() {
        return listWaitUntilElementsToBeVisibleByXpath(LIST_ITEMS_NAME);
    }
}
