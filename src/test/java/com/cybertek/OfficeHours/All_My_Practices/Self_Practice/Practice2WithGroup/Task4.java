package com.cybertek.OfficeHours.All_My_Practices.Self_Practice.Practice2WithGroup;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task4 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd\"");

        WebElement email = driver.findElement(By.xpath("//*[@id='login-username']"));
        email.sendKeys("batch22@yahoo.com");
        email.submit();

        WebElement password = driver.findElement(By.xpath("//*[@id='login-passwd']"));
        password.sendKeys("Feb21@2021" );


        String actulTitle = driver.getTitle();
        String expectedTitle = "Yahoo";

        String check = actulTitle.equals(expectedTitle)? "PASSED":"FAiLED";
        System.out.println(check);

        WebElement loginButton = driver.findElement(By.xpath("//*[@id='login-signin']"));
        loginButton.click();

        //SetUp The chrome Driver Calling WebDriver Manager / Bonigarcia Dependencies (Not the Method)
        //
        //2. Access the Yahoo Email Login page with this link: "https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd"
        //
        //3. Make the browser screen => fullscreen
        //
        //4. Check the title of the Yahoo page with an IF statement
        //
        //5. Locate the username space By ID
        //
        //6. Send the username credentials to the located username space. Use "batch22@yahoo.com" - as username
        //Put the whole thread to Sleep for 3 seconds
        //
        //7. Click NEXT to go to the next (Password insert space)
        //
        //8. Locate the password space By ID
        //Put the whole thread to Sleep for 3 seconds
        //
        //9. Send the password credentials to the located password space. Use "Feb21@2021" - as password
        //
        //10 Click LOGIN button
        //Put the whole thread to Sleep for 3 seconds
        //
        //11. Checking the new title Put a new IF condition Stating "Login Successful" as true - "Failed to Login" as false of your last IF condition. Note that still comparin actual and expected title

        // Strudent

        // WebDriver driver = WebDriverFactory.getDriver("chrome");
        //        driver.manage().window().maximize();
        //        driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%22);
        //
        //        String expectedTitle = "Yahoo";
        //        String actualTitle = driver.getTitle();
        //
        //        if (expectedTitle.equals(actualTitle)){
        //            System.out.println("verification was successful.");
        //        }else{
        //            System.out.println("verification had failed");
        //        }
        //
        //        WebElement username = driver.findElement(By.xpath("//input[@id='login-username']"));
        //        username.sendKeys("batch22@yahoo.com");
        //        Thread.sleep(1000);
        //
        //        username.submit();
        //
        ////        WebElement signinbutt1 = driver.findElement(By.xpath("//input[@id='login-signin']"));
        ////        signinbutt1.click();
        //
        //        Thread.sleep(1000);
        //
        //        WebElement password = driver.findElement(By.xpath("//input[@id='login-passwd']"));
        //        password.sendKeys("Feb21@2021");
        //
        //        Thread.sleep(1000);
        //
        ////        WebElement signinbutt2 = driver.findElement(By.xpath("//button[@id='login-signin']"));
        ////        signinbutt2.click();
        //        password.submit();
        //
        //        String expectedTitle2 = "(8 unread) - batch22@yahoo.com - Yahoo Mail";
        //        String actualTitle2 = driver.getTitle();
        //
        //        System.out.println(actualTitle2.equals(expectedTitle2) ? "Pass" : "Fail");
        //
        //        Thread.sleep(3000);
        //
        //driver.quit();
        //    }
        //}
    }
}
