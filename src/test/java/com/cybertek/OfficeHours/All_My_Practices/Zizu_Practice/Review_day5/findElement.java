package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class findElement {
    public static void main(String[] args) {

        //TC #0: FINDELEMENTS
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // 2.Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");

        // 3.Print out the texts of all links

        List<WebElement> textOfLink = driver.findElements(By.xpath("//body//a"));
        for (WebElement each : textOfLink) {
            System.out.println(each.getText());
        }
        int totalLinkText= textOfLink.size();
        int missingText = 180 - totalLinkText;

        System.out.println("totalLinkText = " + totalLinkText);
        System.out.println("missingText = " + missingText);
      
        // 4.Print out how many link is missing text
        // 5.Print out how many link has text6.Print out how many total link

    }
}
