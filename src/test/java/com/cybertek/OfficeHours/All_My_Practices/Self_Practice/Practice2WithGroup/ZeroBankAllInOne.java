package com.cybertek.OfficeHours.All_My_Practices.Self_Practice.Practice2WithGroup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankAllInOne {
    /*
    Zero Bank Project:





5. Send keys for both login credential spaces - meaning for Username and Password

6. Access to the login page / dashboard right after entering keys.

7. Check the Page Title and make sure that is the expected Title with condition

8. Switch among the TABS and come to the TRANSFER FUNDS tab

9. Locate From Account and Choose the Savings account with "$ 1548"

10. Locate  To Account andChoose the account with  "-$500.2"

11. Locate Amount space and Insert "$750"

12. Locate description space and insert "Save someone from Bankruptcy :)" and CLICK Submit Button

RESULT PAGE: "You successfully submitted your transaction."


Message #online-class-chat
     */

    public static void main(String[] args) throws InterruptedException {

        //1. Open Google Browser

        //2. Go to http://zero.webappsecurity.com/   and make the screen full screen

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(" http://zero.webappsecurity.com");

      //  3. Click on the Sign In Button
     //  4. Locate USERNAME and PASSWORD spaces

      //  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.id("signin_button")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password"+ Keys.ENTER);

        driver.findElement(By.className("secondary-button small-link")).click();

        Thread.sleep(3000);

        //driver.findElement(By.id())

        String actualTitle = driver.getTitle();
        String expectedTitle = ("Zero - Account Summary");

       if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title value verification PASSED!");
        }else {
            System.out.println("Title value verification FAILED!!!");
        }




    }
}
