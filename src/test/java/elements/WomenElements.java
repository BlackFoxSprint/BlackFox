package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenElements extends AbstractBasePage {

    public WomenElements(WebDriver driver) {
        super(driver);
    }

    private static final String MAYZE_STACK_SHOES = "//h3[contains(text(),'Mayze Stack Casual')]";

    protected WebElement getMayzeStackShoesBtn() {
        return waitUntilElementToBeClickableByXpath(MAYZE_STACK_SHOES);
    }
}
