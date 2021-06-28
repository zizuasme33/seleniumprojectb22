package com.cybertek.OfficeHours.All_My_Practices.Self_Practice.Practice2WithGroup;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        WebElement search = driver.findElement(By.xpath("//*[@id= 'twotabsearchtextbox']"));
        search.sendKeys("Wooden Spoon");
        search.submit();

        String actualTitle = driver.getTitle();
        // System.out.println(driver.getTitle());  to get title without inspecting manual
        String expectedTile = "Wooden Spoon";

        String check = actualTitle.contains(expectedTile)? "PASSED": "FAILED";
        System.out.println(check);

        //se WebDriverFactory method to call the Google Chrome
        //
        //2. Command Chrome Browser to open YouTube.com
        //
        //3. Maximize the screen
        //
        //4. Locate YouTube search bar By xPath
        //
        //5. Create a WebElement from the located Search Bar xPath
        //
        //6. Reuse the created WebElement to send search content into the serach bar and send "Blue - One Love" to the search bar
        //Put the whole thread to Sleep for 3 seconds
        //
        //7. Resuse the created WebElement and SUBMIT the search
        //Put the whole thread to Sleep for 3 seconds
        //
        //8. Click on the first Music video named: Blue - One Love (Official Music Video) (FEEL FREE TO USE WHATEVER LOCATER YOU WANT - JUST CLICK ON THAT VIDEO)


    }
}
