package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class P3_Search {

    JavascriptExecutor js;
    WebDriver driver= Hooks.driver;

    public void PN(String PN)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,0)");
        WebElement SearchField= driver.findElement(By.xpath("//body[1]/div[6]/div[1]/div[2]/div[2]/form[1]/input[1]"));
        SearchField.sendKeys(PN);
        SearchField.sendKeys(Keys.ENTER);

    }
    public void Success_Search(String productName)
    {
        int counter=0;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        SoftAssert soft=new SoftAssert();
        String Expected="https://demo.nopcommerce.com/search?q="+productName;
        System.out.print(Expected);
        String Actual=driver.getCurrentUrl();
        soft.assertTrue(Actual.equals(Expected),"Error with search query");
        js.executeScript("window.scroll(0,500)");
        List<WebElement> items=driver.findElements(By.className("product-title"));


        for (int i=0; i<(items.size()); i++)
        {

            soft.assertTrue ((items.get(i).getText().toLowerCase()).contains(productName));

        }
        for (int i=0; i<(items.size()); i++)
        {

            if((items.get(i).getText().toLowerCase()).contains(productName))
            {
                counter++;
            }


        }
        System.out.println("Counter value is = \n "+ counter);
        soft.assertAll();


    }


    public void Click()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        js.executeScript("window.scroll(0,500)");
        driver.findElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();


    }
    public void CheckSerialNumberImplementation(String SerialNumber)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        js.executeScript("window.scroll(0,500)");

        String Expected="AP_MBP_13";
        String Actual=driver.findElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]")).getText();
        System.out.println(Actual);
        Assert.assertTrue("Error with Serial Number",Actual.contains(Expected));




    }






}
