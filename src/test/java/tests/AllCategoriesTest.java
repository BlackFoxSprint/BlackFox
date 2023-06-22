package Tests;

import base.AbstractBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SportCategoryPage;

import static base.CommonActions.*;
import static org.testng.AssertJUnit.assertTrue;

public class AllCategoriesTest extends AbstractBaseTest {

    @Test
    public void checkAllCategories() {

        HomePage homePage = new HomePage(driver);
        SportCategoryPage productPage = new SportCategoryPage(driver);

        homePage
                .clickSelectLocationCloseBtn()
                .clickCookieCloseBtn()
                .clickSportBtn();

        moveCursor(productPage.pumaLogo(), driver);

        productPage
                .clickFilterBtn()
                .clickTeamBtn()
                .clickBmwMotorSportBtn()
                .closeFilter()
                .closeDiscount();

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("BMW M Motorsport"));

        productPage
                .clickFilterBtn()
                .clickGenderBtn()
                .chooseMenCheckbox()
                .closeGenderBtn()
                .clickCategoryBtn();

        scrollToElement(productPage.clothingElement(), driver);

        productPage
                .clickClothingBtn()
                .closeFilter();

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("Men's") || x.getText().contains("Monoch"));

        productPage
                .clickFilterBtn();

        scrollToElement(productPage.sizeElement(), driver);

        productPage
                .clickPriceBtn();

        scrollToElement(productPage.priceElement(), driver);

        productPage
                .choosePrice50_100()
                .closeFilter();

        for (WebElement x : productPage.listSalePriceElements()) {
            double c = Double.valueOf(x.getText().replace("$", ""));
            assertTrue(c >= 50 && c <= 100);
        }
        for (WebElement x : productPage.listFullPriceElements()) {
            double c = Double.valueOf(x.getText().replace("$", ""));
            assertTrue(c >= 50 && c <= 100);
        }

        productPage
                .clickFilterBtn();

        scrollToElement(productPage.sizeElement(), driver);

        productPage
                .clickColorBtn();

        scrollToElement(productPage.colorBtnElement(), driver);

        productPage
                .clickBlackColorBtn()
                .closeFilter()
                .clickListNameItemsBtn();

        assertTrue(productPage.describeColorElement().getText().contains("Black"));
    }
}
