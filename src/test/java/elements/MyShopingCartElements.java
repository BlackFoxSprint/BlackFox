package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyShopingCartElements extends AbstractBasePage {

    public MyShopingCartElements(WebDriver driver) {
        super(driver);
    }

    protected final String PRICE_FIELD_ON_SHOPING_CART = dataTestId("item-price-base");
    protected final String SALE_PRICE_FIELD_ON_SHOPING_CART = dataTestId("item-price");
    protected final String SUBTOTAL_FIELD_ON_SHOPING_CART = dataTestId("subtotal");

    public WebElement getPriceFieldOnShopingCart() {
        return waitUntilElementToBeVisibleByCss(PRICE_FIELD_ON_SHOPING_CART);
    }

    public WebElement getSalePriceFieldOnShopingCart() {
        return waitUntilElementToBeVisibleByCss(SALE_PRICE_FIELD_ON_SHOPING_CART);
    }

    public WebElement getSubtotalFieldOnShopingCart() {
        return waitUntilElementToBeVisibleByCss(SUBTOTAL_FIELD_ON_SHOPING_CART);
    }
}
