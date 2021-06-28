package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SalesManagerPractice {
    public static void main(String[] args) throws InterruptedException {

        //1. Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Given:  I am on VyTrack application login page
            // Go to: https://qa3.vytrack.com/user/login
        driver.get("https://qa3.vytrack.com/user/login");



        //3. When:  I enter valid Username for Sales Manager (salesmanager254)

        WebElement userNameLoginPage = driver.findElement(By.xpath("//*[@id='prependedInput']"));
        userNameLoginPage.sendKeys("salesmanager254");
        //userNameLoginPage.click();


        //4. And: I enter valid Password (UserUser123)
        WebElement passwordLoginPage = driver.findElement(By.xpath("//*[@id='prependedInput2']"));
        passwordLoginPage.sendKeys("UserUser123");
        //passwordLoginPage.click();


        //5. And: I Click Login button
       WebElement clickLoginButton = driver.findElement(By.xpath("//*[@id='_submit']"));
        clickLoginButton.click();


//        WebElement clickFleetButton = driver.findElement(By.xpath("//*[@ class='dropdown dropdown-level-1'][1]"));
//        clickLoginButton.click();
        WebElement clickFleetButton = driver.findElement(By.xpath("(//*[@class='unclickable'])[1]"));
        clickFleetButton.click();
        WebElement clickDriverButton = driver.findElement(By.xpath("//*[@ style = 'max-height: 272px;']"));
        clickDriverButton.click();




        //6. Then: I should be able to access the Store Manager home page.
        // 7. Verify title equals:
                //Expected: Dashboard
        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }


    }
}
