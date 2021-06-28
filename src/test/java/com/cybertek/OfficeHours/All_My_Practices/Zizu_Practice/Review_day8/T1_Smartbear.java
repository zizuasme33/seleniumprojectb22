package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day8;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.OfficeHours.All_My_Practices.PracticeUtils.SmartBearUtils;
import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_Smartbear {

    WebDriver driver;

    @BeforeMethod

    public void setUpMethod() {

        // TC #1: Smartbear software link verification
        // 1.Open browser
        // 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test
    public void task1() {
        // 3.Enter username: “Tester”
        WebElement username = driver.findElement(By.xpath("//*[@id ='ctl00_MainContent_username']"));
        username.sendKeys("Tester");

        // 4.Enter password: “test”
        WebElement password = driver.findElement(By.xpath("//*[@id ='ctl00_MainContent_password']"));
        password.sendKeys("test");

        // 5.Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id ='ctl00_MainContent_login_button']"));
        loginButton.click();


        // 6.Print out count of all the links on landing page
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        // 7.Print out each link text on this page
        for (WebElement eachLinks : allLinks) {

            System.out.println(eachLinks.getText());

        }



    }

    @Test
        public void task2() throws InterruptedException {
        // 3.Enter username: “Tester”
        WebElement username1 = driver.findElement(By.xpath("//*[@id ='ctl00_MainContent_username']"));
        username1.sendKeys("Tester");

        // 4.Enter password: “test”
        WebElement password1 = driver.findElement(By.xpath("//*[@id ='ctl00_MainContent_password']"));
        password1.sendKeys("test");

        // 5.Click to Login button
        WebElement loginButton1 = driver.findElement(By.xpath("//*[@id ='ctl00_MainContent_login_button']"));
        loginButton1.click();



        //6.Click on Order
        WebElement order = driver.findElement(By.xpath("(//*[.='Order'])[2]"));
        order.click();
        Thread.sleep(2000);
        //7.Select familyAlbum from product,
        Select familyAlbum = new Select(driver.findElement(By.xpath("(//*[@onchange = 'productsChanged()'])[1]")));
        familyAlbum.selectByVisibleText("FamilyAlbum");

       // set quantity to 2
        WebElement quantity = driver.findElement(By.xpath("(//*[@type = 'text'])[1]"));
        quantity.sendKeys("2");

        // 8.Click to “Calculate” button

        WebElement calculate = driver.findElement(By.xpath("//*[@value= 'Calculate']"));
        calculate.click();

        // 9.Fill address Info with JavaFaker

        Faker faker = new Faker();
        String fullName = faker.name().fullName();

        // •Generate: name, street, city, state, zip code
        WebElement name = driver.findElement(By.xpath("(//*[@style= 'width:200px;'])[1]"));
            name.sendKeys(fullName);


            WebElement  streetField = driver.findElement(By.xpath("(//*[@style= 'width:200px;'])[2]"));
            String street =  faker.address().streetAddress();
            streetField.sendKeys(street);

            WebElement cityFiel = driver.findElement(By.xpath("(//*[@style= 'width:200px;'])[3]"));
            String city = faker.address().city();
            cityFiel.sendKeys("Alexandria");

            WebElement stateField = driver.findElement(By.xpath("(//*[@style= 'width:200px;'])[4]"));
            String state = faker.address().state();
            stateField.sendKeys(state);

            WebElement zipCode = driver.findElement(By.xpath("(//*[@style= 'width:200px;'])[5]"));
            String zip = faker.address().zipCode().substring(0, 5);
            zipCode.sendKeys(zip);




        // 10.Click on “visa” radio button

        WebElement radioButton = driver.findElement(By.xpath("//*[@value= 'Visa']"));
        radioButton.click();

        // 11.Generate card number using JavaFaker
        WebElement visa = driver.findElement(By.xpath("//*[@id = 'ctl00_MainContent_fmwOrder_TextBox6']"));
        String creditCard = faker.finance().creditCard().replace("-", "");
        visa.sendKeys(creditCard);

        WebElement visaExpiration = driver.findElement(By.xpath("//*[@id = 'ctl00_MainContent_fmwOrder_TextBox1']"));
        String creditCardExp = faker.business().creditCardExpiry().substring(5).replace("-", "/");
        visaExpiration.sendKeys(creditCardExp);

     //   String chuckNorris = faker.chuckNorris().fact();
        // 12.Click on “Process”
        WebElement process = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        process.click();
        // 13.Verify success message “New order has been successfully added.”

        WebElement success = driver.findElement(By.xpath("//strong "));
        String expectedSuccessMessage = "New order has been successfully added.";
        String actualSuccessMessage = success.getText();

        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage);



    }

    @Test
    public void test3() {

       // TC#3: Smartbear software order verification
       // 1.Open browser and login to Smartbear software

         WebElement username2 = driver.findElement(By.xpath("//*[@id ='ctl00_MainContent_username']"));
        username2.sendKeys("Tester");

        // 4.Enter password: “test”
        WebElement password2 = driver.findElement(By.xpath("//*[@id ='ctl00_MainContent_password']"));
        password2.sendKeys("test");

        // 5.Click to Login button
        WebElement loginButton2 = driver.findElement(By.xpath("//*[@id ='ctl00_MainContent_login_button']"));
        loginButton2.click();

      //  2.Click on View all orders
        WebElement viewOrders = driver.findElement(By.xpath("//a[.='View all orders']"));
        viewOrders.click();

       //   3.Verify Susan McLaren has order on date “01/05/2010"
        String expectedOrderDate = "01/05/2010";
        String actualOrderDate = driver.findElement(By.xpath("//table//td[.='01/05/2010']")).getText();

        Assert.assertEquals(actualOrderDate, expectedOrderDate);


    }

    @Test
    public void task4_Names_and_City() {
        SmartBearUtils.printNamesAndCities(driver);
    }




}
