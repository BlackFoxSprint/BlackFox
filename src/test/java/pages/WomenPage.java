package pages;

import elements.WomenElements;
import org.openqa.selenium.WebDriver;

public class WomenPage extends WomenElements {

    public WomenPage(WebDriver driver) {
        super(driver);
    }

    public WomenPage clickMayzeStachShoes() {
        getMayzeStackShoesBtn().click();
        return this;
    }
}