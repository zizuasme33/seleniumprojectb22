package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day12;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTC17_RightClickTC18 {

    @Test
    public void test16_hoverTest() {
        //TC #16: Hover Test
        // 1.Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        // 2.Drag and drop the small circle to bigger circle.

        Actions actions = new Actions(Driver.getDriver());
        WebElement dragAndDropdown = Driver.getDriver().findElement(By.xpath("//*[@id = 'draggable']"));
        WebElement dragDropTarget = Driver.getDriver().findElement(By.xpath("//*[@id = 'droptarget']"));
        actions.dragAndDrop(dragAndDropdown, dragDropTarget).perform();

        String expectedText = "You did great!";
        String actualText = Driver.getDriver().findElement(By.xpath("//*[.= 'You did great!']")).getText();
        // 3.Assert:
        // -Text in big circle changed to: “You did great!”

        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    public void test17_homeWork() {
        //TC #17: Context Click –HOMEWORK
        // 1.Go to https://the-internet.herokuapp.com/context_menu
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        // 2.Right click to the box.
        WebElement rightClick = Driver.getDriver().findElement(By.xpath("//*[@id ='hot-spot']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(rightClick).perform();

        // 3.Alert will open.
        BrowserUtils.sleep(1);
        Alert alert =Driver.getDriver().switchTo().alert();
        alert.accept();
        // 4.Accept alertNo assertion needed for this practice.
    }

}
