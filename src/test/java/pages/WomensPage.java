package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomensPage extends AbstractBasePage {

    public WomensPage(WebDriver driver) {
        super(driver);
    }

    public WebElement сaliWedgeWomensSneakers() {
        return waitUntilElementToBeClickableByXpath("//h3[contains(text(),'Cali Wedge Women')])[1]");
    }

    public WomensPage clickCaliWedgeWomensSneakers() {
        сaliWedgeWomensSneakers().click();
        return this;
    }

    public WomensPage getSizeOfShoes() {
        waitUntilElementToBeClickableByXpath("(//span[@data-content='size-value'])[4]").click();
        return this;
    }

    public WomensPage clickAddToCart() {
        waitUntilElementToBeClickableByXpath("//button[@data-test-id='pdp-add-to-cart']").click();
        return this;
    }
}
