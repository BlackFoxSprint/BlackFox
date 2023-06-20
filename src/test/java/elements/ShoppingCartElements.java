package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCartElements extends AbstractBasePage {
    public ShoppingCartElements(WebDriver driver) {
        super(driver);
    }

    public static final String VALUE_BTN = "//select[@id='product-list-sort-select']//option";
    public static final String SELECT_VALUE_BTN = "(//select[@data-test-id='quantity-select-input'])[1]";
    public static final String CART_PRODUCT_TITTLE = "(//h3[@data-test-id='cart-product-title'])[%s]";
    public static final String REMOVE_SECOND_PRODUCT_BTN = "(//button[@data-test-id='remove-product-button'])[2]";
    public static final String CART_PRODUCT_PRICE = "(//p[@class='flex flex-col md:mb-5 text-left xs:text-right'])[%s]";
    public static final String CART_PRODUCT_TOTAL_PRICE = "//p[@data-test-id='estimated-total']";
    public static final String CONFIRM_BTN = "//button[@data-test-id='confirm-button']";

    public List<WebElement> openAmountSelector() {
        return waitUntilPresenceOfAllElementsByXpath(VALUE_BTN);
    }
}