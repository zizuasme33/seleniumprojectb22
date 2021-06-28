package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day6;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class checkboxButton {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: SeleniumEasy CheckboxVerification–Section 1
        // 1.Open Chrome browser
      //  WebDriver driver = WebDriver
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // 2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");



        // 3.Verify “Success –Check box is checked” message is NOT displayed.
        WebElement checkBox = driver.findElement(By.xpath("(//*[@class = 'panel-body'])[2]"));

        String expectedDisplay = "Success –Check box is checked";
        String actualExpected = checkBox.getText();
        if (actualExpected.equals(expectedDisplay)) {
            System.out.println("Success –Check box is checked message is NOT displayed");
        }else {
            System.out.println("Success –Check box is checked” message is NOT displayedd");
        }


        // 4.Click to checkbox under “Single Checkbox Demo” section
        WebElement singleCheckBox = driver.findElement(By.xpath("//*[@id='isAgeSelected']"));
        singleCheckBox.click();


        // 5.Verify “Success –Check box is checked” message isdisplayed.

        String expectedSuccessCheckBox = "Success - Check box is checked";
        String actualSuccessCheckBox = driver.findElement(By.xpath("//*[@id='txtAge']")).getText();

        if (actualSuccessCheckBox.equals(expectedSuccessCheckBox)) {
            System.out.println("Success –Check box is checked message is displayed");
        }else {
            System.out.println("Success –Check box is checked message is Not displayed.");
        }

        //TC #3: SeleniumEasy CheckboxVerification–Section 2
        // 1.Open Chrome browser
        //  WebDriver driver = WebDriver
        //3.Verify “Check All” button text is “Check All”
        WebElement checkAll = driver.findElement(By.xpath("//*[@id='check1']"));

        String expectedCheckAllText = "Check All";
        String actualCheckAllText = checkAll.getAttribute("value");

        if (actualCheckAllText.equals(expectedCheckAllText)) {
            System.out.println("Passed, Check All” button text is “Check All”");
        }else {
            System.out.println("Check All” button text is not displayed");
        }


        // 4.Click to “Check All” button
        WebElement checkAllButton = driver.findElement(By.xpath("//*[@id = 'check1']"));
        checkAllButton.click();

        // 5.Verify all check boxes are checked
        List<WebElement> checkAllBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement each : checkAllBoxes) {
            if (each.isSelected()){
                System.out.println("Passed check box are selected ");
            }else {
                System.out.println("Failed check box are not selected ");
            }

        }
        // 6.Verify button text changed to “Uncheck All”
        WebElement uncheckAll = driver.findElement(By.xpath("//*[@id='check1']"));
        String expectedUncheckAll = "Uncheck All";
        String actualUncheckAll = uncheckAll.getAttribute("value");
        if (actualCheckAllText.equals(expectedCheckAllText)) {
            System.out.println("PASSED! verification with Uncheck All");

        }else {
            System.out.println("Failed! did not verify with Uncheck All");
        }




    }
}
