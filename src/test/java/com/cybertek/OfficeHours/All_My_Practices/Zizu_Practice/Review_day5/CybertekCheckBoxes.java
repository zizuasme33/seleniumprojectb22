package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CybertekCheckBoxes {
    public static void main(String[] args) {

        //Practice: Cybertek Checkboxes

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //1. Go to http://practice.cybertekschool.com/checkboxes
        driver.get("http://practice.cybertekschool.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        WebElement checkBox1 = driver.findElement(By.xpath("//div//form//input[1]"));
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkBox2 = driver.findElement(By.xpath("//div//form//input[2]"));
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());

        //4. Click checkbox #1 to select it.
        checkBox1.click();

        //5. Click checkbox #2 to deselect it.
       checkBox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox #1 is SELECTED = " + checkBox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox #2 is NOT selected = " + checkBox2.isSelected());


    }
}
