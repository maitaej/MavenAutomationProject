package Day8_04292024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T3_Tabs {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start-maximized
        options.addArguments("start-maximized");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //navigate to fideliscare.org
        driver.navigate().to("https://www.fideliscare.org");
        //wait 3 seconds
        Thread.sleep(3000);
        //click on shop for a plan
        driver.findElement(By.xpath("//*[text()='Shop For a Plan']")).click();
        //wait for 1.5 seconds
        Thread.sleep(1500);
        driver.findElements(By.xpath("//*[text()='Shop for a Plan']")).get(0).click();
        //wait for 2.5 seconds
        Thread.sleep(2500);
        //click on find a doctor
        driver.findElement(By.xpath("//*[@href='/Find-A-Doctor']")).click();
        //store your tabs arraylist to switch to the new tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the second tab
        driver.switchTo().window(tabs.get(0));
        //click on member tab
        driver.findElement(By.xpath("//*[text()='Member']")).click();

    }//end of main
}//end of class
