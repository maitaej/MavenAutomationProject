package Day14_05202024;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static Day13_05142024.TestParent.logger;

public class ReusableMethods_Loggers {

    public static WebElement clickMethod(WebDriver driver, ExtentTest logger, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).click();
            logger.log(LogStatus.PASS, "Successfully clicked on " + elementName);
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to click on " + elementName + " due to exception " + e);
            logger.log(LogStatus.FAIL, "Unable to click on " + elementName);
            getScreenShot(driver, elementName, logger);
        }//end of catch block
        return null;
    }//end of click method

    public static String captureTextMethod(WebDriver driver, ExtentTest logger, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String result = "";
        try {
            result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).getText();
            logger.log(LogStatus.PASS, "Successfully captured text from " + elementName);
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to capture text " + elementName + " due to exception " + e);
            logger.log(LogStatus.FAIL, "Unable to capture text from " + elementName);
            getScreenShot(driver, elementName, logger);
        }//end of catch block
        return result;
    }//end of capture text method

    public static void submitMethod(WebDriver driver, ExtentTest logger, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).submit();
            logger.log(LogStatus.PASS, "Successfully submitted " + elementName);
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to submit on " + elementName + " due to exception " + e);
            logger.log(LogStatus.FAIL, "Unable to submit " + elementName);
            getScreenShot(driver, elementName, logger);
        }//end of catch block
    }//end of submit method

    public static void sendKeysMethod(WebDriver driver, ExtentTest logger, String xpathValue, String userInput, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).clear();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).sendKeys(userInput);
            logger.log(LogStatus.PASS, "Successfully entered text on " + elementName);

        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to send keys on " + elementName + " due to exception " + e);
            logger.log(LogStatus.FAIL, "Unable to send keys on " + elementName);
            getScreenShot(driver, elementName, logger);
        }//end of catch block
    }//end of send keys method

    public static void clickByIndexMethod(WebDriver driver, String xpathValue, int indexNumber, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpathValue)));
            if (indexNumber < elements.size()) {
                elements.get(indexNumber).click();
            } else {
                logger.log(LogStatus.PASS, "Successfully click on index " + indexNumber + elementName);
                System.out.println("Unable to click on index due to out of bounds for " + elementName);
            }
        } catch (Exception e) {
            System.out.println("Unable to click on index " + elementName + indexNumber + " due to exception " + e);
            logger.log(LogStatus.FAIL, "Unable to click on index " + indexNumber + elementName);
            getScreenShot(driver, elementName, logger);
        }
    }//end of click by index method


    public static void scrollByViewMethod(WebDriver driver, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathValue)));
            WebElement scrollElement = By.xpath(xpathValue).findElement(driver);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true);", scrollElement);
            logger.log(LogStatus.PASS, "Successfully scroll into view " + elementName);
            //end of try block
        } catch (Exception e) {
            System.out.println("Unable to scroll to " + elementName + "due to exception" + e);
            logger.log(LogStatus.FAIL, "Unable to scroll into view " + elementName);
            getScreenShot(driver, elementName, logger);
        }//end of catch block
    }//end of scroll by view method

    public static void scrollByPixelMethod(WebDriver driver, int x, int y) {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(" + x + "," + y + ");");
            logger.log(LogStatus.PASS, "Successfully scroll by pixel at " + x + y);
            //end of try block
        } catch (Exception e) {
            System.out.println("Unable to scroll by pixel due to exception " + e);
            logger.log(LogStatus.FAIL, "Unable to scroll by pixel at " + x + y);
        }//end of catch block
    }//end of scroll by pixel method

    public static void checkIfStringEquals(String expectedText, String actualText, ExtentTest logger) {
        if (expectedText.equals(actualText)) {
            logger.log(LogStatus.PASS, "Expected Text " + expectedText + " Matches " + actualText);
        } else {
            logger.log(LogStatus.FAIL, "Expected Text " + expectedText + " does not match " + actualText);
        }
    }//end of checkString

    //method to capture screenshot when logger fails
    public static void getScreenShot(WebDriver driver, String imageName, ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.PASS, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occurred while taking SCREENSHOT!!! " + e);
        }//end of exception
    }//end of get screenshot method

    public static void switchToTabByIndexMethod(WebDriver driver, int indexTab, String elementName) {
        try {
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            //switch to the second tab
            driver.switchTo().window(tabs.get(indexTab));
            logger.log(LogStatus.PASS, "Successfully switch to tab by index " + indexTab + elementName);
            //end of try block
        } catch (Exception e) {
            System.out.println("Unable to switch to tab due to index " + elementName + indexTab + " due to exception " + e);
            logger.log(LogStatus.FAIL, "Unable to switch to tab by index " + indexTab + elementName);
            getScreenShot(driver, elementName, logger);
        }//end of catch block

    }//end of class
}
