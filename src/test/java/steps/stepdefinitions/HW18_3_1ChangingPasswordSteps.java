package steps.stepdefinitions;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW18_3_1ChangingPasswordSteps {

    @BeforeAll
    public static void setUp(){
        WebDriverManager.firefoxdriver().setup();
    }
    WebDriver driver = new FirefoxDriver();

    @Then("fill current password")
    public void fill_current_password() {
        String newWindow = driver.getWindowHandle();
        WebElement card = driver.findElement(By.xpath("//div[@class='card-body']"));
        newWindow = driver.getWindowHandle();


//        WebElement currentPassword = new WebDriverWait(driver, 10)
//                .until(ExpectedConditions.elementToBeClickable(By.id("currentPassword")));
//        currentPassword.sendKeys("124578N12ch");
        WebElement currentPassword = driver.findElement(By.id("currentPassword"));
        currentPassword.sendKeys("124578N12ch");

    }
    @Then("fill valid new password in both fields  \\(valid password must contain at least {int} characters, one uppercase, one lowercase, digits, and special character)")
    public void fill_valid_new_password_in_both_fields_valid_password_must_contain_at_least_characters_one_uppercase_one_lowercase_digits_and_special_character(Integer int1) {
        WebElement newPassword = driver.findElement(By.id("newPassword"));
        newPassword.sendKeys("124578N@");

        WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
        confirmPassword.sendKeys("124578N@");

    }
    @Then("hit the {string} button")
    public void hit_the_button(String update) {
        WebElement updateBtn = driver.findElement(By.id("payment-button"));
        updateBtn.click();
        
    }
    @When("validate that the success message is displayed")
    public void validate_that_the_success_message_is_displayed() {
        
    }
    @When("validate that the new password is applied by signing ot and signing in again with new credentials")
    public void validate_that_the_new_password_is_applied_by_signing_ot_and_signing_in_again_with_new_credentials() {
        
    }
}
