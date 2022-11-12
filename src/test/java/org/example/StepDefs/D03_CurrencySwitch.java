package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Pages.P2_CurrencySwitch;


public class D03_CurrencySwitch {

    P2_CurrencySwitch Switch=new P2_CurrencySwitch();
    @And("User Switch currency")

    public void switchCurrency() {

        Switch.CurrenyList();
    }


    @Then("Currency switched Successfully")
    public void Currencychanged()

    {
        Switch.EuroCurency();
    }





}
