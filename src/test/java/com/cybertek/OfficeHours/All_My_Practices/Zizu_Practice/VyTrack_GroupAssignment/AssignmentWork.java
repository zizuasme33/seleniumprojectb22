package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.VyTrack_GroupAssignment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssignmentWork {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
    }
    @Test
    public void Vytrack_Test() throws InterruptedException {
        ////3. When:  I enter valid Username for Sales Manager (salesmanager254)
        WebElement userNameLoginPage = driver.findElement(By.xpath("//*[@id='prependedInput']"));
        userNameLoginPage.sendKeys("user154");

        //4. And: I enter valid Password (UserUser123)
        WebElement passwordLoginPage = driver.findElement(By.xpath("//*[@id='prependedInput2']"));
        passwordLoginPage.sendKeys("UserUser123");

        //5. And: I Click Login button
        WebElement clickLoginButton = driver.findElement(By.xpath("//*[@id='_submit']"));
        clickLoginButton.click();

        Thread.sleep(2000);
        WebElement fleetDroDown = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetDroDown.click();

     //   WebElement fleetDropInside = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[3]"));
        WebElement fleetDropInside = driver.findElement(By.xpath("(//*[@class='title title-level-2'])[1]"));
        fleetDropInside.click();

        WebElement clickCars = driver.findElement(By.xpath("//*[.= 'Cybertek123']"));
        clickCars.click();

        WebElement dispalyPage = driver.findElement(By.xpath("//h5[.= 'General Information']"));

        String expectedDisplayedPAge = "General Information";
        String actualDisplayedPage = dispalyPage.getText();

        Assert.assertEquals(actualDisplayedPage, expectedDisplayedPAge);

        //System.out.println("clickCars.isDisplayed() = " + clickCars.isDisplayed());

        WebElement moreAction = driver.findElement(By.xpath("//a[@class='btn dropdown-toggle']"));
        moreAction.click();

        WebElement  addAction = driver.findElement(By.xpath("(//a[@class=' no-hash'])[3]"));
        addAction.click();


        driver.findElement(By.xpath("(//*[@type = 'text'])[3]")).sendKeys("Master Selenium" + Keys.ENTER);


        WebElement clickSaveButton = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
        clickSaveButton.click();

      //  driver.navigate().forward();

//
//        WebElement verifyAddEvent = driver.findElement(By.xpath("(//h1)[2]"));
//        verifyAddEvent.click();

        //Thread.sleep(3000);
        WebElement activity = driver.findElement(By.xpath("(//*[@class = 'title title-level-1'])[5]"));
        activity.click();

        WebElement refreshButton = driver.findElement(By.xpath("(//*[@class = 'fa-refresh'])[2]"));
        refreshButton.click();

//        String expectedPage = "Cybertek123 Spartan Alaska 2019 Black - Car - Entities - System - Car - Entities - System";
//       String actualPage = verifyAddEvent.getText();
//
//        Assert.assertEquals(actualPage, expectedPage);

//        WebElement addEvent = driver.findElement(By.xpath("(//*[@class= 'no-hash'])[2]"));
//        addEvent.click();


    }
}
