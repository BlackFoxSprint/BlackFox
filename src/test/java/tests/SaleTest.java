package tests;

import base.AbstractBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CartPage;
import pages.HomePage;
import pages.SalePage;

import java.util.List;

import static base.CommonActions.moveCursor;

public class SaleTest extends AbstractBaseTest {

    @Test
    public void saleCheckTest() {
        HomePage homePage = new HomePage(driver);
        SalePage salePage = new SalePage(driver);
        CartPage cartPage = new CartPage(driver);
        SoftAssert softAssert = new SoftAssert();

        homePage
                .clickSelectLocationCloseBtn()
                .clickCookieCloseBtn();
        moveCursor(homePage.getCategory("sale"), driver);
        homePage.clickPopUpMenuSaleWomenAccessories();

        List<WebElement> listSalePrice = salePage.getListSalePrice();
        List<WebElement> listPrice = salePage.getListPrice();

        for (int i = 0; i <= listPrice.size() - 1; i++) {
            double salePrice = Double.parseDouble(listSalePrice.get(i)
                    .getText()
                    .replace("$", ""));
            double price = Double.parseDouble(listPrice.get(i)
                    .getText()
                    .replace("$", ""));

            softAssert.assertTrue(salePrice < price, "Compare price in list items for" + i + "element" );
        }

        double salePriceForSelectedItem = Double.parseDouble(listSalePrice
                .get(listSalePrice.size() - 1)
                .getText()
                .replace("$", ""));

        listSalePrice
                .get(listSalePrice.size() - 1)
                .click();

        double salePriceInCart = cartPage.getSalePriceOnCartPage();

        softAssert.assertTrue(salePriceInCart < cartPage.getPriceOnCartPage(),
                "Compare the price with the discounted price on the product card");
        softAssert.assertEquals(salePriceForSelectedItem, cartPage.getSalePriceOnCartPage(),
                "Compare the sale price on the product card with the price listed for that item");
        softAssert.assertAll();
    }
}

