package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class P07_WishList {
    WebDriver driver = Hooks.driver;
    JavascriptExecutor js;

    public void MoveToItemImpl() {
        //Here to move to element
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,1600)");
    }

    public void ClickFavoritImpl() {

        driver.findElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/button[3]")).click();

    }

    public void SuccImpl()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        SoftAssert soft=new SoftAssert();

        //Case 1 validate message
        String Expected_Msg="The product has been added to your ";
        String Actual_Msg=driver.findElement(By.xpath("//body[1]/div[5]/div[1]/p[1]")).getText();
        System.out.println("The Actual message is \n" + Actual_Msg);
        soft.assertTrue(Actual_Msg.contains(Expected_Msg),"\n Error with wishlist Message ");

        //Case 2 validate background
        //Here's the question, why it's always red????
        String ExpectedColor="rgba";
        String ActualColor=driver.findElement(By.xpath("//body[1]/div[5]/div[1]/p[1]")).getCssValue("background-color");
        System.out.println("Color is:"+"\n" + ActualColor);
        soft.assertTrue(ActualColor.contains(ExpectedColor),"Not the same color");
        soft.assertAll();

    }

    public void ClickWishListTabImpl() throws InterruptedException {
        //First click X to close pop up message
        driver.findElement(By.xpath("//body[1]/div[5]/div[1]/span[1]")).click();
        /*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));*/
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,0)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Click wishlist tab
        driver.findElement(By.xpath("//body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]/span[1]")).click();

    }

    public void CheckQtyValueImpl()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*String ExpectedValue="1";*/
        String ActaulValue=driver.findElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]")).getAttribute("value");
        System.out.println(ActaulValue);
        Assert.assertTrue("Error with value",ActaulValue.contains("1"));

    }
}


