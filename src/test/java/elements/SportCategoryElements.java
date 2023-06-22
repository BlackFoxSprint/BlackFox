package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SportCategoryElements extends AbstractBasePage {
    public SportCategoryElements(WebDriver driver) {
        super(driver);
    }

    public static final String TEAM_SELECT_BTN = "//span[text()='Team']";
    public static final String BMW_MOTORSPORT_CHECKBOX = "//label[@for='BMW M Motorsport']/div[@data-checkbtn]";
    public static final String MOTORSPORT_NAME = "//h3[@class='w-full mobile:text-sm mobile:pr-0 font-bold text-base pr-5 line-clamp-2']";
    public static final String FILTER_BTN = "//span[text()='Filters']";
    public static final String PUMA_LOGO = "//a[@data-link-name='puma-logo']";
    public static final String GET_20_OFF = "//button[@data-test-id='newsletter-sign-up-form-button']/div[@class='relative w-6 opacity-100']";
    public static final String CLOSE_FILTER_BTN = dataTestId("close-filters-btn");
    public static final String GENDER_BTN = "//span[text()='Gender']";
    public static final String CLOSE_GENDER_BTN = "//button[@aria-controls='tabregion-gender']";
    public static final String MEN_CHECKBOX = "//input[@id='Men']/following-sibling::div";
    public static final String CATEGORY_BTN = "//span[text()='Category']";
    public static final String CLOTHING_CHECKBOX = "//input[@id='Clothing']/following-sibling::div";
    public static final String PRICE_BTN = "//button[@data-test-id='undefined-btn']/span[text()='Price']";
    public static final String COLOR_BTN = "//button[@data-test-id='undefined-btn']/span[text()='Color']";
    public static final String PRICE_50_100 = "//input[@id='(50..100)']/../div";
    public static final String BLACK_COLOR_BTN = dataTestId("black-btn");
    public static final String SALE_PRICE = dataTestId("sale-price");
    public static final String FULL_PRICE = "//span[@data-test-id='price' and @class='whitespace-nowrap text-base font-bold override:opacity-100']";
    public static final String DESCRIBE_COLOR_FIELD = "h4.text-sm";
    public static final String SIZE_BTN = "//span[text()='Size']";

    public WebElement colorBtnElement() {
        return waitUntilElementToBeVisibleByXpath(COLOR_BTN);
    }

    public WebElement clothingElement() {
        return waitUntilElementToBeClickableByXpath(CLOTHING_CHECKBOX);
    }

    public WebElement priceElement() {
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
        return listWaitUntilElementsToBeVisibleByXpath(MOTORSPORT_NAME);
    }
}
