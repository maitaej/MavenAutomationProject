package Automation_AI04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Assignment_4 {
    public static void main(String[] args) throws InterruptedException {
//declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized","incognito");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to weightwatchers.com
        driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
        //click on the workshop button using xpath text
        driver.findElement(By.xpath("//*[text() = 'Find a Workshop']")).click();
        //wait for 2 seconds
        Thread.sleep(2000);
        //click on In-Person tab
        driver.findElement(By.xpath("//*[text() = 'In-Person']")).click();
        //wait for 2 seconds
        Thread.sleep(2000);
        //declare and store zipcode value webElement
        WebElement locale = driver.findElement(By.xpath("//*[@id = 'location-search']"));
        //clear the locale value field
        locale.clear();
        //declare an array list for locale
        ArrayList<String> locZipCodes = new ArrayList<>();
        locZipCodes.add("11229");
        locZipCodes.add("11203");
        locZipCodes.add("11234");
        //declare and define for loop
        for (int i = 0; i < locZipCodes.size(); i++) {
            driver.findElement(By.xpath("//*[@id = 'location-search']")).sendKeys(locZipCodes.get(i));
            //click on Search arrow button
            driver.findElement(By.xpath("//*[@id = 'location-search-cta']")).submit();
            //pause for 2 seconds
            Thread.sleep(2000);
            //store the search results studio links in an array list of webelements
            ArrayList<WebElement> studioLinks = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class,'wrapperLink')]")));
            //only print out if studio link equals to locZipCodes
           System.out.println(studioLinks.get(i).getText());

        }//end of for loop
    }//end of class
}//end of main
