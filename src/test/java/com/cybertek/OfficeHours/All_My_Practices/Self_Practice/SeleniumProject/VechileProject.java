package com.cybertek.OfficeHours.All_My_Practices.Self_Practice.SeleniumProject;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VechileProject {

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
        WebElement userName = driver.findElement(By.xpath("//*[@id='prependedInput']"));
        userName.sendKeys("user154");

        //4. And: I enter valid Password (UserUser123)
        WebElement password = driver.findElement(By.xpath("//*[@id='prependedInput2']"));
        password.sendKeys("UserUser123" + Keys.ENTER);

        driver.navigate().refresh();
        WebElement activities = driver.findElement(By.xpath("(//span[@class = 'title title-level-1'])[3]"));
        activities.click();

        WebElement calenderEvents = driver.findElement(By.xpath("//span[.='Calendar Events']"));
        calenderEvents.click();



        WebElement addEvent = driver.findElement(By.xpath("//*[@title='Create Calendar event']"));
        addEvent.click();


        driver.findElement(By.xpath("//input[@data-name='field__title']")).sendKeys("Calender123" + Keys.ENTER);


        WebElement clickSaveButton = driver.findElement(By.xpath("//button[@class='btn btn-success action-button']"));
        clickSaveButton.click();


    }

/*
            public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://qa3.vytrack.com/user/login");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user168");

        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("UserUser123"+ Keys.ENTER);

        driver.navigate().refresh();

        List<WebElement> activitiesButton = driver.findElements(By.xpath("//span[@class='title title-level-1']"));
        activitiesButton.get(2).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[.='Calendar Events']")).click();


        WebElement calendarEvent = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));

        calendarEvent.click();

        driver.findElement(By.xpath("//input[@data-name='field__title']")).sendKeys("Truck Driver");

        driver.findElement(By.xpath("//button[@class='btn btn-success action-button']")).click();
 */
}
