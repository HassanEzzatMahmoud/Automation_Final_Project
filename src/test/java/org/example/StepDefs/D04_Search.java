package org.example.StepDefs;
import io.cucumber.java.en.Then;
import org.example.Pages.P3_Search;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class D04_Search {

    P3_Search search=new P3_Search();

    @And("^User Search with \"(.*)\"$")
    public void PNSearch(String productName)
    {
         search.PN(productName);

    }
    @Then("^Search result would match with \"(.*)\"$")
    public void CheckSearch(String productName)
    {
        search.Success_Search(productName);
    }

    /******************SKU***********************/

    @And("User Clicks on element")
    public void ProductClick()
    {
        search.Click();

    }

    @Then("^Search result matchs with \"(.*)\"$")
    public void CheckSerialNumber(String SerialNumber)
    {

        search.CheckSerialNumberImplementation(SerialNumber);

    }

}
