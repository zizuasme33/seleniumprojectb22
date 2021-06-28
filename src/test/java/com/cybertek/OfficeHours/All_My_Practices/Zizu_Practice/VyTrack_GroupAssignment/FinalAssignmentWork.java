package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.VyTrack_GroupAssignment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class FinalAssignmentWork {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
    }
    @Test
    public void Vytrack_Test() throws InterruptedException {
        //2. When:  I enter valid Username for Truck driver (user154)
        WebElement userNameLoginPage = driver.findElement(By.xpath("//*[@id='prependedInput']"));
        userNameLoginPage.sendKeys("user154");


        //4. And: I enter valid Password (UserUser123)
        WebElement passwordLoginPage = driver.findElement(By.xpath("//*[@id='prependedInput2']"));
        passwordLoginPage.sendKeys("UserUser123");


        //5. And: I Click Login button
        WebElement clickLoginButton = driver.findElement(By.xpath("//*[@id='_submit']"));
        clickLoginButton.click();
        Thread.sleep(1000);

        //6. Navigate fleet menu
        WebElement fleetDroDown = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetDroDown.click();

       //7.  select Vehicle page
        WebElement fleetDropInside = driver.findElement(By.xpath("(//*[@class='title title-level-2'])[1]"));
        fleetDropInside.click();
        Thread.sleep(1000);

        //8. Select  any cars
        WebElement clickCars = driver.findElement(By.xpath("//tr[@class='grid-row row-click-action']//td[1]"));
        clickCars.click();
        Thread.sleep(1000);

        //9. verify if page display general information
        WebElement displayPage = driver.findElement(By.xpath("//h5[.= 'General Information']"));

        String expectedDisplayedPAge = "General Information";
        String actualDisplayedPage = displayPage.getText();

        Assert.assertEquals(actualDisplayedPage, expectedDisplayedPAge, "Failed");


//        //10. navigate add event
        WebElement addAction = driver.findElement(By.xpath("//*[@data-id = '127']"));
        addAction.click();

        //11. Add event
        driver.findElement(By.xpath("//*[@data-name ='field__title']")).sendKeys("Calender123" + Keys.ENTER);

        //12. saving event text
        WebElement clickSaveButton = driver.findElement(By.xpath("(//*[@type ='submit'])[2]"));
        clickSaveButton.click();

        Thread.sleep(4000);

        driver.navigate().refresh();


       //13. Verify that truck driver can reset setting.
        Thread.sleep(2000);

        WebElement activity = driver.findElement(By.xpath("(//*[.='Activity'])[2]"));
        activity.click();

        Thread.sleep(2000);
        WebElement refreshButton = driver.findElement(By.xpath("//*[@class = 'fa-refresh hide-text']"));
        refreshButton.click();







    }
//
//    @After
//    public void tearDown() throws InterruptedException {
//
//        Thread.sleep(3000);
//        driver.quit();
//    }
}
