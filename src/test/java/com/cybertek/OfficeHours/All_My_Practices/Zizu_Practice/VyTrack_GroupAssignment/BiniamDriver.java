package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.VyTrack_GroupAssignment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BiniamDriver {


    WebDriver driver;

    // Automate truck driver page
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
        WebElement checkUserName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
// login truck driver in the login page
        // sending user sales manger user name
        checkUserName.sendKeys("user30");
        WebElement checkPassWord = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        // sending sales manger password
        checkPassWord.sendKeys("UserUser123");
        checkPassWord.submit();

        driver.navigate().refresh();
        driver.findElement(By.cssSelector("[type='button']")).click();

    }


    @Test(priority = 1)
    public void logIn() {
        String expected = "Werner Schaden";
        WebElement actual = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
        String actualDisplayed = actual.getText();

        Assert.assertEquals(actualDisplayed, expected, "Registered user not logged in ");
    }


    @Test (priority = 2)
    public void navigateToVehicle() throws InterruptedException {

        // locate fleet menu and click
        WebElement mainMenu = driver.findElement(By.xpath("(//a[@class='unclickable'])[1]"));
        mainMenu.click();
        Thread.sleep(3000);

        // locate vehicle menu and click
        WebElement subMenu = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
        subMenu.click();
        Thread.sleep(3000);

        // locate title above table and isolate total numbers of cars
        WebElement carQuantity = driver.findElement(By.xpath("(//label[@class='dib'])[3]"));
        Thread.sleep(3000);
        String[] num = carQuantity.getText().split(" ");

        // compare if total number of cars is great then 0
        Assert.assertTrue(Integer.parseInt(num[2]) > 0, "Total number of cars is 0");
    }

    @Test (priority = 3)
    public void generalInformationTest() throws InterruptedException {

        // because the page oppened again by putting useer name and password
        // It is needed to open the vehcle information page
        // locate fleet menu and click
        WebElement mainMenu = driver.findElement(By.xpath("(//a[@class='unclickable'])[1]"));
        mainMenu.click();
        Thread.sleep(3000);

        // locate vehicle menu and click
        WebElement subMenu = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
        subMenu.click();
        Thread.sleep(3000);


        //8. Select  any cars

        WebElement clickCars = driver.findElement(By.xpath("//tr[@class='grid-row row-click-action']//td[1]"));
        clickCars.click();
        Thread.sleep(1000);

        //9. verify if page display general information
        WebElement displayPage = driver.findElement(By.xpath("//h5[.= 'General Information']"));

        String expectedDisplayedPAge = "General Information";
        String actualDisplayedPage = displayPage.getText();

        Assert.assertEquals(actualDisplayedPage, expectedDisplayedPAge, "Failed");

    }

    @Test(priority = 4)
    public void addEvent() throws InterruptedException {

        // if we want to use specific to the web element using index number
        //driver.findElement(By.xpath("(//span[@class='title title-level-1'])[3]"));
        List<WebElement> activitiesButton = driver.findElements(By.xpath("(//span[@class='title title-level-1'])"));
        activitiesButton.get(2).click();
        Thread.sleep(3000);

        // to select the calander event
        // driver.findElement(By.xpath("//span[.='Calendar Events']")).click();
        WebElement caladerEventFromActivity = driver.findElement(By.xpath("//span[.='Calendar Events']"));
        caladerEventFromActivity.click();

        // locating creat calander event
        //driver.findElement(By.xpath("//a[@title='Create Calendar event']")).click();

        WebElement clickCreatCalander = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
        Thread.sleep(4000);

        clickCreatCalander.click();

        //Send text to the title

        //driver.findElement(By.xpath("//input[@data-name='field__title']")).sendKeys("B22 Group 11 vacation plan");

        driver.findElement(By.xpath("//input[@data-name='field__title']")).sendKeys("B22 Group 11 vacation plan");

        WebElement saveAndClose = driver.findElement(By.xpath("//button[@class='btn btn-success action-button']"));
        Thread.sleep(4000);
        saveAndClose.click();

    }



    @Test (priority = 5)
    public void resetSettings() throws InterruptedException {

        // Again here also the code begin from the login page so first open the vechile information from the fleet
        // because the page oppened again by putting useer name and password
        // It is needed to open the vehcle information page
        // locate fleet menu and click
        WebElement mainMenu = driver.findElement(By.xpath("(//a[@class='unclickable'])[1]"));
        mainMenu.click();
        Thread.sleep(3000);

        // locate vehicle menu and click
        WebElement subMenu = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));

        subMenu.click();
        Thread.sleep(3000);



        // get how many rows we have in table
        List<WebElement> carTable = driver.findElements(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed'/tbody/tr"));
        int defaultNumberOfRows = carTable.size();
        Thread.sleep(3000);

        // change view per page to 10
        WebElement viewPerPage = driver.findElement(By.cssSelector("button[class='btn dropdown-toggle ']"));
        viewPerPage.click();
        Thread.sleep(4000);
        WebElement  viewPerPageNew = driver.findElement(By.cssSelector("a[data-size='10']"));
        Thread.sleep(3000);
        String expectedNumberOfRows = viewPerPageNew.getText();
        viewPerPageNew.click();


        // get new value for table rows
        List<WebElement> carTableNew = driver.findElements(By.xpath("//table[@class='grid table-hover table table-bordered table-cndensed']/tbody/tr"));
        Thread.sleep(4000);
        int actualNumberOfRows = carTableNew.size();

        // compare if new value (actual = 10)  is equal to expected (expected = 10)
        Assert.assertEquals(actualNumberOfRows,Integer.parseInt(expectedNumberOfRows));

        // locate reset button and click
        WebElement resetButton = driver.findElement(By.cssSelector("a[title='Reset']"));
        resetButton.click();
        Thread.sleep(4000);

        // get actual number of rows after clicking on reset button
        List<WebElement> carTableAfterReset = driver.findElements(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']tbody/tr"));
        actualNumberOfRows = carTableAfterReset.size();
        Thread.sleep(4000);

        // compare actual number of rows with default number of rows after clicking on reset button
        Assert.assertEquals(actualNumberOfRows,defaultNumberOfRows);

    }

//    @AfterClass
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.quit();
//    }

}
