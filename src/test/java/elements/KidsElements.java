package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KidsElements extends AbstractBasePage {

    public KidsElements(WebDriver driver) {
        super(driver);
    }

    private static final String SUEDE_CLASSICS_LFS_KIDS_SHOES = "//h3[contains(text(),'Suede Classic LFS')]";

    protected WebElement getSuedeClassicsLfsKidsShoes() {
        return waitUntilElementToBeClickableByXpath(SUEDE_CLASSICS_LFS_KIDS_SHOES);
    }
}
