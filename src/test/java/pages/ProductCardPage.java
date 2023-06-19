package pages;

import elements.ProductCartElements;
import org.openqa.selenium.WebDriver;

public class ProductCardPage extends ProductCartElements {
    public ProductCardPage(WebDriver driver) {
        super(driver);
    }

    public ProductCardPage clickAddToCart() {
        scrollForElement(getAddToCartBtn(), driver);
        getAddToCartBtn().click();
        return this;
    }

    public ProductCardPage clickViewCart() {
        waitUntilElementToBeClickableByXpath(VIEW_CART_BTN).click();
        return this;
    }

    public ProductCardPage clickSizeOfShoesBtn() {
        waitUntilElementToBeClickableByXpath(SIZE_VALUE).click();
        return this;
    }

    public ProductCardPage selectSizeOfClothing() {
        waitUntilPresenceOfElementByXpath(SIZE_FIELD).click();
        return this;
    }
}
