package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Work17_2Steps {
    @Given("the patient is on the dental system website")
    public void the_patient_is_on_the_dental_system_website() {
        System.out.println("The patient is on the dental system website");
    }
    @Given("the patient is logged in as an adult with name {string} and password {string}")
    public void the_patient_is_logged_in_as_an_adult_with_name_and_password(String name, String password) {
        System.out.println("Adult name: "+name+", password: "+password);
    }
    @Given("the patient navigates to the registration page")
    public void the_patient_navigates_to_the_registration_page() {
        System.out.println("Navigates to the registration page");
    }
    @Given("the patient provides personal details with {string} and age {string}")
    public void the_patient_provides_personal_details_with_and_age(String address, String age) {
        System.out.println("Personal details(address): "+address+", age: "+age);
    }
    @Given("the patient selects a {string} appointment")
    public void the_patient_selects_a_appointment(String string) {
        System.out.println("Selects a "+ string+ " appointment");
    }
    @When("the patient confirms the appointment for {string}")
    public void the_patient_confirms_the_appointment_for(String string) {
        System.out.println("Appointment for "+string);
    }
    @When("the patient receives a confirmation with an approximate time of {string} and a cost estimate of ${int}")
    public void the_patient_receives_a_confirmation_with_an_approximate_time_of_and_a_cost_estimate_of_$(String string, Integer int1) {
        System.out.println("Confirmation with an approximate time of "+ string+", a cost of $"+int1);
    }
    @Then("the appointment is successfully scheduled")
    public void the_appointment_is_successfully_scheduled() {
        System.out.println("Successfully");
    }
    @Given("the patient is logged in as a child with name {string} and password {string}")
    public void the_patient_is_logged_in_as_a_child_with_name_and_password(String string, String string2) {
        System.out.println("Child name: "+ string + ", password: "+string2);
    }
    @Given("the patient attempts to book an appointment")
    public void the_patient_attempts_to_book_an_appointment() {
        System.out.println("Patient attempts to book an appointment");
    }
    @Then("the patient receives an error message about missing personal details")
    public void the_patient_receives_an_error_message_about_missing_personal_details() {
        System.out.println("Error! missing personal details");
    }
    @Given("the patient provides personal details with {string} and an invalid age {string}")
    public void the_patient_provides_personal_details_with_and_an_invalid_age(String string, String string2) {
        System.out.println("Personal details(address): "+string+", age: "+string2);

    }
    @Then("the patient receives an error message about the invalid age")
    public void the_patient_receives_an_error_message_about_the_invalid_age() {
        System.out.println("Error! Invalid age.");
    }
    @Given("the patient selects an invalid or unavailable procedure {string}")
    public void the_patient_selects_an_invalid_or_unavailable_procedure(String string) {
        System.out.println("select an invalid or unavailable procedure "+ string);
    }
    @Then("the patient receives an error message about the invalid procedure selection")
    public void the_patient_receives_an_error_message_about_the_invalid_procedure_selection() {
        System.out.println("Error! invalid procedure selection");
    }

}
