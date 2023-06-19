package pages;

import elements.CartElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static base.CommonActions.scrollToElement;

public class CartPage extends CartElements {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSalePriceField() {
        return waitUntilElementToBeVisibleByCss(SALE_PRICE_FIELD);
    }

    public double getSalePriceOnCartPage() {
        return Double.parseDouble(getSalePriceField()
                .getText()
                .replace("$", ""));
    }

    public WebElement getPriceField() {
        return waitUntilElementToBeVisibleByCss(PRICE_FIELD);
    }

    public double getPriceOnCartPage() {
        return Double.parseDouble(getPriceField()
                .getText()
                .replace("$", ""));
    }

    public List<WebElement> getSizeList() {
        return waitUntilPresenceOfAllElementsByCss(SIZE_INPUT);
    }

    public double getSalePriceOnAddToCart() {
        return Double.parseDouble(waitUntilPresenceOfElementByCss(SALE_PRICE_ON_MODAL_WINDOW_ADDED_TO_CART)
                .getText()
                .replace("$", ""));
    }

    public double getPriceOnAddToCart() {
        return Double.parseDouble(waitUntilPresenceOfElementByCss(PRICE_ON_MODAL_WINDOW_ADDED_TO_CART)
                .getText()
                .replace("$", ""));
    }

    public CartPage clickViewCartAndCheckoutBtn() {
        scrollToElement(getViewCartAndCheckoutOnModalWindowBtn(), driver);
        getViewCartAndCheckoutOnModalWindowBtn().click();
        return this;
    }
}
