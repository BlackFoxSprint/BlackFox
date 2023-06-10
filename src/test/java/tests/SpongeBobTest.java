package Tests;

import base.AbstractBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import org.openqa.selenium.interactions.Actions;

import static org.testng.AssertJUnit.assertTrue;


public class SpongeBobTest extends AbstractBaseTest {

        @Test
        public void CheckSpongeBobCollection() {

        HomePage homePage=new HomePage(driver);
        ProductPage productPage=new ProductPage(driver);
        Actions actions=new Actions(driver);

        homePage.modalWindowClose().click();
        homePage.cookiesDismiss().click();

        actions.moveToElement(homePage.collaborationBtn()).build().perform();

        productPage.clickPumaSpongeBtn();

        assertTrue(getURL().contains("spongebob"));

        for (WebElement x: productPage.listProductNames())
                assertTrue(x.getText().contains("SPONGEBOB"));

        homePage.searchField().click();

        actions.sendKeys(homePage.searchInputField(),"PUMA x SPONGEBOB").build().perform();
        homePage.searchBtn().click();

        for (WebElement x: productPage.listProductNames())
                assertTrue(x.getText().contains("SPONGEBOB"));

        productPage.filterBtn().click();
        productPage.genderBtn().click();
        productPage.girlsCategory().click();

        for (WebElement x: productPage.listProductNames())
                assertTrue(x.getText().contains("SPONGEBOB"));

        productPage.girlsCategory().click();
        productPage.menCategory().click();

        for (WebElement x: productPage.listProductNames())
                assertTrue(x.getText().contains("SPONGEBOB"));

        productPage.menCategory().click();
        productPage.unisexCategory().click();

        for (WebElement x: productPage.listProductNames())
                assertTrue(x.getText().contains("SPONGEBOB"));

        productPage.unisexCategory().click();
        }
}
