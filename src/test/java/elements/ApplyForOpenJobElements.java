package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplyForOpenJobElements extends AbstractBasePage {

    public ApplyForOpenJobElements(WebDriver driver) {
        super(driver);
    }

    private static final String APPLY_NOW_BUTTON = "//a[@class='btn btn-cta']";
    private static final String ENTER_USERS_EMAIL = "//input[@data-automation-id='email']";
    private static final String ENTER_USERS_PASSWORD = "//input[@data-automation-id='password']";

    public WebElement getApplyNowBtn() {
        return waitUntilElementToBeClickableByXpath(APPLY_NOW_BUTTON);
    }

    public WebElement getInputUsersEmailToApply() {
        return waitUntilElementToBeClickableByXpath(ENTER_USERS_EMAIL);
    }

    public WebElement getInputUsersPasswordToApply() {
        return waitUntilElementToBeClickableByXpath(ENTER_USERS_PASSWORD);
    }
}
