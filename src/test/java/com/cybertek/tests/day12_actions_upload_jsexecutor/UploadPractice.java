package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void upload_test(){

        //TC #14: UploadTest
        // 1.Go to http://practice.cybertekschool.com/upload

        Driver.getDriver().get(" http://practice.cybertekschool.com/upload");

        // 2.Find some small file from your computer, and get the path of it.
        String path = "/Users/henokgolom/Downloads/download.jpeg";

        // 3.Upload the file.

        WebElement  chooseFile = Driver.getDriver().findElement(By.xpath("//*[@id = 'file-upload']"));

        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//*[@id = 'file-submit']"));

        // sending the file path ro the chooseFile WebElement
        chooseFile.sendKeys(path);

        // click to upload button
        uploadButton.click();


        // 4.Assert:
        // -File uploaded text is displayed on the page
        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.xpath("//h3"));

        Assert.assertTrue(fileUploadedMessage.isDisplayed());

        Driver.closeDriver();

    }


}
