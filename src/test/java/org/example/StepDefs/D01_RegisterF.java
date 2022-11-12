package org.example.StepDefs;

import org.example.Pages.P0_Register;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import java.time.Duration;

public class D01_RegisterF {

    P0_Register Registeration=new P0_Register();
   @Given("User direct to registration page")

    public void RegistrationPage()
    {

        Hooks.driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        //Wait till all elements are ready
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    @When("user Enters valid criteria \"(.*)\",\"(.*)\",\"(.*)\", \"(.*)\",\"(.*)\"$")

    public void Registration(String FirstName,String LastName,String Email, String Password, String Repassword) throws InterruptedException {

        Registeration.RegistrationSteps(FirstName,LastName,Email,Password,Repassword);
    }

    @And("User Clicks Register")

    public  void SubmitButton() {
        Hooks.driver.findElement(By.xpath("//button[@id='register-button']")).click();


    }

    @Then("User register successfully")
    public void Success()
    {
        //Here's the implicit wait the page to load its elements
        Registeration.RegistrationSuccess_Implmentation();

    }


}
