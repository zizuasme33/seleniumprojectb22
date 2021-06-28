package com.cybertek.tests.day12_actions_upload_jsexecutor;

import org.testng.annotations.Test;

public class SingletonPractice {
    
    @Test (priority = 2)
    public void singleton_understanding_test(){
        
        String str1 = Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2);

        String str3 = Singleton.getWord();
        System.out.println("str3 = " + str3);
        
    }

    @Test (priority = 1)
    public void singleton_test2(){
        String str4 = Singleton.getWord();
        System.out.println("str4 = " + str4);
    }
}
