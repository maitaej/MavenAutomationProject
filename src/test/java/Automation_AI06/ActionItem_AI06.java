package Automation_AI06;

import Day11_05072024.ReusableMethods;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static Day11_05072024.ReusableMethods.setupChromeDriver;

public class ActionItem_AI06 {
    public static void main(String[] args) throws InterruptedException {
//define the webdriver variable and set up the chrome driver
        WebDriver driver = setupChromeDriver();
        //declare an array list
        ArrayList<String> zipCodes = new ArrayList<>();
        zipCodes.add("11229");
        zipCodes.add("11693");
        zipCodes.add("11203");
        for (int i = 0; i < zipCodes.size(); i++) {
            //navigate to weightwatchers.com
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop");
            //click on the workshop button using Reusable methods with xpath text
            ReusableMethods.clickMethod(driver, "//*[text() = 'Find a Workshop']", "Find a Workshop");
            //click on In Person link using Reusable methods with xpath text
            ReusableMethods.clickMethod(driver, "//*[text() = 'In-Person']", "In-Person");
            //send keys from reusable method using array list zipCodes
            ReusableMethods.sendKeysMethod(driver, "//*[@id = 'location-search']", zipCodes.get(i), "location-search");
            //submit using reusable method
            ReusableMethods.submitMethod(driver, "//*[@id = 'location-search-cta']", "location-search-cta");
            //click on specific studio link
            if (i == 0) {
                ReusableMethods.clickByIndexMethod(driver, "//*[contains(@class, 'linkContainer-C5n9z')]", 2, "studioLinks");
            } else if (i == 1) {
                ReusableMethods.clickByIndexMethod(driver, "//*[contains(@class, 'linkContainer-C5n9z')]", 3, "studioLinks");
            } else if (i == 2) {
                ReusableMethods.clickByIndexMethod(driver, "//*[contains(@class, 'linkContainer-C5n9z')]", 0, "studioLinks");
            }//end of if else statement
            //capture entire address
            String address = ReusableMethods.captureTextMethod(driver, "//*[contains(@class, 'address-FnT8k')]", "address");
            //print out address
            System.out.println("Address is " + address);
            //scroll to into view of WW studio schedule
            ReusableMethods.scrollByViewMethod(driver, "//*[contains(@class, 'title-UbUc9')]", "elements");
            //capture and print schedule for WW address
            String schedule = ReusableMethods.captureTextMethod(driver, "//*[contains(@class, 'scheduleContainerMobile-ps6Rm')]", "schedule");
            //print out schedule
            System.out.println("Schedule is " + schedule);
        }//end of for loop
        //quit driver
        driver.quit();
    }//end of main
}//end of class

