package Automation_AI05;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class InClass_ActionItemnew {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start-maximized
        options.addArguments("start-maximized");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //declare an array list
        ArrayList<String> zipCodes = new ArrayList<>();
        zipCodes.add("11229");
        zipCodes.add("11203");

        ArrayList<String> policyStart = new ArrayList<>();
        policyStart.add("05/05/2024");
        policyStart.add("05/06/2024");

        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Smooch");
        firstName.add("Brownie");

        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Johnson");
        lastName.add("Weir");

        ArrayList<String> streetAdd = new ArrayList<>();
        streetAdd.add("1801 Avenue U");
        streetAdd.add("3500 Snyder Avenue");

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
            for (int i = 0; i < 2; i++) {
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
                    WebElement zipCode = driver.findElement(By.xpath("//*[@name='zipCode']"));
                    zipCode.click();
                    zipCode.clear();
                    zipCode.sendKeys(zipCodes.get(i));
                } catch (Exception e) {
                    System.out.println("Unable to enter zip Code: " + e);
                }//end of zip code exception
                //wait 2 seconds
                Thread.sleep(2000);
                try {
                    driver.findElement(By.xpath("//*[@id='quote-submit-button1']")).click();
                } catch (Exception e) {
                    System.out.println("Unable to click on start a quote: " + e);
                }//end of submit button exception
                //wait 2 seconds
                Thread.sleep(2000);
                //enter policy start date
                try {
                    WebElement policyStarts = driver.findElement(By.xpath("//*[@name='effectiveDate.effectiveDate']"));
                    policyStarts.click();
                    policyStarts.clear();
                    policyStarts.sendKeys(policyStart.get(i));
                } catch (Exception e) {
                    System.out.println("Unable to enter value on effective date: " + e);
                }//end of policyStart exception
                //wait 20 seconds
                Thread.sleep(2000);
                //enter First Name
                try {
                    driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(firstName.get(i));
                } catch (Exception e) {
                    System.out.println("Unable to enter First Name: " + e);
                }//end of First Name exception
                //wait 2 seconds
                Thread.sleep(2000);
                //enter Last Name
                try {
                    driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(lastName.get(i));
                } catch (Exception e) {
                    System.out.println("Unable to enter Last Name: " + e);
                }//end of Last Name exception
                //wait 2 seconds
                Thread.sleep(2000);
                //enter Street Address
                try {
                    driver.findElement(By.xpath("//*[@id='street']")).sendKeys(streetAdd.get(i));
                } catch (Exception e) {
                    System.out.println("Unable to enter Street Address: " + e);
                }//end of Street Address exception
                //wait 2 seconds
                Thread.sleep(2000);
                //enter Date of Birth
                try {
                    driver.findElement(By.xpath("//*[@id='dateOfBirth']")).sendKeys(dob.get(i));
                } catch (Exception e) {
                    System.out.println("Unable to enter dob: " + e);
                }//end of Date of Birth exception
                //wait 2 seconds
                Thread.sleep(2000);
                //define javascriptexecutor to scroll to continue button
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                try {
                    //define web element for continue button
                    WebElement Button = driver.findElement(By.xpath("//*[@name='continue']"));
                    //scroll to continue button
                    jse.executeScript("arguments[0].scrollIntoView(true);", Button);
                    Button.click();
                } catch (Exception e) {
                    System.out.println(" unable to click continue:" + e);
                }//end of continue button exception
                //wait 2 second
                Thread.sleep(2000);
                //click continue button again
                try {
                    //define web element for continue button
                    WebElement Button = driver.findElement(By.xpath("//*[@name='continue']"));
                    //scroll to continue button
                    jse.executeScript("arguments[0].scrollIntoView(true);", Button);
                    Button.click();
                } catch (Exception e) {
                    System.out.println(" unable to click continue:" + e);
                }//end of continue button exception
                //wait 1.5 seconds
                Thread.sleep(1500);
                //select value for Fire Protection
                try {
                    WebElement fire = driver.findElement(By.xpath("//*[@id='fireProtectionAreaNameSelectId']"));
                    //select area value from fire protection drop down menu
                    Select fireDropDown = new Select(fire);
                    fireDropDown.selectByValue("BROOKLYN");
                } catch (Exception e) {
                    System.out.println(" Unable to select fire drop down button:" + e);
                }//end of fire drop down button exception
                //wait 1.5 seconds
                Thread.sleep(1500);
                //click continue button again
                try {
                    //define web element for continue button
                    WebElement cont = driver.findElement(By.xpath("//*[@id='continue']"));
                    cont.click();
                } catch (Exception e) {
                    System.out.println("Unable to click on continue button:" + e);
                }//end of continue button exception
                //capture personal info message
                try {
                    String Message = driver.findElement(By.xpath("//*[@class='sfx-pageDescription']")).getText();
                    System.out.println("Personal info message is " + Message);
                } catch (Exception e) {
                    System.out.println("Unable to capture Personal info message" + e);
                }//end of personal info message exception
                //capture email info messages
                try {
                    String Email = driver.findElement(By.xpath("//*[@class='help-block']")).getText();
                    System.out.println("Email info message is" + Email);
                } catch (Exception e) {
                    System.out.println("Unable to capture Email info message" + e);
                }//end of email info message exception
                //capture add a applicant info message
                try {
                    String applicant = driver.findElement(By.xpath("//*[@id='addApplicantDescription']")).getText();
                    System.out.println("Add a Applicant info message is" + applicant);
                } catch (Exception e) {
                    System.out.println("Unable to capture Add a Applicant info message" + e);
                }//end of add an applicant info message exception
                //wait 1.5 seconds
                Thread.sleep(1500);
                //click on add co applicant button
                try {
                    driver.findElement(By.xpath("//*[@id='addApplicantModuleNewAdd']")).click();
                } catch (Exception e) {
                    System.out.println("Unable to click on add co applicant button" + e);
                }//end of co applicant button exception
                //wait 1.5 seconds
                Thread.sleep(1500);
                //enter co applicant first name
                try {
                    driver.findElement(By.xpath("//*[@name='additionalApplicants[0].client.firstName']")).sendKeys(coFirstName.get(i));
                } catch (Exception e) {
                    System.out.println("Unable to enter co applicant first name" + e);
                }//end of co applicant first name exception
                //enter co applicant last name
                try {
                    driver.findElement(By.xpath("//*[@name='additionalApplicants[0].client.lastName']")).sendKeys(coLastName.get(i));
                } catch (Exception e) {
                    System.out.println("Unable to enter co applicant last name" + e);
                }//end of co applicant last name exception
                //click continue button again
                try {
                    //define web element for continue button
                    WebElement cont = driver.findElement(By.xpath("//*[@id='continue']"));
                    cont.click();
                } catch (Exception e) {
                    System.out.println("Unable to click on continue button:" + e);
                }//end of continue button exception
                //wait 1.5 seconds
                Thread.sleep(1500);
                //capture error message
                try {
                    String Error = driver.findElement(By.xpath("//*[@id='sfx_global_alert']")).getText();
                    System.out.println("Error message is" + Error);
                } catch (Exception e) {
                    System.out.println("Unable to capture error message" + e);
                }//end of error message exception
            }//end of for loop
            //quit browser
            driver.quit();
        }//end of main
    }//end of class
}












