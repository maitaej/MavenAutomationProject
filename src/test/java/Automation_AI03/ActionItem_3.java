package Automation_AI03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionItem_3 {
    public static void main(String[] args) throws InterruptedException {
        //we need to declare a webdriver manager
        WebDriver driver = new ChromeDriver();
        //go to bing.com
        driver.navigate().to("https://www.bing.com");
        //type cars in the search box
        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("cars");
        //click or submit to bing search
        driver.findElement(By.xpath("//*[@id = 'search_icon']")).submit();
        //pause for 3 seconds
        Thread.sleep(3000);
        //store the search result into a string variable
        String searchResultVariable = driver.findElement(By.xpath("//*[@class = 'sb_count']")).getText();
        //print out search results
        System.out.println(searchResultVariable);
        //declare an array to store the split message
        String[] splitMessageArray = searchResultVariable.split(" ");
        //print out only the search number
        System.out.println("Search number for cars is " + splitMessageArray[1]);
        //click on MORE
        driver.findElement(By.xpath("//*[@id = 'b-scopeListItem-menu']")).click();
        //click on MY Bing
        driver.findElement(By.xpath("//*[@id = 'b-scopeListItem-bingpages']")).click();
        //pause for 3 seconds
        Thread.sleep(3000);
        //capture the entire message To see your profile page...
        String profilePageResults = driver.findElement(By.xpath("//*[@class= 'myprofile-see-profile']")).getText();
        //print out entire message under Profile section
        System.out.println(profilePageResults);
        //quit browser
        driver.quit();
    }//end of main
}//end of class
