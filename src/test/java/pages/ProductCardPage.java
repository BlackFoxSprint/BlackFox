package pages;

import elements.ProductCartElements;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.scrollByPixel;

public class ProductCardPage extends ProductCartElements {
    public ProductCardPage(WebDriver driver) {
        super(driver);
    }

    public ProductCardPage clickAddToCart() {
        scrollToElement(getAddToCartBtn(), driver);
        getAddToCartBtn().click();
        return this;
    }

    public ProductCardPage clickViewCart() {
        waitUntilElementToBeClickableByCss(VIEW_CART_BTN).click();
        return this;
    }

    public ProductCardPage clickSizeOfShoesBtn() {
        waitUntilElementToBeClickableByXpath(SIZE_FIELD).click();
        return this;
    }

    public ProductCardPage selectSizeOfClothing() {
        waitUntilPresenceOfElementByXpath(SIZE_FIELD).click();
        return this;
    }
}
