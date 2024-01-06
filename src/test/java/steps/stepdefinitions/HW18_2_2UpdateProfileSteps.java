package steps.stepdefinitions;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class HW18_2_2UpdateProfileSteps {
    @BeforeAll
    public static void setUp(){
        WebDriverManager.firefoxdriver().setup();

    }
    WebDriver driver = new FirefoxDriver();

    @Given("go to login page")
    public void go_to_login_page() {
        driver.get("https://dbank-qa.wedevx.co/bank/login");
    }

    @Given("login into the app")
    public void login_into_the_app() throws InterruptedException {

        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
                //driver.findElement(By.id("username"));
        userName.sendKeys("saki@gmail.com");
        WebElement password = driver.findElement(By.id("password"));
        Thread.sleep(2000);
        password.sendKeys("124578N12ch");
        driver.findElement(By.id("submit")).click();
    }

    @Then("navigate user to the Update Profile page by hitting profile picture and selecting {string}")
    public void navigate_user_to_the_update_profile_page_by_hitting_profile_picture_and_selecting(String profile) {
        WebElement avatar = driver.findElement(By.xpath("//img[@class='user-avatar rounded-circle']"));
        avatar.click();
        WebElement myProfile = driver.findElement(By.xpath("//a[contains(text(), '" + profile + "')]"));
        myProfile.click();

    }
    @Then("full wrong format like phone or region or postal code")
    public void full_wrong_format_like_phone_or_region_or_postal_code() {
        WebElement mobilePhone = driver.findElement(By.id("mobilePhone"));
        mobilePhone.sendKeys("(56)3456-76542");

    }
    @Then("empty required fields")
    public void empty_required_fields() {
        WebElement emptyLastName = driver.findElement(By.id("lastName"));
        emptyLastName.clear();

    }
    @Then("reset the title")
    public void reset_the_title() {
        WebElement title = driver.findElement(By.id("title"));
        title.click();
        Select select = new Select(title);
        select.selectByIndex(0);
        
    }
    @Then("postal code can be only numeric, check it")
    public void postal_code_can_be_only_numeric_check_it() {
        WebElement postalCode = driver.findElement(By.id("postalCode"));
        postalCode.clear();
        postalCode.sendKeys("ghajlk;j");

//        String actualValue = postalCode.getAttribute("value");
//        boolean containsNonNumeric = actualValue.matches(".*\\D+.*");
//
//
//        assertFalse(containsNonNumeric, "postal code can be only numeric");
//        assertEquals("",actualValue ,"postal code can be only numeric");
    }
    @Then("region can only alphabetic, check it")
    public void region_can_only_alphabetic_check_it() {
        WebElement region = driver.findElement(By.id("region"));
        region.clear();
        region.sendKeys("12134");
        
    }
    @Then("country can only alphabetic, check it")
    public void country_can_only_alphabetic_check_it() {
        WebElement country = driver.findElement(By.id("country"));
        country.clear();
        country.sendKeys("123@--");
    }
    @When("validate the error message is displayed after each wrong profile update operation")
    public void validate_the_error_message_is_displayed_after_each_wrong_profile_update_operation() {
        WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
        submit.click();

        WebElement message = driver.findElement(By.xpath("//div[@class='form-group text-left']"));

        System.out.println(message.getText());
    }
    @When("validate that the data is not saved")
    public void validate_that_the_data_is_not_saved() {
        
    }

}
