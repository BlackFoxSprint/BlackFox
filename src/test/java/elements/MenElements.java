package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenElements extends AbstractBasePage {

    public MenElements(WebDriver driver) {
        super(driver);
    }

    private static final String BMW_MOTOR_SPORT_POLO = "(//h3[contains(text(),'BMW M')]/..)[1]";

    protected WebElement getBmwMotorSportBtn() {
        return waitUntilElementToBeVisibleByXpath(BMW_MOTOR_SPORT_POLO);
    }
}