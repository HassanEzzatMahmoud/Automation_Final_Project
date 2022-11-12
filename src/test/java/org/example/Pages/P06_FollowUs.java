package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.ArrayList;

public class P06_FollowUs {
    WebDriver driver= Hooks.driver;
    JavascriptExecutor js;

    public void FooterImplementation()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        driver.get("https://demo.nopcommerce.com/");
        js.executeScript("window.scroll(0,2600)");

    }
    public void ClickFacebookImplementation(String XpathIm)
    {
        driver.findElement(By.xpath(XpathIm)).click();

    }
    public void FaceBookTabImplementation( String ExpectedIm)
    {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window(tabs.get(1));
        String Expected=ExpectedIm;
        String Actual=driver.getCurrentUrl();
        System.out.println("tab 1:  " +driver.getCurrentUrl());
        Assert.assertTrue("Error with the Open tab",Actual.equals(Expected));
        driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + driver.getCurrentUrl());
        driver.close();
    }

}
