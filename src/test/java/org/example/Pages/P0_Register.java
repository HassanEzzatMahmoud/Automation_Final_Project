package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


import java.time.Duration;

public class P0_Register {
    JavascriptExecutor js;
    WebDriver driver=Hooks.driver;

    /*******************************The Following Methods For Registration******************************************/

    //Lunching browser
    /*public void Init_(WebDriver driver)
    {

        driver.manage().window().maximize();
        //Implicit wait till page elements are loaded
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        js=(JavascriptExecutor) driver;
    }*/
    public WebElement RadioButton()
    {

        //Registration_Definition of Radio Button

        WebElement RadioButton = driver.findElement(By.xpath("//input[@id='gender-female']"));
        return RadioButton;

    }
    public WebElement FirstName()
    {
        //Registration_Definition of FirstName
        js=(JavascriptExecutor) driver;
        //js.executeScript("window.scroll(0,1400)");

        WebElement Firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));

        return Firstname;
    }

    public WebElement LastName()
    {
        //Registration_Definition Of Lastname

        WebElement LastName=driver.findElement(By.xpath("//input[@id='LastName']"));

        return LastName;
    }


    public WebElement Email()
    {
        //Registration_Definition of Email

        WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));

        return Email;
    }


    //It's easy to make its elements dynamic, but as implementation for it's value
    public void DateOFBirth()
    {

        Select dayvalue=new Select(driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")));
        dayvalue.selectByValue("23");
        Select MonthValue=new Select(driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")));
        MonthValue.selectByValue("7");
        Select YearValue=new Select(driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")));
        YearValue.selectByValue("1995");
    }

    public void RegistrationSuccess_Implmentation()
    {


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        SoftAssert soft=new SoftAssert();
        //String Expected="Your registration completed";
        String Expected="Your registration completed";
        String Actual=driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getText();
        System.out.println(Actual+"Hassan This is Actual");
        soft.assertTrue(Actual.equals(Expected),"Error with Title");
       /* String TextColor=driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getCssValue("color");
        soft.assertEquals(TextColor,"4cb17c");*/
        soft.assertAll();
    }




    //Registration steps
    public void RegistrationSteps(String FirstName,String LastName,String Email, String Password, String Repassword) throws InterruptedException {

        RadioButton().click();

        //Those two lines are to scroll down to find the element correctly
        /*js=(JavascriptExecutor) driver;*/
        /* js.executeScript("window.scroll(0,400)");*/

        FirstName().clear();
        FirstName().sendKeys(FirstName);
        LastName().clear();
        LastName().sendKeys(LastName);
        Email().clear();
        Email().sendKeys(Email);
        //Calling function date of birth, making its values as static values
        DateOFBirth();
        //Here just to see how fields are initiated
        Thread.sleep(2000);

        //This line to scroll down to password fields

        js.executeScript("window.scroll(0,1500)");
        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
        password.clear();
        password.sendKeys(Password);

        WebElement rePassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        rePassword.clear();
        rePassword.sendKeys(Repassword);







    }


}
