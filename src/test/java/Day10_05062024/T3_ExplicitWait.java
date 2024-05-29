package Day10_05062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T3_ExplicitWait {
    public static void main(String[] args) {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start maximized
        options.addArguments("start-maximized");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //navigate to ups.com
        driver.navigate().to("https://www.ups.com");
        //declare explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Click on Tracking
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Tracking']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on Tracking" + e);
            //end of click on tracking exception
            //click on track a package
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();
            } catch (Exception q) {
                System.out.println("Unable to click on Track a Package" + e);
                //end of click on track a package
                //quit the driver
                driver.quit();
            }//end of main
        }//end of class
    }
}