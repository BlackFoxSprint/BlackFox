package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyShoppingCartElements extends AbstractBasePage {

    public MyShoppingCartElements(WebDriver driver) {
        super(driver);
    }

    protected final String PRICE_FIELD_ON_SHOPPING_CART = dataTestId("item-price-base");
    protected final String SALE_PRICE_FIELD_ON_SHOPPING_CART = dataTestId("item-price");
    protected final String SUBTOTAL_FIELD_ON_SHOPPING_CART = dataTestId("subtotal");

    public WebElement getPriceFieldOnShoppingCart() {
        return waitUntilElementToBeVisibleByCss(PRICE_FIELD_ON_SHOPPING_CART);
    }

    public WebElement getSalePriceFieldOnShoppingCart() {
        return waitUntilElementToBeVisibleByCss(SALE_PRICE_FIELD_ON_SHOPPING_CART);
    }

    public WebElement getSubtotalFieldOnShopingCart() {
        return waitUntilElementToBeVisibleByCss(SUBTOTAL_FIELD_ON_SHOPPING_CART);
    }
}
