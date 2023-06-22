package pages;

import elements.CareersElements;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.scrollToElement;
import static java.lang.Thread.sleep;

public class CareersPage extends CareersElements {

    public CareersPage(WebDriver driver) {
        super(driver);
    }

    public CareersPage clickExploreNowCorporateJobs() {
        getExploreNowCorporateJobs().click();
        return this;
    }

    public CareersPage clickCorporatePrefilter() {
        getCorporatePrefilter().click();
        return this;
    }

    public CareersPage clickLocations() {
        getLocationsFilter().click();
        return this;
    }

    public CareersPage clickContinentOfLocation(String option) {
        getContinentOfLocation(option).click();
        return this;
    }

    public CareersPage clickRegionOfContinentOfLocations(String option) {
        scrollToElement(getRegionOfContinentOfLocation(option), driver);
        getRegionOfContinentOfLocation(option).click();
        return this;
    }

    public CareersPage clickCityOfLocations(String option) {
        getCityOfLocation(option).click();
        return this;
    }

    public CareersPage clickAcceptAllCookies() {
        getAcceptAllCookies().click();
        return this;
    }

    public CareersPage clickClearFilters() throws InterruptedException {
        sleep(3000);
        getClearFiltersButton().click();
        return this;
    }

    public CareersPage clickBackToPreviousStepSelectingLocation() {
        getBackToPreviousStepSelectingLocationButton().click();
        return this;
    }

    public CareersPage clickTeamsFilter() throws InterruptedException {
        sleep(3000);
        getTeamsFilter().click();
        return this;
    }

    public CareersPage clickSectionOfTeamsFilter(String option) {
        getSectionOfTeamsFilter(option).click();
        return this;
    }

    public CareersPage clickFutureTalentsFilter() {
        getFutureTalentsFilter().click();
        return this;
    }

    public CareersPage clickSectionOfFutureTalentsFilter(String option) throws InterruptedException {
        sleep(2000);
        getSectionOfFutureTalentsFilter(option).click();
        return this;
    }

    public CareersPage clickOnNeededOpenJob() throws InterruptedException {
        sleep(3000);
        getNeededOpenJob().click();
        return this;
    }
}
