package Day8_04292024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_ClickDropdown {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start-maximized
        options.addArguments("start-maximized");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calculator website  mlcalc.com
        driver.navigate().to("https://www.mortgagecalculator.org");
        //wait 3 seconds
        Thread.sleep(3000);
        //enter home value
        driver.findElement(By.xpath("//*[@id = 'homeval']")).sendKeys("450000");
        //enter down payment
        driver.findElement(By.xpath("//*[@id = 'downpayment']")).sendKeys("100000");
        //click on a start month dropdown
        driver.findElement(By.xpath("//*[@name='param[start_month]']")).click();
        //click on dropdown value may by using xpath text ()
        driver.findElement(By.xpath("//*[text()='May']")).click();
    }//end of main
 }//end of class
