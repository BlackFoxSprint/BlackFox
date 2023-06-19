package tests;

import base.AbstractBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenPage;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class SortingMensShoesTest extends AbstractBaseTest {
    @Test
    public void checkSortingMenShoes() {
        HomePage homePage = new HomePage(driver);
        MenPage menPage = new MenPage(driver);

        homePage
                .clickSelectLocationCloseBtn()
                .clickCookieCloseBtn()
                .moveToCategory("Men")
                .clickMenSoccerShoesBtn()
                .clickSortingBtn(1)
                .clickPriceLowToHigh();

        List<WebElement> listPrice = homePage.getListOfPrice();

        for (int i = 0; i < listPrice.size() - 1; i++) {

            double priceFirst = Double.parseDouble(listPrice.get(i)
                    .getText()
                    .replace("$", ""));

            double priceSecond = Double.parseDouble(listPrice.get(i + 1)
                    .getText()
                    .replace("$", ""));
//            System.out.println("Price first: " + priceFirst + ", Price next: " + priceSecond);
            assertTrue(priceFirst <= priceSecond);
        }
        homePage
                .moveToCategory("Men")
                .clickMenBasketballShoesBtn()
                .clickSortingBtn(2)
                .clickPriceHowToLow();

        List<WebElement> newListPrice = homePage.getListOfPrice();

        for (int i = 0; i < newListPrice.size() - 1; i++) {

            double priceFirst = Double.parseDouble(newListPrice.get(i)
                    .getText()
                    .replace("$", "")
                    .replace(",", ""));

            double priceSecond = Double.parseDouble(newListPrice.get(i + 1)
                    .getText()
                    .replace("$", ""));
//            System.out.println("Price first: " + priceFirst + ", Price next: " + priceSecond);
            assertTrue(priceFirst >= priceSecond);
        }
        homePage
                .moveToCategory("Men")
                .clickMenHatsAccessoriesBtn()
                .clickSortingBtn(3)
                .clickNewestPrice();

        assertTrue();

    }
}
