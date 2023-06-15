package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class HomeElements extends AbstractBasePage {

    public HomeElements(WebDriver driver) {
        super(driver);
    }

    //homepage elements
    public static final String RETURN_HOME_PAGE_PUMA_ICON = "//a[@data-test-id='main-nav-home-link']";
    public static final String ACCOUNT_ICON_BUTTON = "//button[@data-test-id='account-button']";

    //account menu elements
    public static final String LOGIN_BUTTON_ON_ACCOUNT_MENU = "//a[@data-test-id='login-button']";
    public static final String REGISTER_HERE_BUTTON = "//a[@data-test-id='register-button']";
}
