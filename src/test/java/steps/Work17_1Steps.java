package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Work17_1Steps {
    @Given("the customer is on the shopping website")
    public void the_customer_is_on_the_shopping_website() {
        System.out.println("Customer is on the shopping website");
    }
    @Given("the customer is logged in")
    public void the_customer_is_logged_in() {
        System.out.println("Customer is logged in");
    }
    @Given("the customer puts the item {string} into the cart with quantity {int}")
    public void the_customer_puts_the_item_into_the_cart_with_quantity(String string, Integer int1) {
        System.out.println("Customer puts item: "+string + " with quantity "+int1);
    }
    @When("the customer proceeds to checkout with shipping to {string}")
    public void the_customer_proceeds_to_checkout_with_shipping_to(String string) {
        System.out.println("Checkout with shipping to "+ string);
    }
    @When("the customer enters shipping information")
    public void the_customer_enters_shipping_information() {
        System.out.println("shipping information");
    }
    @When("the customer makes a payment with a total price of ${double}")
    public void the_customer_makes_a_payment_with_a_total_price_of_$(Double double1) {
        System.out.println("Payment total price of $"+double1);
    }
    @Then("the customer receives an order confirmation for shipping")
    public void the_customer_receives_an_order_confirmation_for_shipping() {
        System.out.println("Receives an order confirmation for shipping");
    }
    @When("the customer proceeds to checkout with pickup at {string}")
    public void the_customer_proceeds_to_checkout_with_pickup_at(String string) {
        System.out.println("Proceeds to checkout with pickup at "+string);

    }
    @Then("the customer receives an order confirmation for pickup")
    public void the_customer_receives_an_order_confirmation_for_pickup() {
        System.out.println("Receives an order confirmation for pickup");
    }
    @When("the customer proceeds to checkout with no payment card")
    public void the_customer_proceeds_to_checkout_with_no_payment_card() {
        System.out.println("Payment card");
    }
    @Then("the customer receives an error message about the missing payment card")
    public void the_customer_receives_an_error_message_about_the_missing_payment_card() {
        System.out.println("Error message about the missing payment card");
    }
    @Then("the customer receives an error message about an out-of-stock item")
    public void the_customer_receives_an_error_message_about_an_out_of_stock_item() {
        System.out.println("error message about an out-of-stock item");
    }
    @Then("the customer receives an error message about the item being unavailable in this town")
    public void the_customer_receives_an_error_message_about_the_item_being_unavailable_in_this_town() {
        System.out.println("Error message about the item being unavailable in this town");
    }
}
