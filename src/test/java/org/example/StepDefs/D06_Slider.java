package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P05_Slider;

public class D06_Slider {
    P05_Slider slider=new P05_Slider();

    @Given("User direct to homepage")
    //Direct to home page
    public void Homepage()
    {slider.HomePageImplementation();}

    @When("Clicks first slider")
    //User clicks on Nokia Slider
    public void FirstSliderClick()
    {
        slider.FirSliderImplementation();
    }

    //First scenario_bug
    @Then("User should redirected to relative slider result")

    public void FirstScenario()
    {
        slider.FirstScenarionImplementation();
    }
    @When("Clicks second slider")

    public void ClickSecondSlider() throws InterruptedException {
        slider.ClicksecondScenarioImplmentation();

    }

    @Then("User should redirected to relative to second result")

    public void SecondScenario()
    {
    slider.SecondScenarioImpl();


    }
}
