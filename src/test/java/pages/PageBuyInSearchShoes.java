package pages;

import elements.ElementsToBuyShoes;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static base.CommonActions.scrollToElement;

public class PageBuyInSearchShoes extends ElementsToBuyShoes {

    public PageBuyInSearchShoes(WebDriver driver) {
        super(driver);
    }

    public PageBuyInSearchShoes clickBmwShoes() {
        waitUntilElementToBeClickableByXpath(BMW_SHOES_BUTTON).click();
        return this;
    }

    public PageBuyInSearchShoes clickGenderButton() {
        waitUntilElementToBeClickableByXpath(GENDER_BUTTON).click();
        return this;
    }

    public PageBuyInSearchShoes clickMenButton() {
        waitUntilElementToBeClickableByXpath(MEN_BUTTON).click();
        return this;
    }

    public int getTextGenderMenCategories(){

       return Integer.parseInt(waitUntilElementToBeVisibleByXpath(GENDER_MEN_CATEGORIES)
               .getText().replace("Men[","").replace("]",""));

    }

    public PageBuyInSearchShoes closeCookieInBmwPage() {
        waitUntilElementToBeClickableByXpath(CLOSE_COOKIE_BMW_PAGE).click();
        return this;
    }

    public int getElementsCountByLocatorMen() {
        int prevSize = 0;
        int newSize = 0;

        do {
            prevSize = newSize;

            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            List<WebElement> elements = wait.until(ExpectedConditions
                    .presenceOfAllElementsLocatedBy(By.xpath("//a[@data-test-id='product-list-item-link']")));
            newSize = elements.size();

        } while (prevSize < newSize);

        return newSize;
    }


    public PageBuyInSearchShoes closeFilter(){
        waitUntilElementToBeClickableByXpath(CLOSE_FILTER).click();
        return this;
    }
    public PageBuyInSearchShoes closeCookieBanner(){
        waitUntilElementToBeClickableByXpath(CLOSE_COOKIE_BANNER).click();
        return this;
    }
    public PageBuyInSearchShoes scrollUp() {
        scrollToElement(waitUntilElementToBeVisibleByXpath(SCROLL_UP), driver);
        return this;
    }
    public PageBuyInSearchShoes clickClearButton(){
        waitUntilElementToBeClickableByXpath(CLEAR_BUTTON).click();
        return this;
    }
    public PageBuyInSearchShoes clickWomenButton(){
        waitUntilElementToBeClickableByXpath(WOMEN_BUTTON).click();
        return this;
    }

    public int getTextGenderWomanCategories(){
        return Integer.parseInt(waitUntilElementToBeVisibleByXpath(GENDER_WOMAN_CATEGORIES)
                .getText().replace("Women[","").replace("]",""));
    }

    public int getElementsCountByLocatorWoman() {
        int prevSize = 0;
        int newSize = 0;

        do {
            prevSize = newSize;

            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            List<WebElement> elements = wait.until(ExpectedConditions
                    .presenceOfAllElementsLocatedBy(By.xpath("//a[@data-test-id='product-list-item-link']")));
            newSize = elements.size();

        } while (prevSize < newSize);

        return newSize;
    }

    public PageBuyInSearchShoes clickUnisexButton(){
        waitUntilElementToBeClickableByXpath(UNISEX_BUTTON).click();
        return this;
    }

    public int getTextGenderUnisexCategories(){
        return Integer.parseInt(waitUntilElementToBeVisibleByXpath(UNISEX_BUTTON)
                .getText().replace("Unisex[","").replace("]",""));
    }
    public int getElementsCountByLocatorUnisex() {
        int prevSize = 0;
        int newSize = 0;

        do {
            prevSize = newSize;

            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            List<WebElement> elements = wait.until(ExpectedConditions
                    .presenceOfAllElementsLocatedBy(By.xpath("//a[@data-test-id='product-list-item-link']")));
            newSize = elements.size();

        } while (prevSize < newSize);

        return newSize;
    }
    public PageBuyInSearchShoes clickBoysButton(){
        waitUntilElementToBeClickableByXpath(BOYS_BUTTON).click();
        return this;
    }
    public int getTextGenderBoysCategories(){
        return Integer.parseInt(waitUntilElementToBeVisibleByXpath(BOYS_BUTTON)
                .getText().replace("Boys[","").replace("]",""));
    }
    public int getElementsCountByLocatorBoys() {
        int prevSize = 0;
        int newSize = 0;

        do {
            prevSize = newSize;

            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            List<WebElement> elements = wait.until(ExpectedConditions
                    .presenceOfAllElementsLocatedBy(By.xpath("//a[@data-test-id='product-list-item-link']")));
            newSize = elements.size();

        } while (prevSize < newSize);

        return newSize;
    }

    public PageBuyInSearchShoes clickPriceButton(){
        waitUntilElementToBeClickableByXpath(PRICE_FILTER_BUTTON).click();
        return this;
    }

}
