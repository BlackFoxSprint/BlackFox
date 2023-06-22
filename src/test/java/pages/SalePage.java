package pages;

import base.CommonActions;
import elements.SaleElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SalePage extends SaleElements {

    public SalePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getListSalePrice() {
        return CommonActions.getProductListByCssLocator(LIST_SALE_PRICE, driver);
    }

    public List<WebElement> getListPrice() {
        return CommonActions.getProductListByCssLocator(LIST_PRICE, driver);
    }

    public WebElement getProductItem(){
        return waitUntilElementToBeClickableByXpath(LIST_PRICE);
    }

    public SalePage clikProduktItem(){
        getProductItem().click();
        return this;
    }
}
