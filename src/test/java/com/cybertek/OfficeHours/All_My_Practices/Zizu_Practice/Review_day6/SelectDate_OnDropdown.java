package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day6;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDate_OnDropdown {
    WebDriver driver;

    @BeforeClass

    public void setUp(){
        //TC #3: Selecting date on dropdown and verifying
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown


        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test

    public void test1(){

        // 3.Select “December 1st, 1922” and verify it is selected.
        // Select year using: visible text
        Select year = new Select (driver.findElement(By.xpath("//*[@id='year']")));
        year.selectByVisibleText("1992");
        // Select month using : value attribute
        Select month = new Select (driver.findElement(By.xpath("//*[@id='month']")));
       month.selectByValue("5");
        // Select day using: index number
        Select date = new Select (driver.findElement(By.xpath("//*[@id='day']")));
        date.selectByIndex(0);

        WebElement yearVerification = driver.findElement(By.xpath("(//h6)[2]"));

       String expected = "1";
       String actual = date.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected, "FAILED!!");

    }

    @Test
    public void test2() throws InterruptedException {
        //3.Select all the options from multiple select dropdown.
        WebElement select = driver.findElement(By.xpath("//*[@name ='Languages']"));
        Select selectAll = new Select(select);
        List<WebElement> value = selectAll.getOptions();
        for (WebElement each : value) {
            each.click();
            Thread.sleep(1000);
            // 4.Print out all selected values.
            System.out.println(each.getText());
        }

        // 5.Deselect all values.
        selectAll.deselectAll();




    }

    @Test
    public void test3() throws InterruptedException {
        //3.Click to non-select dropdown
        WebElement nonSelectDropdown = driver.findElement(By.xpath("//*[@id = 'dropdownMenuLink']"));
        nonSelectDropdown.click();
        // 4.Select Facebook from dropdown
        WebElement facebook = driver.findElement(By.xpath("(//*[@class ='dropdown-item'])[4]"));
        facebook.click();
        Thread.sleep(1000);
        // 5.Verify title is “Facebook -Log In or Sign Up”

        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";

        Assert.assertEquals(actualTitle,expectedTitle);
    }

}
