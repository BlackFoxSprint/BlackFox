package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenElements extends AbstractBasePage {

    public WomenElements(WebDriver driver) {
        super(driver);
    }

    private static final String CALI_WEDGE_MIX_SNEAKERS = "//h3[contains(text(),'Wedge Mix')]";

    protected WebElement getCaliWedgeMixSneakersBtn() {
        return waitUntilElementToBeClickableByXpath(CALI_WEDGE_MIX_SNEAKERS);
    }
}
