package pages;

import elements.MyShopingCartElements;
import org.openqa.selenium.WebDriver;

public class MyShopingCartPage extends MyShopingCartElements {

    public MyShopingCartPage(WebDriver driver) {
        super(driver);
    }

    public double getPriceOnCartPage(){
        return Double.parseDouble(getPriceFieldOnShopingCart()
                .getText()
                .replace("$",""));
    }

    public double getSalePriceOnShopingCart(){
        return Double.parseDouble(getSalePriceFieldOnShopingCart()
                .getText()
                .replace("$",""));
    }
}
