package pages;

import elements.MenElements;
import org.openqa.selenium.WebDriver;

public class MenPage extends MenElements {

    public MenPage(WebDriver driver) {
        super(driver);
    }

    public MenPage clickBmwMotorSportBtn() {
        getBmwMotorSportBtn().click();
        return this;
    }
}