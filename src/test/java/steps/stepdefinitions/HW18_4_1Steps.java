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
        
    }
    @Then("fill the rest with valid data")
    public void fill_the_rest_with_valid_data() {
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
        WebElement accountName = driver.findElement(By.id("name"));
        accountName.sendKeys("Nura");

        WebElement depositAmount = driver.findElement(By.id("openingBalance"));
        depositAmount.sendKeys("400000");
    }
    @Then("click the {string} button")
    public void click_the_button(String Submit) {
        WebElement submit = driver.findElement(By.id("newCheckingSubmit"));
        submit.click();
    }
    @When("validate that the error message is displayed")
    public void validate_that_the_error_message_is_displayed() {
        
    }
    @When("validate that the new account was NOT created")
    public void validate_that_the_new_account_was_not_created() {
        
    }
}
