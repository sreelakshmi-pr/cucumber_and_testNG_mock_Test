package com.automation.Steps;

import com.automation.Pages.AddToCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddToCartSteps {

    AddToCartPage addToCartPage = new AddToCartPage();
    @When("user search a product")
    public void user_search_a_product() {
        addToCartPage.SearchElement();
    }

    @Then("verify user on searched product")
    public void verifyUserOnSearchedProduct() {
        Assert.assertFalse(addToCartPage.isElementPageDisplayed());

    }

    @When("user add the product to the cart")
    public void userAddTheProductToTheCart() {
        addToCartPage.addToCart();

    }

    @Then("user verify the product is added to the cart")
    public void userVerifyTheProductIsAddedToTheCart() {
        Assert.assertTrue(addToCartPage.isAddedToCart());
    }
}
