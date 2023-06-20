package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CareersElements extends AbstractBasePage {

    public CareersElements(WebDriver driver) {
        super(driver);
    }

    private static final String EXPLORE_NOW_CORPORATE_JOBS = "//a[text() = 'EXPLORE NOW '][1]";
    private static final String CORPORATE_PREFILTER = "//div[contains(text(), 'Corporate')]";
    private static final String ACCEPT_ALL_COOKIES = "//button[@id='onetrust-accept-btn-handler']";
    private static final String LOCATIONS_FILTER = "//div[@class= 'jobfinder-filter-list-container job-corporate active']//span[text()= 'Locations']";
    private static final String CONTINENT_OF_LOCATION = "//ul[@class='jobfinder-filter-list second-level active']/li/span[text()='%s']";
    private static final String REGION_OF_CONTINENT_OF_LOCATION = "//ul[@class='jobfinder-filter-list third-level active']/li/span[text()='%s']";
    private static final String CITY_OF_LOCATION = "//div[@class='jobfinder-filter-list last-level']/ul/li[contains(@class, 'last-level-item')]/span[text()='%s'][1]";
    private static final String SELECTED_OPEN_JOBS_LIST = "//div[@class= 'content']";
    private static final String SELECTED_OPEN_JOBS_CITY_OF_LOCATIONS = "//p[@class= 'location']";
    private static final String CLEAR_FILTERS_BUTTON = "//div[contains(@class, 'clear-filter')]";
    private static final String BACK_TO_PREVIOUS_STEP_SELECTING_LOCATION = "//div[@class= 'backlink']";
    private static final String TEAMS_FILTER = "//div[@class= 'jobfinder-filter-list-container job-corporate active']//span[text()= 'Teams']";
    private static final String SECTION_OF_TEAMS_FILTERS = "//div[@class='jobfinder-filter-list last-level']//span[text()= '%s']";
    private static final String SELECTED_OPEN_JOBS_TEAMS_FILTER = "//p[@class='team']";
    private static final String SELECTED_OPEN_JOBS_LIST_WITH_REGARD_TO_TEAMS_FILTER = "//p[@class='team']";
    private static final String FUTURE_TALENTS_FILTER = "//div[@class= 'jobfinder-filter-list-container job-corporate active']//span[text()= 'Future Talents']";
    private static final String SECTION_OF_FUTURE_TALENTS_FILTER = "//div[@class='jobfinder-filter-list last-level']//span[text()= '%s']";
    private static final String SELECTED_OPEN_JOBS_LIST_WITH_REGARD_TO_FUTURE_TALENTS_FILTER = "//p[@class='team']";
    private static final String NEEDED_OPEN_JOB = "(//div[@class= 'content']//h3)[1]";
    private static final String SIGN_IN_BUTTON = "//div[@aria-label='Sign In']";
    private static final String NO_RESULT = "//p[@class='no-result']";

    public WebElement getExploreNowCorporateJobs() {
        return waitUntilElementToBeVisibleByXpath(EXPLORE_NOW_CORPORATE_JOBS);
    }

    public WebElement getCorporatePrefilter() {
        return waitUntilElementToBeVisibleByXpath(CORPORATE_PREFILTER);
    }

    public WebElement getAcceptAllCookies() {
        return waitUntilElementToBeVisibleByXpath(ACCEPT_ALL_COOKIES);
    }

    public WebElement getLocationsFilter() {
        return waitUntilElementToBeClickableByXpath(LOCATIONS_FILTER);
    }

    public WebElement getContinentOfLocation(String option) {
        return waitUntilElementToBeClickableByXpath(String.format(CONTINENT_OF_LOCATION, option));
    }

    public WebElement getRegionOfContinentOfLocation(String option) {
        return waitUntilElementToBeClickableByXpath(String.format(REGION_OF_CONTINENT_OF_LOCATION, option));
    }

    public WebElement getCityOfLocation(String option) {
        return waitUntilElementToBeVisibleByXpath(String.format(CITY_OF_LOCATION, option));
    }

    public List<WebElement> getSelectedOpenJobsList() {
        return waitUntilPresenceOfAllElementsByXpath(SELECTED_OPEN_JOBS_LIST);
    }

    public List<WebElement> getSelectedOpenJobsCityOfLocation() {
        return waitUntilPresenceOfAllElementsByXpath(SELECTED_OPEN_JOBS_CITY_OF_LOCATIONS);
    }

    public WebElement getClearFiltersButton() {
        return waitUntilElementToBeVisibleByXpath(CLEAR_FILTERS_BUTTON);
    }

    public WebElement getBackToPreviousStepSelectingLocationButton() {
        return waitUntilElementToBeVisibleByXpath(BACK_TO_PREVIOUS_STEP_SELECTING_LOCATION);
    }

    public WebElement getTeamsFilter() {
        return waitUntilElementToBeVisibleByXpath(TEAMS_FILTER);
    }

    public WebElement getSectionOfTeamsFilter(String option) {
        return waitUntilElementToBeClickableByXpath(String.format(SECTION_OF_TEAMS_FILTERS, option));
    }

    public List<WebElement> getSelectedOpenJobsSectionTeamsFilter() {
        return waitUntilPresenceOfAllElementsByXpath(SELECTED_OPEN_JOBS_TEAMS_FILTER);
    }

    public WebElement getFutureTalentsFilter() {
        return waitUntilElementToBeClickableByXpath(FUTURE_TALENTS_FILTER);
    }

    public WebElement getSectionOfFutureTalentsFilter(String option) {
        return waitUntilElementToBeVisibleByXpath(String.format(SECTION_OF_FUTURE_TALENTS_FILTER, option));
    }

    public List<WebElement> getSelectedOpenJobsListWithRegardToFutureTalentsFilter() {
        return waitUntilPresenceOfAllElementsByXpath(SELECTED_OPEN_JOBS_LIST_WITH_REGARD_TO_FUTURE_TALENTS_FILTER);
    }

    public WebElement getNeededOpenJob() {
        return waitUntilElementToBeClickableByXpath(NEEDED_OPEN_JOB);
    }

    public WebElement checkPresenceOfSignInBtn() {
        return waitUntilElementToBeClickableByXpath(SIGN_IN_BUTTON);
    }

    public List<WebElement> getSelectedOpenJobsSectionOfTeamsFilter() {
        return waitUntilPresenceOfAllElementsByXpath(SELECTED_OPEN_JOBS_LIST_WITH_REGARD_TO_TEAMS_FILTER);
    }

    public WebElement getResultNotFound() {
        return waitUntilElementToBeVisibleByXpath(NO_RESULT);
    }
}
