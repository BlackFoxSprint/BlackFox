package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class HomeElements extends AbstractBasePage {
    public HomeElements(WebDriver driver) {
        super(driver);
    }

    public static final String ACCOUNT_BUTTON = "//div//button[@data-test-id='account-button']";
    public static final String REGISTER_HERE_BUTTON_ON_ACCOUNT_MENU = "//div//a[@data-test-id='register-button']";
    public static final String RETURN_HOME_PAGE_PUMA_ICON = "//a[@data-test-id='main-nav-home-link']";
    public static final String LOGIN_BUTTON_ON_ACCOUNT_MENU = "//a[@data-test-id='login-button']";
}
