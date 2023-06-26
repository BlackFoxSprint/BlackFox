package Tests;

import base.AbstractBaseTest;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

import java.util.List;

public class SortingMensShoesTest extends AbstractBaseTest {

    @Test
    @Description("/BLAC-9/ TestCase 2. Check the sorting men's shoes.")
    public void checkSortingMenShoes() {
        HomePage homePage = new HomePage(driver);
        SoftAssert softAssert = new SoftAssert();

        homePage
                .clickSelectLocationCloseBtn()
                .clickCookieCloseBtn()
                .moveToCategory("Men")
                .clickMenSoccerShoesBtn()
                .clickSortingBtn(1)
                .clickPriceLowToHigh();

        List<WebElement> listPrice = homePage.getListOfPrice();

        for (int i = 0; i < listPrice.size() - 1; i++) {
            double priceFirst = Double.parseDouble(listPrice.get(i).getText().replace("$", ""));
            double priceSecond = Double.parseDouble(listPrice.get(i + 1).getText().replace("$", ""));

            softAssert.assertTrue(priceFirst <= priceSecond);
        }

        homePage
                .moveToCategory("Men")
                .clickMenBasketballShoesBtn()
                .clickSortingBtn(2)
                .clickPriceHowToLow();

        List<WebElement> newListPrice = homePage.getListOfPrice();

        for (int i = 0; i < newListPrice.size() - 1; i++) {
            double priceFirst = Double.parseDouble(newListPrice.get(i).getText().
                    replace("$", "").replace(",", ""));
            double priceSecond = Double.parseDouble(newListPrice.get(i + 1).getText().replace("$", ""));

            softAssert.assertTrue(priceFirst >= priceSecond);
        }

        homePage
                .moveToCategory("Men")
                .clickMenHatsAccessoriesBtn()
                .clickSortingBtn(3)
                .clickNewestPrice();

        for (WebElement newProduct : homePage.getListNewProduct()) {
            assertTrue(newProduct.getText().contains("NEW"));
            softAssert.assertTrue(newProduct.getText().contains("NEW"));
            softAssert.assertAll();
        }
    }
}