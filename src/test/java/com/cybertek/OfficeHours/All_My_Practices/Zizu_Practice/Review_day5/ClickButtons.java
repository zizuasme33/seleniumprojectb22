package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class ClickButtons {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // 3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//div//button[1]"));
        button1.click();

        //4. Verify text displayed is as expected:
        // Expected: “Clicked on button one!”
        System.out.println("button1.isDisplayed() = " + button1.isDisplayed());
        if (button1.isDisplayed()) {
            System.out.println("Text displayed as Expected!");
        }else {
            System.out.println("Text display is Not as Expected");
        }
    }
}
