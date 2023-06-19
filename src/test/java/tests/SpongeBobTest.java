package Tests;

import base.AbstractBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SpongeBobCollectionPage;
import org.openqa.selenium.interactions.Actions;
import static base.CommonActions.moveCursor;

import static org.testng.AssertJUnit.assertTrue;


public class SpongeBobTest extends AbstractBaseTest {
    @Test
    public void CheckSpongeBobCollection() {
        HomePage homePage = new HomePage(driver);
        SpongeBobCollectionPage productPage = new SpongeBobCollectionPage(driver);
        Actions actions = new Actions(driver);

        homePage.clickModalWindowClose();
        homePage.clickCookiesDismiss();

        moveCursor(homePage.collaborationBtn(),driver);

        productPage.clickPumaSpongeBtn();

        assertTrue(getURL().contains("spongebob"));

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("SPONGEBOB"));

        homePage.clickSearchField();

        homePage.searchInputField().sendKeys("PUMA x SPONGEBOB");
        homePage.clickSearchBtn();

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("SPONGEBOB"));

        productPage.clickFilterBtn();
        productPage.clickGenderBtn();
        productPage.clickGirlsCategory();

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("SPONGEBOB"));

        productPage.clickGirlsCategory();
        productPage.clickMenCategory();

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("SPONGEBOB"));

        productPage.clickMenCategory();
        productPage.clickUnisexCategory();

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("SPONGEBOB"));
    }
}
