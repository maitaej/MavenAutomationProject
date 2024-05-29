package Automation_AI04;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;

import java.util.ArrayList;

public class Assignment_4new {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized", "incognito");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //declare an array list
        ArrayList<String> zipCodes = new ArrayList<>();
        zipCodes.add("11229");
        zipCodes.add("11693");
        zipCodes.add("11203");
        for (int i = 0; i < zipCodes.size(); i++) {
            //navigate to weight watchers
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop");
            //wait for 2 seconds
            Thread.sleep(2000);
            //click on the workshop button using xpath text
            driver.findElement(By.xpath("//*[text() = 'Find a Workshop']")).click();
            //click on In Person link
            driver.findElement(By.xpath("//*[text() = 'In-Person']")).click();
            //wait for 2 seconds
            Thread.sleep(2000);
            WebElement locale = driver.findElement(By.xpath("//*[@id = 'location-search']"));
            //clear the locale value field
            locale.clear();
            driver.findElement(By.xpath("//*[@id = 'location-search']")).sendKeys(zipCodes.get(i));
            //click on Search arrow button
            driver.findElement(By.xpath("//*[@id = 'location-search-cta']")).submit();
            //pause for 2 seconds
            Thread.sleep(2000);
            //store the search results studio links in an array list of webelements
            ArrayList<WebElement> studioLinks = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class, 'linkContainer-C5n9z')]")));
            if (i == 0) {
                studioLinks.get(2).click();
            } else if (i == 1) {
                studioLinks.get(3).click();
            } else if (i == 2) {
                studioLinks.get(0).click();
            }//End of if else
            //pause for 2 seconds
            Thread.sleep(2000);
            //only print out if studio link equals to ZipCodes
            //studioLinks.get(i).click();
            //wait 2 seconds
            Thread.sleep(2000);
            //capture entire address
            String address = driver.findElement(By.xpath("//*[@class = 'address-FnT8k']")).getText();
            //print out address
            System.out.println("The address is " + address);
            //locate view of Studio workshop schedule
            WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'title-UbUc9')]"));
            //define javascriptexecutor for Studio Workshop schedule
            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            //define web element
            WebElement schedule = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-ps6Rm']"));
            scroll.executeScript("arguments[0].scrollIntoView(true);", schedule);
            System.out.println(schedule.getText());
        }//end of for loop
        //quit browser
        driver.quit();
    }//end of main
}//end of class


