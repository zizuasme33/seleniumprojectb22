package com.cybertek.tests.day10_webtable_properties_practice;

import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class DriverUsingExamples {

    @Test
    public void howToUseDriver() {
        //Driver.getDriver() ===> driver
        
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");

    }

}
