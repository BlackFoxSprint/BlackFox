package pages;

import elements.BuyProductAndAddToBagElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static base.CommonActions.moveCursor;

public class BuyProductAndAddToBagPage extends BuyProductAndAddToBagElements {
    public BuyProductAndAddToBagPage(WebDriver driver) {
        super(driver);
    }

    public BuyProductAndAddToBagPage moveCollaborations() {
        moveCursor(waitUntilPresenceOfElementByXpath(COLLABORATIONS_BUTTON),driver);
        return this;
    }

    public BuyProductAndAddToBagPage clickPumaAndVogueButton() {
        waitUntilElementToBeClickableByXpath(PUMA_VOGUE_BUTTON).click();
        return this;
    }

    public BuyProductAndAddToBagPage scrollToProduct() {
        scrollToElement(waitUntilElementToBeVisibleByCss(PRODUCT_ELEMENTS), driver);
        return this;
    }

    public int getTextProductElements() {
        return Integer.parseInt(waitUntilElementToBeVisibleByXpath(GENDER_WOMAN_CATEGORIES)
                .getText().replace("Women[", "").replace("]", ""));
    }

    public int getElementsCountByLocatorVogue() {
        int prevSize = 0;
        int newSize = 0;

        do {
            prevSize = newSize;

            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -300)");


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

    public BuyProductAndAddToBagPage scrollToFilter() {
        scrollToElement(waitUntilElementToBeVisibleByXpath(SCROLL_TO_FILTER), driver);
        return this;
    }

    public BuyProductAndAddToBagPage clickToCategoriesButton() {
        waitUntilElementToBeClickableByCss(CATEGORIES_BUTTON).click();
        return this;
    }

    public BuyProductAndAddToBagPage clickToShoesButton() {
        waitUntilElementToBeClickableByXpath(SHOES_BUTTON).click();
        return this;
    }

    public BuyProductAndAddToBagPage clickToSizeButton() {
        waitUntilElementToBeClickableByCss(SIZE_BUTTON).click();
        return this;
    }

    public BuyProductAndAddToBagPage clickToSizeNumberButton() {
        waitUntilElementToBeClickableByCss(NUMBER_SIZE).click();
        return this;
    }

    public BuyProductAndAddToBagPage clickToElementInPage() {;
        // Знаходимо всі елементи з локатором //a[@data-test-id='product-list-item-link']
        List<WebElement> elements = driver.findElements(By.xpath("//a[@data-test-id='product-list-item-link']"));

        // Цикл для клікання на кожен елемент
        for (WebElement element : elements) {
            element.click();
            // Тут можна додати додаткові дії після кліку
        }
        return this;
    }
}
