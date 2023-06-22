package tests;

import base.AbstractBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SpongeBobCollectionPage;

public class SearchTest extends AbstractBaseTest {

    @Test
    public void checkSearch() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        SoftAssert softAssert = new SoftAssert();
        Actions actions = new Actions(driver);
        SpongeBobCollectionPage productPage = new SpongeBobCollectionPage(driver);

        homePage.
                clickSearchField()
                .searchInputField().sendKeys("PUMA x SPONGEBOB");

        homePage.
                clickClearBtn();

        softAssert.assertTrue(homePage.inputFieldIsNotPresent(), "element1");

        homePage.
                clickCloseButtonInSearchField();

        softAssert.assertTrue(homePage.searchBarIsNotPresent(), "element2");

        homePage.
                clickSearchField();

        homePage.searchInputField().sendKeys("PUMA x SPONGEBOB");
        actions.sendKeys(homePage.searchInputField(), "PUMA x SPONGEBOB").build().perform();

        homePage.
                clickSearchBtn();

        for (WebElement x : productPage.listProductNames())
            softAssert.assertTrue(x.getText().contains("SPONGEBOB"));

        softAssert.assertAll();
    }
}
