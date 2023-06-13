package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PageBuyInSearchShoes;

import static java.lang.Thread.sleep;

public class TestBuyInSearchShoes extends AbstractBaseTest {
    @Test
    public void testBuyInSearchShoes() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        PageBuyInSearchShoes pageBuyInSearchShoes = new PageBuyInSearchShoes(driver);

        homePage.closePopUp()
                .closeCookie()
                .closeCookieOff()
                .closeCookieEmail()
                .clickSearchButton();

        sleep(2000);
        pageBuyInSearchShoes
                .clickBmwShoes()
                .closeCookieInBmwPage()
                .clickGenderButton()
                .clickMenButton();
        int menCategoryNumberOfItem = pageBuyInSearchShoes.getTextGenderMenCategories();
        pageBuyInSearchShoes.closeFilter();

        pageBuyInSearchShoes.getElementsCountByLocatorMen();

        Assert.assertEquals(menCategoryNumberOfItem, pageBuyInSearchShoes.getElementsCountByLocatorMen());
    }

    @Test
    public void testWomenPage() {
        openBmwPage();

        HomePage homePage = new HomePage(driver);
        PageBuyInSearchShoes pageBuyInSearchShoes = new PageBuyInSearchShoes(driver);

        pageBuyInSearchShoes
                .closeFilter()
                .closeCookieBanner()
                .clickGenderButton()
                .clickWomenButton();

        int womenCategoryNumberOfItem = pageBuyInSearchShoes.getTextGenderWomanCategories();
        pageBuyInSearchShoes.closeFilter();

        Assert.assertEquals(womenCategoryNumberOfItem, pageBuyInSearchShoes.getElementsCountByLocatorWoman());

        homePage.closeCookieOff()
                .closeCookieEmail();
        pageBuyInSearchShoes.scrollUp()
                .clickGenderButton()
                .clickClearButton()
                .clickUnisexButton();

        int unisexCategoryNumberOfItem = pageBuyInSearchShoes.getTextGenderUnisexCategories();
        pageBuyInSearchShoes.closeFilter();

        Assert.assertEquals(unisexCategoryNumberOfItem, pageBuyInSearchShoes.getElementsCountByLocatorUnisex());

    }
}
