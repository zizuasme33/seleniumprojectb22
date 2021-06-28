package com.cybertek.OfficeHours.OH_day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GroupWork {

    public static class VyTrack {

        public static void main(String[] args) throws InterruptedException {
            TruckDriver("User154", "UserUser123");
            /**
             * Please Create Your role Method and push the code.
             Don't scare to play with github. I have back up :))
             */

              SalesManager("salesmanager254", "UserUser123");
        /*
                Added for Sales Manager please check if the code works when ypu run it, in my practice looks good.
                Thanks for creating this practice!
         */

        }

        public static void TruckDriver(String username1, String password1) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            // 1. Open Chrome browser
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //2. Given I am on login page : https://qa3.vytrack.com/user/login
            driver.get("https://qa3.vytrack.com/user/login");

            //3. When I enter valid Truck Driver User name : User154
            WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
            username.click();
            username.sendKeys(username1);

            //5. And I enter valid Password for user User154 : UserUser123
            WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
            password.click();
            password.sendKeys(password1);
            //6. And Click Login button
            WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));
            loginButton.click();
            Thread.sleep(3000);
            //7. Then I should be able to log in to the application : Verify Login
            String expectedTitle = "Dashboard";
            String actualTitle = driver.getTitle();
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Login Successful for User:" + username1 + "  password: " + password1);
            } else {
                System.out.println("Login Failed for User: "+username1 + "  password: " + password1);
            }
        }

        public static void SalesManager(String userName, String password) {
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

            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Login Success, I should be able to access the Store Manager home page.");
            } else {
                System.out.println("Login Failed, I should not be able to access the Store Manager home page");
            }

        }

    }
}
