package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Order;

import java.util.List;

public class OrderSteps {
    @Given("there is an online order with order ID: {string}")
    public void there_is_an_online_order_with_order_id(String string) {
        System.out.println("Order: "+string);
    }
    @Given("the customer's has following details:")
    public void the_customer_s_has_following_details(List<Order> orders) {
        for (Order obj : orders){
            System.out.println(obj.getCustomerName());
            System.out.println(obj.getAddress());
            System.out.println(obj.getProductName());
            System.out.println(obj.getQuantity());
//            System.out.println(obj.g);
            System.out.println(obj.getSubtotal());
            System.out.println(obj.getTaxRate());
            System.out.println(obj.getTotalAmount());
            System.out.println(obj.getUnitPrice());
        }
    }
    @When("the user processes the online order, generating an invoice for Order")
    public void the_user_processes_the_online_order_generating_an_invoice_for_order() {
        System.out.println("online generate");
    }
    @Then("should be processed successfully")
    public void should_be_processed_successfully() {
        System.out.println("success");
    }

}
