package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplyForOpenJobElements extends AbstractBasePage {

    public ApplyForOpenJobElements(WebDriver driver) {
        super(driver);
    }

    private static final String APPLY_NOW_BUTTON = "//a[@class='btn btn-cta']";
    private static final String ENTER_USERS_EMAIL = dataAutomationId("email");
    private static final String ENTER_USERS_PASSWORD = dataAutomationId("password");

    protected WebElement getApplyNowBtn() {
        return waitUntilElementToBeClickableByXpath(APPLY_NOW_BUTTON);
    }

    protected WebElement getInputUsersEmailToApply() {
        return waitUntilElementToBeClickableByCss(ENTER_USERS_EMAIL);
    }

    protected WebElement getInputUsersPasswordToApply() {
        return waitUntilElementToBeClickableByCss(ENTER_USERS_PASSWORD);
    }
}
