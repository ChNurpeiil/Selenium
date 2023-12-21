package steps.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Practice4 {
    
    String name;
    int mark;
    char grade;
    @Given("the student name is {string}")
    public void the_student_name_is(String name) {
        this.name= name;
    }
    @Given("the project mark for {string} is {int}")
    public void the_project_mark_for_is(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
    @When("the system calculates the letter grade for {string} project mark")
    public void the_system_calculates_the_letter_grade_for_project_mark(String name) {
        if(mark >=90 && mark<= 100){
            grade = 'A';
        } else if (mark >=70 && mark<= 89){
            grade = 'B';
        } else if (mark >=50 && mark<= 69){
            grade = 'C';
        } else if (mark >=30 && mark<= 49){
            grade = 'D';
        } else if (mark >=0 && mark<= 29){
            grade = 'F';
        }
    }
    @Then("the system should display {string} grade as {string}")
    public void the_system_should_display_grade_as(String name, String expectedGrade) {
       assert grade == expectedGrade.charAt(0):"Incorrect grade calculated";
        System.out.println(name + "'s grade is "+ grade);
    }

}
