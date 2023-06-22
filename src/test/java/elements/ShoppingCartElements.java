package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartElements extends AbstractBasePage {

    public ShoppingCartElements(WebDriver driver) {
        super(driver);
    }

    public static final String SELECT_VALUE_BTN = "(//select[@data-test-id='quantity-select-input'])[1]";
    public static final String CART_PRODUCT_TITTLE = "(//h3[@data-test-id='cart-product-title'])[%s]";
    private static final String REMOVE_SECOND_PRODUCT_BTN = "(//button[@data-test-id='remove-product-button'])[2]";
    private static final String CART_PRODUCT_PRICE = "(//span[@data-test-id='item-price'])[%s]";
    private static final String CART_PRODUCT_TOTAL_PRICE = dataTestId("estimated-total");
    private static final String CONFIRM_BTN = dataTestId("confirm-button");
    private final String CHECKOUT_BTN = dataTestId("cart-summary-checkout");
    public static final String VALUE_BTN = "(//select[@data-test-id='quantity-select-input'])[%s]";

    protected WebElement getRemoveSecondProductBtn() {
        return waitUntilElementToBeClickableByXpath(REMOVE_SECOND_PRODUCT_BTN);
    }
  
    protected WebElement getCartProductTotalPrice() {
        return waitUntilElementToBeClickableByCss(CART_PRODUCT_TOTAL_PRICE);
    }

    protected WebElement getCartProductPrice(String number) {
        return waitUntilElementToBeVisibleByXpath(String.format(CART_PRODUCT_PRICE, number));
    }
  
    protected WebElement getConfirmBtn() {
       return waitUntilElementToBeVisibleByCss(CONFIRM_BTN);
    }
  
    protected WebElement getCheckoutBtn() {
        return waitUntilElementToBeClickableByCss(CHECKOUT_BTN);
    }
}