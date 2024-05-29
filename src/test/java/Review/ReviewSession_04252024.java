package Review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReviewSession_04252024 {
    public static void main(String[] args) {
//declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start incognito, start maximized, headless
        options.addArguments("incognito","start-maximized","headless");
        // options.addArguments("incognito");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to google.com
        driver.navigate().to("https://www.google.com/");
    }//end of main
}//end of class
