package tests;

import base.AbstractBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SportCategoryPage;

import static base.CommonActions.*;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AllCategoriesTest extends AbstractBaseTest {

    @Test
    public void checkAllCategories() {

        HomePage homePage = new HomePage(driver);
        SportCategoryPage productPage = new SportCategoryPage(driver);

        int firstPrice = 50, secondPrice = 100;
//                Please, use only these digit pairs:
//        0-25, 25-50, 50-100, 100-150, 150-200,

//              200-9999(it means the price is $200 and more);

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

        scrollToElement(productPage.getClothingElement(), driver);

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

        scrollToElement(productPage.getPriceElement(), driver);

        productPage
                .clickPriceFromTo(firstPrice, secondPrice);

        productPage.closeFilter();

        for (WebElement x : productPage.listSalePriceElements()) {
            double c = Double.parseDouble(x.getText().replace("$", ""));
            assertTrue(c >= firstPrice && c <= secondPrice);
        }
        for (WebElement x : productPage.listFullPriceElements()) {
            double c = Double.parseDouble(x.getText().replace("$", ""));
            assertTrue(c >= firstPrice && c <= secondPrice);
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

        assertEquals("Puma Black", productPage.describeColorElement().getText());
    }
}
