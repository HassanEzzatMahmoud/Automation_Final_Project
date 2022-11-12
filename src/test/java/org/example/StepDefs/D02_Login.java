package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P1_Login;
import org.openqa.selenium.By;


import java.time.Duration;

public class D02_Login {
    P1_Login login=new P1_Login();
    @And("User navigates to login page")
    //User navigates to Login page function

    public void LoginPage(){
        //User launch URL-Login-screen

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");


    }

    @When("^User enters \"(.*)\" & \"(.*)\"$")
    //Login steps method

    public  void EnterCredentials(String Username, String Password)


    {
        login.LoginSteps(Username,Password);
    }


    @And("User Clicks login button")

    //Here user click login button
    public void ButtonPress() {

        Hooks.driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
       Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Then("User could login successfully  & go to Homepage")
    //Expected result  checks on the URL

    public void Succ_login(){


        login.positive_Login();
    }

    @Then ("Error Message is displayed")
    public void invalidlogin()
    {
        login.Negative_login();

    }

}
