package Tests;

import base.AbstractBaseTest;
import base.CommonActions;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.WomensPage;

public class ShoppingCartTest extends AbstractBaseTest {
    @Test
    public  void checkShoppingCart(){
        HomePage homePage =new HomePage(driver);
        WomensPage womensPage = new WomensPage(driver);

        CommonActions.moveCursor(homePage.getWomenCategory(), driver);

        homePage
                .clickClassicsWomenShoes();
        womensPage
                .clickCaliWedgeWomensSneakers()
                .getSizeOfShoes()
                .clickAddToCart();






    }
}
