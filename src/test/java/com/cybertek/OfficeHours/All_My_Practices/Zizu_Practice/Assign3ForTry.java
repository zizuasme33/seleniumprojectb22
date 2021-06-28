package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Assign3ForTry {
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


        //Thread.sleep(3000);
//        WebElement clickFleetButton = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span/text()"));
//        clickFleetButton.submit();

        Select clickFleetButton = new Select (driver.findElement(By.xpath("(//*[@class='dropdown dropdown-level-1'])[1]")));
       // clickFleetButton.click();

        Thread.sleep(1000);
//        WebElement clickDriverButton = driver.findElement(By.xpath("//*[@ style = 'max-height: 272px;']"));
//        clickLoginButton.click();

//        Thread.sleep(1000);
//        WebElement clickAnyButton = driver.findElement(By.xpath("(//*[@class= 'grid-row row-click-action'])[1]"));
//        clickLoginButton.click();
//
//        Thread.sleep(1000);
//        WebElement clickAddActivity = driver.findElement(By.xpath("//*[@id ='94']"));
//        clickLoginButton.click();


    }
}
