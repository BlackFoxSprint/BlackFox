package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCartElements extends AbstractBasePage {
    public ProductCartElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddToCartBtn() {
        return waitUntilElementToBeClickableByXpath(ADD_TO_CART_BTN);
    }
    public static final String SIZE_VALUE = "(//span[@data-content='size-value'])[1]";
    public static final String ADD_TO_CART_BTN = "//button[@data-test-id='pdp-add-to-cart']";
    public static final String VIEW_CART_BTN = "//a[@data-test-id='minicart-cart-link']";
    public static final String SIZE_FIELD = "(//label[@data-disabled='false'])[1]//span[@data-content='size-value']";
}
