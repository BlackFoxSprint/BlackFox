package pages;

import elements.ApplyForOpenJobElements;
import org.openqa.selenium.WebDriver;

public class ApplyForOpenJobPage extends ApplyForOpenJobElements {

    public ApplyForOpenJobPage(WebDriver driver) {
        super(driver);
    }

    public ApplyForOpenJobPage clickApplyNowBtn() {
        getApplyNowBtn().click();
        return this;
    }

    public ApplyForOpenJobPage enterUsersEmailToApplyForOpenJob() {
        getInputUsersEmailToApply().sendKeys("maksbidzura@gmail.com");
        return this;
    }

    public ApplyForOpenJobPage enterUsersPasswordToApplyForOpenJob() {
        getInputUsersPasswordToApply().sendKeys("&GfD5?BH68m2PLF");
        return this;
    }
}
