package Automation_AI05;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class InClass_ActionItem {
    public static void main(String[] args) throws InterruptedException {
//declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start-maximized
        options.addArguments("start-maximized");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //declare an array list
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11229");
        zipCode.add("11203");

        ArrayList<String> policyStart = new  ArrayList<>();
        policyStart.add("05/05/2024");
        policyStart.add("05/06/2024");

        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Smooch");
        firstName.add("Brownie");

        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Johnson");
        lastName.add("Weir");

        ArrayList<String> streetAdd = new ArrayList<>();
        streetAdd.add("2060 East 19th Street");
        streetAdd.add("36 East 52nd Street");

        ArrayList<String> dob = new ArrayList<>();
        dob.add("08/27/1980");
        dob.add("08/08/1951");

        ArrayList<String> coFirstName = new ArrayList<>();
        coFirstName.add("Winnie");
        coFirstName.add("Sunshine");

        ArrayList<String> coLastName = new ArrayList<>();
        coLastName.add("Jehnson");
        coLastName.add("Brown");
        {
            //navigate to mortgage calculator website statefarm.com
            driver.navigate().to("https://www.statefarm.com");
            //wait 1.5 seconds
            Thread.sleep(1500);
            //click on Get A Quote
            try {
                driver.findElement(By.xpath("//*[text() = 'Get a Quote']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Get A Quote: " + e);
            }//end of Get A Quote exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //select HomeOwners from prodName dropdown
            try {
                WebElement prodName = driver.findElement(By.xpath("//*[@name='productName']"));
                Select dropdown = new Select(prodName);
                dropdown.selectByVisibleText("Homeowners");
            } catch (Exception e) {
                System.out.println("Unable to select a value from Product Name dropdown " + e);
            }//end of prodName drop down exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //enter zip code
            try {
                WebElement zipCodes = driver.findElement(By.xpath("//*[@name='zipCode']"));
                zipCodes.click();
                zipCodes.clear();
                //zipCodes.sendKeys(zipCode.get());
            } catch (Exception e) {
                System.out.println("Unable to enter zip Code: " + e);
            }//end of zip code exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            try {
                driver.findElement(By.xpath("//*[@id='quote-submit-button1']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on start a quote: " + e);
            }//end of submit button exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //enter policy start date
            try {
                WebElement policyStarts = driver.findElement(By.xpath("//*[@name='effectiveDate.effectiveDate']"));
                policyStarts.click();
                policyStarts.clear();
                policyStarts.sendKeys(policyStart.get(0));
            } catch (Exception e) {
                System.out.println("Unable to enter value on effective date: " + e);
            }//end of policyStart exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //enter first name
            try {
                driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(firstName.get(0));
            } catch (Exception e) {
                System.out.println("Unable to enter First Name: " + e);
            }//end of first name exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //enter last name
            try {
                driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(lastName.get(0));
            } catch (Exception e) {
                System.out.println("Unable to enter Last Name: " + e);
            }//end of last name exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //enter street address
            try {
                driver.findElement(By.xpath("//*[@id='street']")).sendKeys(streetAdd.get(0));
            } catch (Exception e) {
                System.out.println("Unable to enter Street Address: " + e);
            }//end of street address exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //enter dob
            try {
                driver.findElement(By.xpath("//*[@id='dateOfBirth']")).sendKeys(dob.get(0));
            } catch (Exception e) {
                System.out.println("Unable to enter dob: " + e);
            }//end of dob exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //define javascriptexecutor to scroll to continue button
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            try {
                //define web element for continue button
                WebElement continueButton = driver.findElement(By.xpath("//*[@class='btn btn-primary btn-large right']"));
                jse.executeScript("arguments[0].scrollIntoView(true);", continueButton);
                //
                Thread.sleep(1500);
                continueButton.click();
            } catch (Exception e) {
                System.out.println("Unable to click buttton" + e);

            }

        } {
            //navigate to mortgage calculator website statefarm.com
            driver.navigate().to("https://www.statefarm.com");
            //wait 1.5 seconds
            Thread.sleep(1500);
            //click on Get A Quote
            try {
                driver.findElement(By.xpath("//*[text() = 'Get a Quote']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Get A Quote: " + e);
            }//end of Get A Quote exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //select HomeOwners from prodName dropdown
            try {
                WebElement prodName = driver.findElement(By.xpath("//*[@name='productName']"));
                Select dropdown = new Select(prodName);
                dropdown.selectByVisibleText("Homeowners");
            } catch (Exception e) {
                System.out.println("Unable to select a value from Product Name dropdown " + e);
            }//end of prodName drop down exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //enter zip code
            try {
                WebElement zipCodes = driver.findElement(By.xpath("//*[@name='zipCode']"));
                zipCodes.click();
                zipCodes.clear();
               // zipCodes.sendKeys(zipCode.get(1));
            } catch (Exception e) {
                System.out.println("Unable to enter zip Code: " + e);
            }//end of zip code exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            try {
                driver.findElement(By.xpath("//*[@id='quote-submit-button1']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on start a quote: " + e);
            }//end of submit button exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //enter policy start date
            try {
                WebElement effdate = driver.findElement(By.xpath("//*[@name='effectiveDate.effectiveDate']"));
                effdate.click();
                effdate.clear();
                //effdate.sendKeys(policyStart.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter value on effective date: " + e);
            }//end of policyStart exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //enter first name
            try {
                driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(firstName.get(1));
            } catch (Exception e) {
                System.out.println("Unable to enter First Name: " + e);
            }//end of first name exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //enter last name
            try {
                driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(lastName.get(1));
            } catch (Exception e) {
                System.out.println("Unable to enter Last Name: " + e);
            }//end of last name exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //enter street address
            try {
                driver.findElement(By.xpath("//*[@id='street']")).sendKeys(streetAdd.get(1));
            } catch (Exception e) {
                System.out.println("Unable to enter Street Address: " + e);
            }//end of street address exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //enter dob
            try {
                driver.findElement(By.xpath("//*[@id='dateOfBirth']")).sendKeys(dob.get(1));
            } catch (Exception e) {
                System.out.println("Unable to enter dob: " + e);
            }//end of dob exception
            //wait 1.5 seconds
            Thread.sleep(1500);
            //define javascriptexecutor to scroll to continue button
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            try {
                //define web element for continue button
                WebElement continueButton = driver.findElement(By.xpath("//*[@class='btn btn-primary btn-large right']"));
                jse.executeScript("arguments[0].scrollIntoView(true);", continueButton);
                //
                Thread.sleep(1500);
                continueButton.click();
            } catch (Exception e) {
                System.out.println("Unable to click buttton" + e);

            }

        }
    }//end of main
}//end of class

