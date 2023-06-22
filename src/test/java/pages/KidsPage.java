package pages;

import elements.KidsElements;
import org.openqa.selenium.WebDriver;

public class KidsPage extends KidsElements {
    public KidsPage(WebDriver driver) {
        super(driver);
    }
    public KidsPage clickSuedeClassicsLfsKidsShoes() {
        getSuedeClassicsLfsKidsShoes().click();
        return this;
    }
}
