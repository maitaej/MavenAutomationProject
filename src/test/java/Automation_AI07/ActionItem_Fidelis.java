package Automation_AI07;

import Day11_05072024.ReusableMethods;
import Day13_05142024.TestParent;
import org.testng.annotations.Test;

public class ActionItem_Fidelis extends TestParent {

    @Test(priority = 1)
    public void tc001searchForMemberInformation() {
        //navigate to Fidelis Care home page
        driver.navigate().to("https://www.fideliscare.org");
        //click on search button
        ReusableMethods.clickMethod(driver, "//*[@class = 'tool dropdown search']", "Search");
        //click on search field
        ReusableMethods.clickMethod(driver, "//*[@class = 'form-control search-input']", "Search Field");
        //enter dental coverage
        ReusableMethods.sendKeysMethod(driver, "//*[@class = 'form-control search-input']", "Fidelis Care Member", "Member Info Search");
        //click on search button icon
        ReusableMethods.clickMethod(driver, "//*[@class = 'input-group-btn']", "Search Icon");
        //capture and store Fidelis Care Member search results
        String searchResult = ReusableMethods.captureTextMethod(driver, "//*[@id = 'resInfo-0']", "Fidelis Care Member result");
        //print out Fidelis Care Member search result number only
        String[] memberSearchNumber = searchResult.split(" ");
        System.out.println(memberSearchNumber[1]);
        ReusableMethods.clickMethod(driver, "//*[text() = 'Fidelis Care Members']", "Members!");
    }//end of test case 1

    @Test(dependsOnMethods = "tc001searchForMemberInformation")
    public void tc002switchToTab() throws InterruptedException {
        //navigate to Member tab
        ReusableMethods.switchToTabByIndexMethod(driver, 1, "Fidelis Care Member");
        //scroll into view of Renew Your Coverage
        ReusableMethods.scrollByPixelMethod(driver, 0, 400);
        // capture and store Renew Your Coverage
        String renewResult = ReusableMethods.captureTextMethod(driver, "//*[@id='dnn_ctr4169_View_ScopeWrapper']", "Coverage");
        //print out Renew Your Coverage
        String[] renewCoverage = renewResult.split("Questions");
        System.out.println(renewCoverage[0]);
        //click on Renewal Help tab
        ReusableMethods.clickMethod(driver, "//*[contains(text(), 'Renewal Help')]", "Renewal Tab");
        //scroll into view of When to renew your coverage
        ReusableMethods.scrollByPixelMethod(driver, 0, 400);
        //click on When to renew coverage
        ReusableMethods.clickMethod(driver, "//*[contains(text(), 'When do you need to renew your coverage?')]", "When");
        //capture and store When to renew coverage information
        String whenRenewInfo = ReusableMethods.captureTextMethod(driver, "//*[@style = 'display: block;']", "When Information");
        //print out When to renew coverage information
        System.out.println(whenRenewInfo);
        //click on When to renew coverage
        ReusableMethods.clickMethod(driver, "//*[contains(text(), 'When do you need to renew your coverage?')]", "When");
        //click on What you need to renew coverage
        ReusableMethods.clickMethod(driver, "//*[contains(text(),'What information do you need to renew your coverage?')]", "What Information");
        //capture and store What you need to renew coverage
        String whatRenewInfo = ReusableMethods.captureTextMethod(driver, "//*[@style = 'display: block;']", "Renew Coverage");
        String[] renewInfo = whatRenewInfo.split("information:");
        System.out.println(renewInfo[1]);
        driver.close();
    }//end of test case 2

    @Test(dependsOnMethods = {"tc001searchForMemberInformation", "tc002switchToTab"})
    public void tc003switchToTab() throws InterruptedException {
        //switch back to parent/default tab
        ReusableMethods.switchToTabByIndexMethod(driver, 0, "Fidelis Care");
        ReusableMethods.scrollByPixelMethod(driver, 0, 400);
        //click on login
        ReusableMethods.clickMethod(driver, "//*[@class = 'tool dropdown login']", "Login Button");
        //click on Member Online Portal
        ReusableMethods.clickMethod(driver, "//*[@rel = 'noopener noreferrer']", "Member Portal");
        //switch to new tab
        ReusableMethods.switchToTabByIndexMethod(driver, 1, "New Tab");
        //capture and store helpful hints
        String helpfulHints = ReusableMethods.captureTextMethod(driver, "//*[@id = 'dnn_ctr5328_ContentPane']", "Helpful Hints");
        //print out Helpful Hints
        System.out.println(helpfulHints);
        driver.close();
    }//end of test cas 3
}//end of class


