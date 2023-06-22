package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ApplyForOpenJobPage;
import pages.CareersPage;
import pages.HomePage;

public class CheckAndApplyForOpenVacancy extends AbstractBaseTest {

    @Test
    public void checkAndApplyForOpenVacancy() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        ApplyForOpenJobPage applyForOpenJobPage = new ApplyForOpenJobPage(driver);
        SoftAssert softAssert = new SoftAssert();

        homePage
                .clickGetClickHereToExploreCareers();

        switchToTab(2);

        softAssert.assertTrue(getCurrentUrl().contains("/careers"));

        careersPage
                .clickExploreNowCorporateJobs()
                .clickClearFilters()
                .clickCorporatePrefilter()
                .clickAcceptAllCookies()
                .clickLocations()
                .clickContinentOfLocation("Africa")
                .clickRegionOfContinentOfLocations("South Africa")
                .clickCityOfLocations("Cape Town");

        for (int j = 0; j < careersPage.getSelectedOpenJobsList().size(); j++) {
            softAssert.assertTrue(careersPage.getSelectedOpenJobsCityOfLocation().get(j).getText().contains("Cape"),
                    "Location filter doesn't work correctly.");
        }

        careersPage
                .clickClearFilters()
                .clickBackToPreviousStepSelectingLocation()
                .clickBackToPreviousStepSelectingLocation()
                .clickBackToPreviousStepSelectingLocation()
                .clickLocations()
                .clickContinentOfLocation("Europe")
                .clickRegionOfContinentOfLocations("Austria")
                .clickCityOfLocations("Salzburg");

        for (int j = 0; j < careersPage.getSelectedOpenJobsList().size(); j++) {
            softAssert.assertTrue(careersPage.getSelectedOpenJobsCityOfLocation().get(j).getText().contains("Salzburg"),
                    "Location filter doesn't work correctly.");
        }

        careersPage
                .clickBackToPreviousStepSelectingLocation()
                .clickBackToPreviousStepSelectingLocation()
                .clickBackToPreviousStepSelectingLocation()
                .clickTeamsFilter()
                .clickSectionOfTeamsFilter("Business Solutions");

        softAssert.assertTrue(careersPage.getResultNotFound().isDisplayed(),
                "Locations and teams filters don't work correctly at the same time.");

        careersPage
                .clickClearFilters()
                .clickSectionOfTeamsFilter("Design")
                .clickSectionOfTeamsFilter("E-Commerce");

        for (int j = 0; j < careersPage.getSelectedOpenJobsList().size(); j++)
            softAssert.assertTrue(careersPage.getSelectedOpenJobsSectionTeamsFilter().get(j).getText().
                    contains("E-Commerce") || careersPage.getSelectedOpenJobsSectionTeamsFilter().get(j).
                            getText().contains("Design"),
                    "Two filters from section team filters don't work correctly at the same time.");

        careersPage
                .clickClearFilters()
                .clickBackToPreviousStepSelectingLocation()
                .clickFutureTalentsFilter()
                .clickSectionOfFutureTalentsFilter("Apprentices");

        for (int j = 0; j < careersPage.getSelectedOpenJobsList().size(); j++) {
            softAssert.assertTrue(careersPage.getSelectedOpenJobsListWithRegardToFutureTalentsFilter().get(j).
                    getText().contains("Apprentices"), "Future Talents filter doesn't work correctly.");
        }

        careersPage
                .clickClearFilters()
                .clickSectionOfFutureTalentsFilter("Interns")
                .clickOnNeededOpenJob();

        applyForOpenJobPage
                .clickApplyNowBtn()
                .enterUsersEmailToApplyForOpenJob()
                .enterUsersPasswordToApplyForOpenJob();

        softAssert.assertTrue(careersPage.checkPresenceOfSignInBtn().getText().contains("Sign In"),
                "Sign In Btn is not visible for the user.");
        softAssert.assertAll();
    }
}
