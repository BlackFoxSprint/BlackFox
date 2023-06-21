package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCartElements extends AbstractBasePage {
    public ProductCartElements(WebDriver driver) {
        super(driver);
    }
    
    public static final String SIZE_VALUE = "(//span[@data-content='size-value'])[1]";
    public static final String ADD_TO_CART_BTN = dataTestId("pdp-add-to-cart");
    public static final String VIEW_CART_BTN = dataTestId("minicart-cart-link");
    public static final String SIZE_FIELD = "(//label[@data-disabled='false'])[1]//span[@data-content='size-value']";
    
    public WebElement getAddToCartBtn() {
        return waitUntilElementToBeClickableByCss(ADD_TO_CART_BTN);
    }
}
