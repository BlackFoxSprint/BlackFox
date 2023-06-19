package pages;

import elements.MenElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenPage extends MenElements {

    public MenPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBmwMotorSportBtn() {
        return waitUntilElementToBeVisibleByXpath(BMW_MOTOR_SPORT_POLO);
    }

    public MenPage clickBmwMotorSportBtn() {
        getBmwMotorSportBtn().click();
        return this;
    }
}
