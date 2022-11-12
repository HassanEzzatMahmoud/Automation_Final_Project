package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_Hover;

public class D05_Hover {
    P04_Hover hover=new P04_Hover();

    @When("^User hovers on \"(.*)\" item, and clicks subitem \"(.*)\"$")

    public void Hover_Method(String productname,String Subcategory)
    {
        hover.Hover_Implmentation(productname,Subcategory);

    }

    @Then("^ActualResult equals Expected \"(.*)\"$")

    public void ScenarioTest(String Expected)
    {
        hover.ScenarioTestImplementation(Expected);

    }
}
