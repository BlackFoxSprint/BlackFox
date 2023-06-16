package Tests;

import base.AbstractBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SpongeBobCollectionPage;
import org.openqa.selenium.interactions.Actions;

import static org.testng.AssertJUnit.assertTrue;

public class SpongeBobTest extends AbstractBaseTest {
    @Test
    public void CheckSpongeBobCollection() {
        HomePage homePage = new HomePage(driver);
        SpongeBobCollectionPage productPage = new SpongeBobCollectionPage(driver);
        Actions actions = new Actions(driver);

        homePage.clickModalWindowClose()
                .clickCookiesDismiss();

        actions.moveToElement(homePage.collaborationBtn()).build().perform();

        productPage.clickPumaSpongeBtn();

        assertTrue(getURL().contains("spongebob"));

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("SPONGEBOB"));

        homePage.clickSearchField();

        actions.sendKeys(homePage.searchInputField(), "PUMA x SPONGEBOB").build().perform();
        
        homePage.clickSearchBtn();

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("SPONGEBOB"));

        productPage.clickFilterBtn()
                .clickGenderBtn()
                .clickGirlsCategory();

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("SPONGEBOB"));

        productPage.clickGirlsCategory()
                .clickMenCategory();

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("SPONGEBOB"));

        productPage.clickMenCategory()
                .clickUnisexCategory();

        for (WebElement x : productPage.listProductNames())
            assertTrue(x.getText().contains("SPONGEBOB"));
    }
}
