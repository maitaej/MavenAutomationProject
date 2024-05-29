package Day6_04222024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_XpathTextYahoo {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized", "incognito");
        // options.addArguments("incognito");
        //run headless mode (code runs in the background)
        //options.addArguments("headless");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to yahoo.com
        driver.navigate().to("https://www.yahoo.com/");
//click on the sign in button using xpath text
        driver.findElement(By.xpath("//*[text() = 'Sign in']")).click();
        //wait for 2 seconds
        Thread.sleep(2000);
        //quit the driver
        driver.quit();
    }//end of main
}//end of class
