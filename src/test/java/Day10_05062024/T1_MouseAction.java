package Day10_05062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_MouseAction {
    public static void main(String[] args) {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start-maximized
        options.addArguments("start-maximized");
        //add option to icognito
        options.addArguments("incognito");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //navigate to usps.com
        driver.navigate().to("https://www.usps.com");
        //define Action command
        Actions mouseAction = new Actions(driver);
        //hover over the Send tab to open up the drop-down menu
        try {
            WebElement sendTab = driver.findElement(By.xpath("//*[text()='Send']"));
            mouseAction.moveToElement(sendTab).perform();
        } catch (Exception e) {
            System.out.println("Unable to hover over Send Tab" + e);
        }//end of sendTab exception
        //click on Look up a zip code from drop down menu
        try {
            WebElement zipCodeLookUp = driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            mouseAction.moveToElement(zipCodeLookUp).click().perform();
        } catch (Exception e) {
            System.out.println("Unable to click on Look up a Zip Code" + e);
        }//end of zipCodeLookUp exception
        //click on find cities by zip code
        try {
            WebElement findCitiesByZipCode = driver.findElement(By.xpath("//*[text()='Find Cities by ZIP']"));
            mouseAction.moveToElement(findCitiesByZipCode).click().perform();
        } catch (Exception e) {
            System.out.println("Unable to click on Find Cities by Zip Code" + e);
        }//end of find cities by zip code exception
        //click on enter zip code field
        try {
            WebElement zipCode = driver.findElement(By.xpath("//*[@id='tZip']"));
            mouseAction.moveToElement(zipCode).click().perform();
        } catch (Exception e) {
            System.out.println("Unable to enter  Zip Code" + e);
        }//end of click on enter Zip Code
        //enter zip code 11229
        try {
            WebElement zipCode = driver.findElement(By.xpath("//*[@id='tZip']"));
            mouseAction.moveToElement(zipCode).sendKeys("11229").perform();
        } catch (Exception e) {
            System.out.println("Unable to enter  Zip Code" + e);
        }//end of enter zipcode exception
    }//end of main
}//end of class




