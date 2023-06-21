package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

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
    public static final String CLOSE_FILTER_BTN = "//button[@data-test-id='close-filters-btn']";
    public static final String GENDER_BTN = "//span[text()='Gender']";
    public static final String CLOSE_GENDER_BTN = "//button[@aria-controls='tabregion-gender']";
    public static final String MEN_CHECKBOX = "//input[@id='Men']/following-sibling::div";
    public static final String CATEGORY_BTN = "//span[text()='Category']";
    public static final String CLOTHING_CHECKBOX = "//input[@id='Clothing']/following-sibling::div";
    public static final String PRICE_BTN = "//button[text()='Price']";
    public static final String PRICE_50_100 = "//input[@id='(50..100)']";
    public static final String  = "";
}
