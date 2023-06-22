package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BuyProductAndAddToBagPage;
import pages.HomePage;
import pages.PageBuyInSearchShoes;

public class TestBuyProductAndAddToBag extends AbstractBaseTest {

    @Test
    public void testProductAndAddToBag() {
        HomePage homePage = new HomePage(driver);
        BuyProductAndAddToBagPage buyProductAndAddToBagPage = new BuyProductAndAddToBagPage(driver);
        PageBuyInSearchShoes pageBuyInSearchShoes = new PageBuyInSearchShoes(driver);

        homePage.closePopUp()
                .closeCookie()
                .closeCookieOff()
                .closeCookieEmail();

        buyProductAndAddToBagPage
                .moveCollaborations();

        buyProductAndAddToBagPage
                .clickPumaAndVogueButton()
                .scrollToFilter();

        pageBuyInSearchShoes
                .clickGenderButton()
                .clickWomenButton();

        int productElementsNumberOfItem = buyProductAndAddToBagPage.getTextProductElements();

        pageBuyInSearchShoes.closeFilter();

        Assert.assertEquals(productElementsNumberOfItem, buyProductAndAddToBagPage.getElementsCountByLocatorVogue());

        buyProductAndAddToBagPage
                .scrollToProduct()
                .clickToCategoriesButton()
                .clickToShoesButton();
        pageBuyInSearchShoes.closeFilter();

        buyProductAndAddToBagPage
                .clickToSizeButton()
                .clickToSizeNumberButton();

        pageBuyInSearchShoes.closeFilter();

        buyProductAndAddToBagPage
                .clickToFitButton()
                .clickToRegularButton()
                .clickToElementInPage();
    }
}
