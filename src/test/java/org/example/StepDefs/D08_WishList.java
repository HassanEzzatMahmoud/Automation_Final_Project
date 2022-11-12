package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P07_WishList;

public class D08_WishList {
    P07_WishList wishList=new P07_WishList();

    @Given("User direct to Item")

    public void MoveToItem()
    {
        wishList.MoveToItemImpl();
    }

    @When("User Clicks favorit icon")

    public void ClickFavorit()
    {
       wishList.ClickFavoritImpl();
    }

    @Then("Success Message is displayed")

    public void Succ()
    {
        wishList.SuccImpl();
    }

    @And("user clicks wishlist tab")

    public void ClickWishListTab() throws InterruptedException {
        wishList.ClickWishListTabImpl();
    }

    @Then("QTY value is bigger than 0")
    public void CheckQtyValue()
    {
        wishList.CheckQtyValueImpl();
    }

}
