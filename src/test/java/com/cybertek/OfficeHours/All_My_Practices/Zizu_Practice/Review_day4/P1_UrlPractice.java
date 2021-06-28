package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_UrlPractice {
    public static void main(String[] args) {

        //TC #3: Practice Cybertek/ForgotPassword URL verification
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");


        //3. Locate all the WebElements on the page using XPATH and/or CSSlocator only (total of)
        // 6) a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a[class= 'nav-link']"));

        // b. “Forgot password” header
        WebElement forgotPassword = driver.findElement(By.tagName("h2"));

        // c. “E-mail” text
        WebElement email = driver.findElement(By.cssSelector("label[for= 'email']"));

        // d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[name= 'email']"));

        // e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id= 'form_submit']"));

        // f. “Powered byCybertek School” text
        WebElement powerCybertek = driver.findElement(By.cssSelector("div[style= 'text-align: center;']"));

        // 4. Verify all WebElements are displayed.
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());
        System.out.println("email.isDisplayed() = " + email.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("powerCybertek.isDisplayed() = " + powerCybertek.isDisplayed());


    }
}
