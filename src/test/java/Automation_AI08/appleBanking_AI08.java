package Automation_AI08;

import Day13_05142024.TestParent;
import Day14_05202024.ReusableMethods_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class appleBanking_AI08 extends TestParent {

    @Test(priority = 1)
    public void tc001_locatePhoneandRouting() throws InterruptedException {
        //navigate to Apple bank homepage
        driver.navigate().to("https://www.applebank.com/");
        ReusableMethods_Loggers.scrollByPixelMethod(driver, 0, 1000);
        //capture text for Phone and Routing number combined
        String quickResults = ReusableMethods_Loggers.captureTextMethod(driver, logger, "//*[@class = 'footer-links col-sm-2 hidden-xs hidden-sm']", "Quick");
        System.out.println(quickResults);
        logger.log(LogStatus.INFO, quickResults);
    }//end of test 1

    @Test(priority = 2)
    public void tc002_searchLocations() throws InterruptedException {
        //navigate to Apple bank homepage
        driver.navigate().to("https://www.applebank.com/");
        ReusableMethods_Loggers.scrollByPixelMethod(driver, 0, 800);
        //click on View Locations
        ReusableMethods_Loggers.clickMethod(driver, logger, "//*[@title = 'View Locations']", "View Locations");
        //scroll to Find Location field
        ReusableMethods_Loggers.scrollByPixelMethod(driver, 0, 400);
        //click on Find Location field
        ReusableMethods_Loggers.clickMethod(driver, logger, "//*[@id = 'locations-search']", "Location Field");
        //enter zip code
        ReusableMethods_Loggers.sendKeysMethod(driver, logger, "//*[@id = 'locations-search']", "11229", "Location");
        //select type of location
        ReusableMethods_Loggers.clickMethod(driver, logger, "//*[@id = 'locations-search-branch']", "Location Type");
        // click on Submit button
        ReusableMethods_Loggers.submitMethod(driver, logger, "//*[@id = 'locations-search-submit']", "Submit button");
        //capture search results
        String results = ReusableMethods_Loggers.captureTextMethod(driver, logger, "//*[@class = 'om-results']", "Search Results");
        System.out.println(results);
        logger.log(LogStatus.INFO, results);
    }//end of test case 2

    @Test(dependsOnMethods = "tc002_searchLocations")
    public void tc003_viewBranchAtmResults() throws InterruptedException {
        //click on branch, call center, and atm hours
        ReusableMethods_Loggers.clickMethod(driver, logger, "//*[@class = 'col-sm-5']", "Branch Results");
        //capture Branch results
        String branchResults = ReusableMethods_Loggers.captureTextMethod(driver, logger, "//*[@class = 'container internal']", "All Branch Results");
        System.out.println(branchResults);
        logger.log(LogStatus.INFO, branchResults);
        driver.close();
    }//end of test case 3
}//end of class
