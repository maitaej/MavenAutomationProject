package Automation_AI08;

import Day13_05142024.TestParent;
import Day14_05202024.ReusableMethods_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class appleMortgageInfo_AI08 extends TestParent {
    @Test(priority = 1)
    public void tc001_loginMortgageInfo() throws InterruptedException {
        //navigate to Apple bank homepage
        driver.navigate().to("https://www.applebank.com/");
        //click on and capture Holiday message
        ReusableMethods_Loggers.clickMethod(driver, logger, "//*[contains(@id, 'cmswebpart')]", "Holiday Message");
        //print out Holiday Message
        String holdiayMessage = ReusableMethods_Loggers.captureTextMethod(driver, logger, "//*[contains(@class, 'cmswebpart')]", "Print Holiday Message");
        String[] holidayOnly = holdiayMessage.split("Close");
        System.out.println(holidayOnly[0]);
        logger.log(LogStatus.INFO, holidayOnly[0]);
//click on Account Login
        ReusableMethods_Loggers.clickMethod(driver, logger, "//*[contains(@class, 'col-xs-11')]", "Account Login");
        //click on Mortgage info
        ReusableMethods_Loggers.clickMethod(driver, logger, "//*[@href = 'https://applebank.mtgsvc.com']", "Apple Mortgage Info");
//capture Mortgage info pop-up screen
        String mortgageMessage = ReusableMethods_Loggers.captureTextMethod(driver, logger, "//*[contains(text(), 'Links to third party')]", "Mortgage PopUP");
        System.out.println(mortgageMessage);
        logger.log(LogStatus.INFO, "Leaving Apple Bank: " + mortgageMessage);
        //click on Continue button
        ReusableMethods_Loggers.clickMethod(driver, logger, "//*[@id = 'sbModalSubmit']", "Continue");
    }//end of test case 1

    @Test(dependsOnMethods = "tc001_loginMortgageInfo")
    public void tc002switchToMortgageTab() throws InterruptedException {
        //navigate to Mortgage Information tab
        ReusableMethods_Loggers.switchToTabByIndexMethod(driver, 1, "Mortgage PopUP");
        // capture New York Residents Escrow Letter Information
        String nyEscrow = ReusableMethods_Loggers.captureTextMethod(driver, logger, "//*[@class = 'CssNotes']", "NY Escrow Info");
        System.out.println(nyEscrow);
        logger.log(LogStatus.INFO, nyEscrow);
        //capture telephone number
        String foreclosureCaseUnit = ReusableMethods_Loggers.captureTextMethod(driver, logger, "//*[@id = 'lblCSPhone']", "Telephone Number");
        System.out.println(foreclosureCaseUnit);
        logger.log(LogStatus.INFO, "The Foreclosure Prevention Case Escalation Unit Telephone Number is: " + foreclosureCaseUnit);
        //click on Foreclosure Prevention Unit
        ReusableMethods_Loggers.clickMethod(driver, logger, "//*[@id = 'ForeclosurePreventionHyperLink']", "Foreclosure Link");
        //switch to Foreclosure Link tab
        ReusableMethods_Loggers.switchToTabByIndexMethod(driver, 2, "Foreclosure Link");
        //capture Foreclosure Prevention Disclosure
        String foreclosureDisclosureInfo = ReusableMethods_Loggers.captureTextMethod(driver, logger, "//*[contains(@xmlns, 'http://')]", "Disclosure");
        System.out.println(foreclosureDisclosureInfo);
        logger.log(LogStatus.INFO, "The Foreclosure Prevention Case Escalation Unit Information: " + foreclosureDisclosureInfo);
        driver.close();
    }//end of test case 2

    @Test(dependsOnMethods = {"tc001_loginMortgageInfo", "tc002switchToMortgageTab"})
    public void tc003printoutDisclosures() throws InterruptedException {
        //navigate to Mortgage Information tab
        ReusableMethods_Loggers.switchToTabByIndexMethod(driver, 1, "Mortgage PopUP");
        //click on the New York Disclosure Notice
        ReusableMethods_Loggers.clickMethod(driver, logger, "//*[@id = 'NYDisclosureHyperLink']", "NY Disclosure");
        //switch to New York Disclosure Notice tab
        ReusableMethods_Loggers.switchToTabByIndexMethod(driver, 2, "NY Disclosure Notice");
        //capture New York Disclosure Notice Information
        String disclosureNotice = ReusableMethods_Loggers.captureTextMethod(driver, logger, "//*[contains(@style, 'text-align')]", "New York Disclosure Info");
        System.out.println(disclosureNotice);
        logger.log(LogStatus.INFO, "New York Disclosure: " + disclosureNotice);
        driver.close();
        //navigate back to Mortgage Information tab
        ReusableMethods_Loggers.switchToTabByIndexMethod(driver, 1, "Mortgage PopUP");
        //click on Fee Schedule for New York Borrowers
        ReusableMethods_Loggers.clickMethod(driver, logger, "//*[@id = 'FeeScheduleNYHyperLink']", "Fee Schedule");
        //switch to Fee Schedule for New York Borrowers tab
        ReusableMethods_Loggers.switchToTabByIndexMethod(driver, 2, "NY Schedule");
        //capture New York Fee Schedule pdf screenshot
        String feeSchedule = ReusableMethods_Loggers.captureTextMethod(driver, logger, "//*[@type = 'application/x-google-chrome-pdf']", "NY Fee Schedule");
        logger.log(LogStatus.FAIL, "NY Fee Schedule PDF: " + feeSchedule);
        driver.close();
    }//end of test case 3
}//end of class
