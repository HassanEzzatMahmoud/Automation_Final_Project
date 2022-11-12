package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import org.example.StepDefs.Hooks;

import java.time.Duration;

public class P1_Login {

    JavascriptExecutor js;
    WebDriver driver=Hooks.driver;
    public WebElement POM_UserName_Method()

    {

        js=(JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,400)");
        WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));
        return Email;

    }
    //To catch Password element
    public WebElement POM_Password_Method()
    {
        WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
        return Password;

    }
    public void LoginSteps( String Username, String Password)
    {
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        POM_UserName_Method().clear();

        POM_UserName_Method().sendKeys(Username);
        POM_Password_Method().clear();
        POM_Password_Method().sendKeys(Password);


    }

    public void positive_Login()
    {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        SoftAssert soft =new SoftAssert();
        //URL Check
        String Expected="https://demo.nopcommerce.com/";
        String Actual=driver.getCurrentUrl();
        soft.assertTrue(Actual.contains(Expected),"Error with URL");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Here's the condition for checking tab is existed
        //Here to find My account Tab
        WebElement Tab=driver.findElement(By.xpath("//body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]"));

        soft.assertTrue(Tab.isDisplayed(),"Error with is displayed");
        soft.assertTrue(Tab.getText().contains("My account"),"\n The Actual displayed text is Register");

        soft.assertAll();

    }

    public void Negative_login()
    {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        SoftAssert soft=new SoftAssert();
        String Expected="Login was unsuccessful. Please correct the errors and try again.";
        String ExpectedColr="e4434b"; //Red color
        String Actual=driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")).getText();
        String ActualColr=driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")).getCssValue("color");
        soft.assertTrue(Actual.contains(Expected),"Error with Message");
        System.out.print(Actual +" Ya Hassan \n");
        soft.assertFalse(ActualColr.contains(ExpectedColr),"Error with color");
        System.out.print(ActualColr +"Ya Hassan \n");
        soft.assertAll();
    }


}
