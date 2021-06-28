package com.cybertek.utilities;

public class BrowserUtils {

    /*
        Method that will accept int
        Wait for given second duration

        // 1sec = 1000 mills seconds
        // 1 * 1000 = 1000

        BrowserUtils.sleep(1); --> 1 seconds

     */

    public static void sleep(int second) {

        second *= 1000;

        try {

            Thread.sleep(second);

        } catch (InterruptedException e) {
            System.out.println("something happened in the sleep method");
        }

    }


}
