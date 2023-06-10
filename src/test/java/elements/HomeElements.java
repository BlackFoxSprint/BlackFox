package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class HomeElements extends AbstractBasePage {
    public HomeElements(WebDriver driver) {
        super(driver);
    }

    public static final String COLLABORATION_BTN = "//span[contains(text(),'Collaborations')]";
    public static final String SEARCH_FIELD = "//button[@data-test-id='search-icon-nav']";
    public static final String SEARCH_INPUT_FIELD = "//input[@placeholder='SEARCH PUMA.COM']";
    public static final String SEARCH_BTN = "//div[@class='absolute top-2 right-2 flex items-center gap-2 rtl:right-auto rtl:left-2']";
    public static final String MODAL_WINDOW_CLOSE ="//button[@data-test-id='close-btn']";
    public static final String COOKIES_DISMISS ="//div[@class='relative w-4 opacity-100 mr-0 ml-0 rtl:ml-0 rtl:mr-0']";
    public static final String SEARCH_SIMPLE_BTN ="//button[@data-test-id='search-icon-nav']//div[@data-uds-child='icon']";





}
