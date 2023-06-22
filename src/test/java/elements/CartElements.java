package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartElements extends AbstractBasePage {

    public CartElements(WebDriver driver) {
        super(driver);
    }

    //cart page elements
    protected final String SALE_PRICE_FIELD = dataTestId("item-sale-price-pdp");
    protected final String PRICE_FIELD = dataTestId("item-price-pdp");
    protected final String SIZE_INPUT = dataTestId("size");//("[data-content='size-value']");
    protected final String ADD_TO_CART_BTN = dataTestId("pdp-add-to-cart");

    //Modal window Added to cart elements
    protected final String SALE_PRICE_ON_MODAL_WINDOW_ADDED_TO_CART = dataTestId("item-price");
    protected final String PRICE_ON_MODAL_WINDOW_ADDED_TO_CART = dataTestId("item-price-base");
    protected final String VIEW_CART_AND_CHECKOUT_ON_MODAL_WINDOW_ADDED_TO_CART = dataTestId("minicart-cart-link");

    public WebElement getViewCartAndCheckoutOnModalWindowBtn() {
        return waitUntilElementToBeClickableByCss(VIEW_CART_AND_CHECKOUT_ON_MODAL_WINDOW_ADDED_TO_CART);
    }
}
