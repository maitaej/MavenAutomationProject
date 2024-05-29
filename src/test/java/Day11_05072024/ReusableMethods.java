package Day11_05072024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.elementName;

public class ReusableMethods {
    public static void clickMethod(WebDriver driver, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).click();
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to click on " + elementName + " due to exception " + e);
        }//end of catch block
    }//end of click method

    public static String captureTextMethod(WebDriver driver, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String result = "";
        try {
            result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).getText();
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to capture text " + elementName + "due to exception " + e);
        }//end of catch block
        return result;
    }//end of capture text method

    public static WebDriver setupChromeDriver() {
        //declare and define Chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized and incognito
        options.addArguments("start-maximized", "incognito");
        //pass the chrome options to the driver
        WebDriver driver = new ChromeDriver(options);
        //return driver
        return driver;
    }//end of setup driver method

    public static void submitMethod(WebDriver driver, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).submit();
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to submit on " + elementName + " due to exception " + e);
        }//end of catch block
    }//end of submit method

    public static void sendKeysMethod(WebDriver driver, String xpathValue, String userInput, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).clear();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).sendKeys(userInput);
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to send keys on " + elementName + " due to exception " + e);
        }//end of catch block
    }//end of send keys method

    public static void clickByIndexMethod(WebDriver driver, String xpathValue, int indexNumber, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpathValue)));
            if (indexNumber < elements.size()) {
                elements.get(indexNumber).click();
            } else {
                System.out.println("Unable to click on index due to out of bounds for " + elementName);
            }
        } catch (Exception e) {
            System.out.println("Unable to capture text " + elementName + indexNumber + " due to exception " + e);
        }
    }//end of click by index method


    public static void scrollByViewMethod(WebDriver driver, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathValue)));
            WebElement scrollElement = By.xpath(xpathValue).findElement(driver);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true);", scrollElement);
            //end of try block
        } catch (Exception e) {
            System.out.println("Unable to scroll to " + elementName + "due to exception" + e);
        }//end of catch block
    }//end of scroll by view method

    public static void scrollByPixelMethod(WebDriver driver, int x, int y) {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(" + x + "," + y + ");");
            //end of try block
        } catch (Exception e) {
            System.out.println("Unable to scroll down due to exception " + e);
        }//end of catch block
    }//end of scroll by pixel method

    public static void switchToTabByIndexMethod(WebDriver driver, int indexTab, String elementName) {
        try {
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            //switch to the second tab
            driver.switchTo().window(tabs.get(indexTab));
            //end of try block
        } catch (Exception e) {
            System.out.println("Unable to switch to tab due to index " + elementName + indexTab + " due to exception " + e);
        }//end of catch block

    }//end of class
}














