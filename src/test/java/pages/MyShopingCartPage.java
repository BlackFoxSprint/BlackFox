package pages;

import elements.MyShoppingCartElements;
import org.openqa.selenium.WebDriver;

public class MyShopingCartPage extends MyShoppingCartElements {

    public MyShopingCartPage(WebDriver driver) {
        super(driver);
    }

    public double getPriceOnCartPage(){
        return Double.parseDouble(getPriceFieldOnShoppingCart()
                .getText()
                .replace("$",""));
    }

    public double getSalePriceOnShopingCart(){
        return Double.parseDouble(getSalePriceFieldOnShoppingCart()
                .getText()
                .replace("$",""));
    }
}
