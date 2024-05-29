package Day7_04232024;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_Scroll {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start maximized", "incognito");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to mlcalc.com
        driver.navigate().to("https://www.mortgagecalculator.org");
        //wait 2 seconds
        Thread.sleep(2000);
        //define the javascriptexecuter
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down 800 pixels
        jse.executeScript("scroll(0,800)");
        //wait 2 seconds
        Thread.sleep(2000);
        //scroll back up
        jse.executeScript("scroll(0,-800)");
        //wait 2 seconds
        Thread.sleep(2000);
        //scroll into webElement, we need to define calculate button into webElement
        WebElement calcButton = driver.findElement(By.xpath("//*[@value = 'Calculate']"));
        //scroll into view of the calculate button
        jse.executeScript("arguments[0].scrollIntoView(true);",calcButton);
        //wait 4 seconds
        Thread.sleep(4000);
        //quit the browser
        driver.quit();
    }//end of main
}//end of class
