package com.cybertek.OfficeHours.All_My_Practices.PracticeUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SmartBearUtils {

    public static void printNamesAndCities(WebDriver driver) {

        List<WebElement> lisOfAlNames = driver.findElements(By.xpath("//table[@class = 'SampleTable']//td[2]"));
        List<String> name = new ArrayList<String>();

        for (WebElement each : lisOfAlNames) {
           name.add(each.getText());
        }
        List<WebElement> city = driver.findElements(By.xpath("//table[@class = 'SampleTable']//td[7]"));

        List<String> city1 = new ArrayList<String>();
        for (WebElement each : city) {

            city1.add(each.getText());

        }

        for (int i = 0, j = 0, k = 0; i < name.size(); i++)
            System.out.println("Name" + ++j + ":" + name.get(i) + "," + "City" + ++k + ":" + city1.get(i));


    }
}
