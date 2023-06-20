package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeElements extends AbstractBasePage {
    public HomeElements(WebDriver driver) {
        super(driver);
    }

    private static final String CLICK_HERE_TO_EXPLORE_CAREERS = "//section//a[text() = 'CLICK HERE']";

    public WebElement getClickHereToExploreCareers() {
        return waitUntilElementToBeVisibleByXpath(CLICK_HERE_TO_EXPLORE_CAREERS);
    }

}
