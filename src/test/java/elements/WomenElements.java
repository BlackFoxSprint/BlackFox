package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenElements extends AbstractBasePage {
    public WomenElements(WebDriver driver) {
        super(driver);
    }

    public static final String CALI_WEDGE_WOMEN_SNEAKERS = "(//h3[contains(text(),'Cali Wedge Women')])[1]";

    public WebElement getCaliWedgeWomenSneakersBtn() {
        return waitUntilElementToBeClickableByXpath(CALI_WEDGE_WOMEN_SNEAKERS);
    }
}
