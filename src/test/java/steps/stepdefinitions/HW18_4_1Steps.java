package steps.stepdefinitions;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HW18_4_1Steps {
    @BeforeAll
    public static void setUp(){
        WebDriverManager.firefoxdriver().setup();
    }
    WebDriver driver = new FirefoxDriver();

    WebDriverWait wait = new WebDriverWait(driver,10);

    @Given("the user going to login page")
    public void the_user_going_to_login_page() {
       driver.get("https://dbank-qa.wedevx.co/bank/login");
    }
    @Given("new login into the app")
    public void new_login_into_the_app() {
        WebElement usernameTxt = driver.findElement(By.id("username"));
        WebElement passwordTxt = driver.findElement(By.id("password"));
        WebElement submitBtn = driver.findElement(By.id("submit"));

        usernameTxt.sendKeys("saki@gmail.com");
        passwordTxt.sendKeys("124578N12ch");
        submitBtn.click();
    }




        @Given("navigate to the Checking page")
    public void navigate_to_the_checking_page() {

        WebElement checkingMenu = driver.findElement(By.id("checking-menu"));
        checkingMenu.click();
    }
    @Given("clicks new checking button")
    public void clicks_new_checking_button() {
        WebElement newChecking = driver.findElement(By.id("new-checking-menu-item"));
        newChecking.click();


        String expectedUrl = "https://dbank-qa.wedevx.co/bank/account/checking-add";
        assertEquals(expectedUrl, driver.getCurrentUrl(), "new checking Button didn't take to the url" + expectedUrl);
    }
    @Then("leave account type field not selected")
    public void leave_account_type_field_not_selected() {
        WebElement accountOwnership = driver.findElement(By.id("Joint"));
        accountOwnership.click();

        WebElement accountName = driver.findElement(By.id("name"));
        accountName.sendKeys("Nurasi");

        WebElement depositAmount = driver.findElement(By.id("openingBalance"));
        depositAmount.sendKeys("400000");
    }


    @Then("leave ownership field not selected")
    public void leave_ownership_field_not_selected() {
        //Add code here
    }

    @Then("another fill the rest with valid data")
    public void another_fill_the_rest_with_valid_data() {
        WebElement accountType = driver.findElement(By.id("Standard Checking"));
        accountType.click();

        WebElement accountName = driver.findElement(By.id("name"));
        accountName.sendKeys("Nura");

        WebElement depositAmount = driver.findElement(By.id("openingBalance"));
        depositAmount.sendKeys("400000");
    }
    @Then("leave Name field empty")
    public void leave_name_field_empty() {
        WebElement accountType = driver.findElement(By.id("Standard Checking"));
        accountType.click();

        WebElement accountOwnership = driver.findElement(By.id("Joint"));
        accountOwnership.click();

        WebElement accountName = driver.findElement(By.id("name"));
        accountName.sendKeys("");

        WebElement depositAmount = driver.findElement(By.id("openingBalance"));
        depositAmount.sendKeys("400000");

    }
    @Then("max length of the name should be no longer than {int} characters")
    public void max_length_of_the_name_should_be_no_longer_than_characters(Integer lengthName) {
        WebElement accountType = driver.findElement(By.id("Standard Checking"));
        accountType.click();

        WebElement accountOwnership = driver.findElement(By.id("Joint"));
        accountOwnership.click();


        WebElement accountName = driver.findElement(By.id("name"));

        String inputText = "asdfghjkloiuytrewqasdfghjkloiuytredvbnmkuytrdcvbnjkiuytrdxcvbnjuytrertyuioiuytrewsdfghjklkjhgcxzxcvbnmnbvcdfghjuytrertyuhgfdfghjhgfcvbnbvcvbhjhgfdsqwertyuiopplkjhgfdsazxcvbnmkloooiuytrewqasdfghjkmnbvcxzsdfghjhgfdsxcvbnbvgfdsazxcvbnmkloooiuytrewqasdfghjkmnbvcxzsdfghjhgfdsxcvbnbvgfdsazxcvbnmkloooiuytrewqasdfghjkmnbvcxzsdfghjhgfdsxcvbnbvgfdsazxcvbnmkloooiuytrewqasdfghjkmnbvcxzsdfghjhgfdsxcvbnbv";
        accountName.sendKeys(inputText);



         lengthName = inputText.length();
        if (lengthName> 256){
            accountName.clear();
        } else{
            accountName.sendKeys(inputText);
        }


        WebElement depositAmount = driver.findElement(By.id("openingBalance"));
        depositAmount.sendKeys("400000");

    }

    @Then("test deposit amount field")
    public void test_deposit_amount_field() {
    }
    @Then("The minimum deposit amount is {int}$ on the opening stage, provide less")
    public void the_minimum_deposit_amount_is_$_on_the_opening_stage_provide_less(Integer int1) {
        WebElement accountType = driver.findElement(By.id("Standard Checking"));
        accountType.click();

        WebElement accountOwnership = driver.findElement(By.id("Joint"));
        accountOwnership.click();

        WebElement accountName = driver.findElement(By.id("name"));
        accountName.sendKeys("Nin");

        WebElement depositAmount = driver.findElement(By.id("openingBalance"));
        depositAmount.sendKeys("19");


    }



    @Then("the max deposit amount is a trillion $ on the opening stage, provide more")
    public void the_max_deposit_amount_is_a_trillion_$_on_the_opening_stage_provide_more() {
        WebElement accountType = driver.findElement(By.id("Standard Checking"));
        accountType.click();

        WebElement accountOwnership = driver.findElement(By.id("Joint"));
        accountOwnership.click();

        WebElement accountName = driver.findElement(By.id("name"));
        accountName.sendKeys("Nin");

        WebElement depositAmount = driver.findElement(By.id("openingBalance"));
        depositAmount.sendKeys("19999999999999999999999999999999999999999999999999999999999999999990909009876543200900");
    }


    @Then("the input accepts numbers only, provide some non-numeric values")
    public void the_input_accepts_numbers_only_provide_some_non_numeric_values() {
        WebElement accountType = driver.findElement(By.id("Standard Checking"));
        accountType.click();

        WebElement accountOwnership = driver.findElement(By.id("Joint"));
        accountOwnership.click();

        WebElement accountName = driver.findElement(By.id("name"));
        accountName.sendKeys("Nin");

        WebElement depositAmount = driver.findElement(By.id("openingBalance"));
        depositAmount.sendKeys("19f00900");
    }

    @Then("click the {string} button")
    public void click_the_button(String Submit) {
        WebElement submit = driver.findElement(By.id("newCheckingSubmit"));
        submit.click();
    }
    @Then("click the a {string} button")
    public void click_the_a_button(String string) {
        WebElement submit = driver.findElement(By.id("newCheckingReset"));
        submit.click();
    }
    @When("validate that the error message is displayed")
    public void validate_that_the_error_message_is_displayed() {

//        WebElement errorMessage = driver.findElement(By.id("new-account-error-alert"));
//        System.out.println(errorMessage.getText());

    }
    @When("validate that the new account was NOT created")
    public void validate_that_the_new_account_was_not_created() {
        
    }
}
