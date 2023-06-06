package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonActions {

    public static void scrollToElement(WebElement element, WebDriver driver) {
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void jsClick(WebElement element, WebDriver driver) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    public static void back(WebDriver driver) {
        driver.navigate().back();
    }

    protected void moveCursor(WebElement element, WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

}
