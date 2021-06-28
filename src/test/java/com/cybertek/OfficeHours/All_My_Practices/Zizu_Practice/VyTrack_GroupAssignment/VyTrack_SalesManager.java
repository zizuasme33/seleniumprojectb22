package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.VyTrack_GroupAssignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VyTrack_SalesManager {

    public static void main(String[] args) {
        SalesManager("salesmanager254", "UserUser123");
        /*
                Added for Sales Manager please check if the code works when ypu run it, in my practice looks good.
                Thanks for creating this practice!
         */


    }
    public static void SalesManager(String userName, String password){
        WebDriverManager.chromedriver().setup();

        //1. Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Given:  I am on VyTrack application login page
            // Go to: https://qa3.vytrack.com/user/login
        driver.get("https://qa3.vytrack.com/user/login");



        //3. When:  I enter valid Username for Sales Manager (salesmanager254)
        WebElement userNameLoginPage = driver.findElement(By.xpath("//*[@id='prependedInput']"));
        userNameLoginPage.sendKeys(userName);



        //4. And: I enter valid Password (UserUser123)
        WebElement passwordLoginPage = driver.findElement(By.xpath("//*[@id='prependedInput2']"));
        passwordLoginPage.sendKeys(password);



        //5. And: I Click Login button
        WebElement clickLoginButton = driver.findElement(By.xpath("//*[@id='_submit']"));
        clickLoginButton.click();



        //6. Then: I should be able to access the Store Manager home page.
                //  Verify title equals:
                //Expected: Dashboard
        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Login Success, I should be able to access the Store Manager home page.");
        }else{
            System.out.println("Login Failed, I should not be able to access the Store Manager home page");
        }






    }
}
