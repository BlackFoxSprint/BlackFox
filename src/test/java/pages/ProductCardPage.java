package pages;

import elements.ProductCartElements;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.scrollByPixel;

public class ProductCardPage extends ProductCartElements {
    public ProductCardPage(WebDriver driver) {
        super(driver);
    }

    public ProductCardPage clickAddToCart() {
        scrollForElement(getAddToCartBtn(), driver);
        scrollByPixel(driver, "-100");
        getAddToCartBtn().click();
        return this;
    }

    public ProductCardPage clickViewCart() {
        getViewCart().click();
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
