package Tests;

import base.AbstractBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SportCategoryPage;

import static base.CommonActions.moveCursor;
import static org.testng.AssertJUnit.assertTrue;

public class AllCategoriesTest extends AbstractBaseTest {

    @Test
    public void checkAllCategories() {

        HomePage homePage = new HomePage(driver);
        SportCategoryPage productPage = new SportCategoryPage(driver);

        homePage.clickSelectLocationCloseBtn()
                .clickCookieCloseBtn()
                .clickSportBtn();

        moveCursor(productPage.pumaLogo(), driver);

        productPage.clickFilterBtn()
                .clickTeamBtn()
                .clickBmwMotorSportBtn()
                .closeFilter()
                .closeDiscount();

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("BMW M Motorsport"));

        productPage.clickFilterBtn()
                .clickGenderBtn()
                .chooseMenCheckbox()
                .closeGenderBtn()
                .clickCategoryBtn()
                .clickClothingBtn()
                .closeFilter();

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("Men's") || x.getText().contains(  "Monoch"));

        productPage.clickFilterBtn()
                .clickPriceBtn()
                .choosePrice50_100()
                .closeFilter()
    }
}
