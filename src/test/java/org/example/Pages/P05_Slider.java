package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class P05_Slider {
    WebDriver driver= Hooks.driver;
    JavascriptExecutor js;

    public void HomePageImplementation()
    {
        driver.get("https://demo.nopcommerce.com/");

    }


    public void FirSliderImplementation() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,400)");
        //driver.findElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
        driver.findElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();

    }

    public void FirstScenarionImplementation()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String Expected="https://demo.nopcommerce.com/nokia-lumia-1020";
        String Actual=driver.getCurrentUrl();
        //System.out.println("Actual URL YA Hassan" +Actual + "\n");
        Assert.assertFalse("Different Actual URL",Actual.equals(Expected));
    }

    public void ClicksecondScenarioImplmentation() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,300)");
        driver.findElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //To see clicking on slider action
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]")).click();


    }
    public void SecondScenarioImpl()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String Expected="https://demo.nopcommerce.com/iphone-6";
        String Actual=driver.getCurrentUrl();
        //System.out.println("Actual URL YA Hassan" +Actual + "\n");
        Assert.assertFalse("Different Actual URL",Actual.equals(Expected));


    }

}
