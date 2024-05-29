package Day11_05072024;

import org.openqa.selenium.WebDriver;

import static Day11_05072024.ReusableMethods.setupChromeDriver;

public class T1_GoogleReusable {
    public static void main(String[] args) throws InterruptedException {
//define the webdriver variable and set up the chrome driver
        WebDriver driver = setupChromeDriver();
        //go to google.com
        driver.navigate().to("https://www.google.com");
        //send keys from reusable methods
        ReusableMethods.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "GoogleSearch");
        //submit using resusable methods
        ReusableMethods.submitMethod(driver,"//*[@name = 'btnK']", "SubmitButton");
        //click on the  tools button
        ReusableMethods.clickMethod(driver, "//*[@id = 'hdtb-tls']","Tools Button");
        //store the search result into a string variable
        String searchResult = ReusableMethods.captureTextMethod(driver,"//*[@id = 'result-stats']", "SearchResult");
        //print out the results stats
        System.out.println("Search Result is " + searchResult);
        //quit the chrome browser
        driver.quit();
    }//end of main
}//end of class
