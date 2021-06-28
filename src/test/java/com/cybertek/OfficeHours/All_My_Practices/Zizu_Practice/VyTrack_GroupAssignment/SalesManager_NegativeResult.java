package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.VyTrack_GroupAssignment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SalesManager_NegativeResult {

    public static void main(String[] args) throws InterruptedException {
        //1. Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Given:  I am on VyTrack application login page
        // Go to: https://qa3.vytrack.com/user/login
        driver.get("https://qa3.vytrack.com/user/login");


        //3. When:  I enter invalid Username for Sales Manager (salesmanager200)
        WebElement userNameLoginPage = driver.findElement(By.xpath("//*[@id='prependedInput']"));
        userNameLoginPage.sendKeys("salesmanager254");
        //userNameLoginPage.click();


        //4. And: I enter invalid Password (UserUser123)
        WebElement passwordLoginPage = driver.findElement(By.xpath("//*[@id='prependedInput2']"));
        passwordLoginPage.sendKeys("UserUser121");
        // passwordLoginPage.click();
        Thread.sleep(2000);


        //5. And: I Click Login button
        WebElement clickLoginButton = driver.findElement(By.xpath("//*[@id='_submit']"));
        clickLoginButton.click();



        //6. Then: I should not be able to access the Store Manager home page.
        // 7. Verify title
            //Expected: Login
        String actualTitle = driver.getTitle();
        //System.out.println("Actual Title = " + actualTitle);

        String expectedTitle = "Login";
        System.out.println("Expected Title = " + expectedTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }


    }
}
