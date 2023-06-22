package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyShoppingCartElements extends AbstractBasePage {

    public MyShoppingCartElements(WebDriver driver) {
        super(driver);
    }

    private final String PRICE_FIELD_ON_SHOPPING_CART = dataTestId("item-price-base");
    private final String SALE_PRICE_FIELD_ON_SHOPPING_CART = dataTestId("item-price");

    protected WebElement getPriceFieldOnShoppingCart() {
        return waitUntilElementToBeVisibleByCss(PRICE_FIELD_ON_SHOPPING_CART);
    }

    protected WebElement getSalePriceFieldOnShoppingCart() {
        return waitUntilElementToBeVisibleByCss(SALE_PRICE_FIELD_ON_SHOPPING_CART);
    }
}
