package pages;

import elements.ShoppingCartElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage extends ShoppingCartElements {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public ShoppingCartPage getCartProductTittle(String number) {
        waitUntilElementToBeVisibleByXpath(String.format(CART_PRODUCT_TITTLE, number)).getText();
        return this;
    }

    public String getNameProductFromOrder(String number) {
        return waitUntilElementToBeVisibleByXpath(String.format(CART_PRODUCT_TITTLE, number)).getText();
    }

    public String getTextCartProductPrice(String number) {
        return getCartProductPrice(number).getText();
    }

    public String getTextCartProductTotalPrice() {
        return getCartProductTotalPrice().getText();
    }

    public ShoppingCartPage clickRemoveSecondProductBtn() {
        getRemoveSecondProductBtn().click();
        return this;
    }

    public ShoppingCartPage clickConfirmBtn() {
        getConfirmBtn().click();
        return this;
    }

//    public ShoppingCartPage clickValueBtn(int amount) {
//        openAmountSelector().get(amount).click();
//        return this;
//    }

    public ShoppingCartPage selectValue(String value) {
        Select A = new Select(driver.findElement(By.xpath(SELECT_VALUE_BTN)));
        A.selectByValue(value);
        return this;
    }

    public ShoppingCartPage clickCheckoutBtn() {
        getCheckoutBtn().click();
        return this;
    }
}