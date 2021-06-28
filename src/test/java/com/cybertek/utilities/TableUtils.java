package com.cybertek.utilities;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class TableUtils {

    //PRACTICE #4: Method: verifyOrder
    //• Create a method named verifyOrder in TableUtils class.
    //• Method takes WebDriver object and String(name).
    //• Method should verify if given name exists in orders.
    //• This method should simply accepts a name(String), and assert whether
    //given name is in the list or not.
    //• Create a new TestNG test to test if the method is working as expected.

    public static void verifyOrder(WebDriver driver, String name) {

        // locate all thr name from table and store them in a List of WebElements
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='table1']//tr/td[2]"));

        // to introduce local variables
        // mac: option e+ enter

        for (WebElement each : allNames) {
            if (each.getText().equals(name)) {
                Assert.assertTrue(true);
                return; // exit completely from the loop
            }

        }

      //  Assert.fail("this file will fail the code");

        Assert.assertTrue(false, "Name does not exist in the list");

    }

    // List<String> names = new ArrayList<>();
    //        List<String> emails = new ArrayList<>();
    //        for (WebElement eachNames : allNames) {
    //            names.add(eachNames.getText());
    //        }
    //        for (WebElement eachEmail : allEmails) {
    //            emails.add(eachEmail.getText());
    //        }
    //        for (int i = 0; i < names.size(); i++) {
    //            System.out.println("Name: " + names.get(i) + " ," + " Email1: " + emails.get(i));
    //        }
    //    }

    public static void printNamesAndEmails(WebDriver driver){

       List<WebElement> listAllNames = driver.findElements(By.xpath("//table[@id='table1']//td[2]"));
       List<WebElement> listAllEmails = driver.findElements(By.xpath("//table[@id='table1']//td[3]"));

       List<String> names = new ArrayList<String>();
        for (WebElement eachNames : listAllNames) {
            names.add(eachNames.getText());
        }

        List<String> emails = new ArrayList<String>();
        for (WebElement eachEmail : listAllEmails) {
            emails.add(eachEmail.getText());
        }

        for (int i = 0, j = 0, k = 0; i < names.size(); i++) {
            System.out.println("Name" + ++j + ": " + names.get(i) + " ," + " Email" + ++k+ ": "+ emails.get(i));
        }





    }

}
