package tests;

import base.AbstractBaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.RegisterPage;

public class SearchTest extends AbstractBaseTest {
    @Test(description = "1-15 Steps Registration")
    public void checkRegistration1(String userFirstName, String userLastName, String userEmail, String userPassword, boolean shouldClickRegister) {
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        SoftAssert softAssert = new SoftAssert();
        Actions actions = new Actions(driver);

        homePage.
                clickSearchField();

        homePage.searchInputField().sendKeys("PUMA x SPONGEBOB");
        actions.sendKeys(homePage.searchInputField(), "PUMA x SPONGEBOB").build().perform();

        homePage.clickSearchBtn();


    }

}
