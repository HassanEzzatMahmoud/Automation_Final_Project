package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class P04_Hover {
    WebDriver driver= Hooks.driver;


    public void Hover_Implmentation(String productname,String subctegory)
    {
        Actions action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement TopMenulist= driver.findElement(By.linkText(productname));
        action.moveToElement(TopMenulist).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.linkText(subctegory)).click();
    }

    public void ScenarioTestImplementation(String Expected)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String Actual=driver.findElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[1]")).getText().toLowerCase().trim();
        System.out.println(Actual+ "This is error message Hassan");
        Assert.assertTrue("Error with page title",Actual.equals(Expected));

    }
}
