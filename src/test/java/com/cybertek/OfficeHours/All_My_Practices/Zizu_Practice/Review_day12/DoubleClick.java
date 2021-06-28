package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day12;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClick {




    @Test
    public void test1(){

        // TC #16: Double ClickTest
        // 1.Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        // 2.Switch to iframe.
        WebElement iFrame = Driver.getDriver().findElement(By.xpath("//*[@id='iframeResult']"));
        Driver.getDriver().switchTo().frame(iFrame);

        BrowserUtils.sleep(1);
        WebElement doubleClick = Driver.getDriver().findElement(By.xpath("//*[@id='demo']"));

        BrowserUtils.sleep(1);
        // 3.Double click on the text “Double-click me to change my text color.
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(doubleClick).doubleClick().perform();
        // ”4.Assert: Text’s “style” attribute value contains “red”.
        BrowserUtils.sleep(1);
        WebElement colorChange = Driver.getDriver().findElement(By.xpath("//*[@style = 'color: red;']"));


        Assert.assertTrue(colorChange.isDisplayed());

    }

}
