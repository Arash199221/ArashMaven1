package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoTest1 {

    @Test
    public void print1()
    {

        System.setProperty("webdriver.chrome.driver", "src//main//resources//drivers//mac//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {}
        driver.quit();
        System.out.println("Print 1");
        Assert.assertEquals(10,10);
    }

    @Test
    public void print2()
    {
        System.out.println("Print 2");
        Assert.assertEquals(10,10);
    }
}
