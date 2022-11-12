package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P06_FollowUs;

public class D07_FollowUs {
    P06_FollowUs FollowUs=new P06_FollowUs();

    @Given("User Directs to contact us Footer")

    public void Footer()
    {
    FollowUs.FooterImplementation();
    }

    @When("^User clicks follow us Item \"(.*)\"$")

    public void ClickFacebook(String Xpath)
    {
    FollowUs.ClickFacebookImplementation(Xpath);
    }

    @Then("^User Direct to relevant URL \"(.*)\"$")

    public void FaceBookTab(String URL)
    {
    FollowUs.FaceBookTabImplementation(URL);

    }
}
