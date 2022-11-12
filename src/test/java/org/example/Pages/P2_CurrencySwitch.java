package org.example.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.example.StepDefs.Hooks;

import java.time.Duration;
import java.util.List;

public class P2_CurrencySwitch {
    JavascriptExecutor js;
    WebDriver driver=Hooks.driver;

    public void CurrenyList()
    {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement Currlist= driver.findElement(By.xpath("//select[@id='customerCurrency']"));
        /* Currlist.click();*/
        /* Thread.sleep(2000);*/
        Select DDL=new Select(Currlist);
        DDL.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");

    }

    public void EuroCurency()
    {
        int counter=0;

        js=(JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,1500)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        List<WebElement> Items_List=driver.findElements(By.className("prices"));
        System.out.println(Items_List.size() + "\n");
        System.out.println(Items_List.get(2).getText());

        for (int i=0; i<(Items_List.size()); i++)
        {
            if(Items_List.get(i).getText().contains("€"))
            {
                counter++;
            }
            else
            {
                break;
            }

        }

        Assert.assertTrue("Error with counter",counter==4);

    }

}
