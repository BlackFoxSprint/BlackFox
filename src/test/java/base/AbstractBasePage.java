package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

import static java.time.Duration.ofMillis;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

abstract public class AbstractBasePage {
    protected WebDriver driver;
    protected static WebDriverWait wait;
    private int BASE_WAIT = 15000;
    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, ofMillis(BASE_WAIT));
    }

    protected WebElement waitUntilElementToBeVisibleByXpath(String locator) {
        return wait.until(visibilityOfElementLocated(By.xpath(locator)));
    }

    protected static WebElement waitUntilElementToBeClickableByXpath(String locator) {
        return wait.until(elementToBeClickable(By.xpath(locator)));

    }

    protected WebElement waitUntilPresenceOfElementByXpath(String locator) {
        return wait.until(presenceOfElementLocated(By.xpath(locator)));
    }

    protected List<WebElement> waitUntilPresenceOfAllElementsByXpath(String locator) {
        return wait.until(presenceOfAllElementsLocatedBy(By.xpath(locator)));
    }


    public void goToNextTab(int tabNumber) {
        waitUntilNumberOfTabToBe(tabNumber);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabNumber - 1));
    }

    public void waitUntilNumberOfTabToBe(int tabNumber) {
        wait.until(ExpectedConditions.numberOfWindowsToBe(tabNumber));
    }
}
