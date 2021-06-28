package com.cybertek.OfficeHours.All_My_Practices.Self_Practice.Practice2WithGroup;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.cargurus.com/");
        WebElement makeModel = driver.findElement(By.xpath("//*[@id='carPickerUsed_makerSelect']"));
        makeModel.sendKeys("BMW" + Keys.ENTER);
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);

        WebElement bodyStyle = driver.findElement(By.xpath("//*[@id='carPickerUsed_modelSelect']"));
        bodyStyle.sendKeys("M6" + Keys.ENTER);
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);

        WebElement  zipCode = driver.findElement(By.xpath("//*[@id='dealFinderZipUsedId_dealFinderForm']"));
        zipCode.sendKeys("22304" + Keys.ENTER);


        WebElement search = driver.findElement(By.xpath("//*[@id='dealFinderForm_0']"));
        search.click();

        WebElement year = driver.findElement(By.xpath("//*[@name='selectedStartYear']"));
        year.sendKeys("2013");
        year.click();
        Thread.sleep(2000);

        WebElement year2 = driver.findElement(By.xpath("//*[@name='selectedEndYear']"));
        Select yearTo = new Select (year2);
        yearTo.selectByVisibleText("2019");

        year2.click();
        Thread.sleep(2000);

        WebElement search2 = driver.findElement(By.xpath("//*[@class='_5yVyi9 _3CLNo6 _5ALSyT']"));
        search2.click();
        search.submit();

        //SetUp WebDriver and get "https://www.cargurus.com/"
        //
        //2. Maximize the window
        //
        //3. Give 3 seconds break to the DRIVER - do NOT use Thread.sleep
        //
        //4. Click on Make/Model and Select BMW
        //
        //5. Click on Body Style and Select M6
        //
        //6. Click on Zip area and send your local ZIPCODE + Click Search
        //
        //7. On the following page click on the FROM Year (which is the first on the left) and choose 2013
        //
        //8. Click on the TO year - which is the one on the right and choose 2019
        //
        //9. Click Search
        //
        //10. Hold WebDriver for 3 seconds to help the search results page to fully load (do NOT use Thread.sleep)
        //
        //11. On the Search result page inspect the whole html of the page, collect all the links and set up a condition to seperate the car related links from the
        //
        //other links. PRINT: The numbers of ALL links and the links with only Car in TWO seperate Print Statements. ONCE AGAIN - We are Printing ONLY AND ONLY the
    }
}
