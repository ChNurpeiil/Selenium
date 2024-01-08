package steps.stepdefinitions;

import hwPages.Registration;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HW18_2_1Steps {
    WebDriver driver = new FirefoxDriver();
    private  Registration registration = new Registration(driver);

    @BeforeAll
    public static void setUp(){
        WebDriverManager.firefoxdriver().setup();

    }

    @Given("the user go to login page")
    public void the_user_go_to_login_page() {
        driver.get("https://dbank-qa.wedevx.co/bank/login");

    }
    @Given("the user navigate to sign in page and register a new user")
    public void the_user_navigate_to_sign_in_page_and_register_a_new_user() {
        registration.signIn();

//        WebElement signUp = driver.findElement(By.xpath("//a[contains(text(),'Sign Up Here')]"));
//        signUp.click();
//
//        WebElement pleaseSelect = driver.findElement(By.id("title"));
//        pleaseSelect.click();
//
//        Select select = new Select(pleaseSelect);
//        select.selectByIndex(2);
//
//        WebElement firstName = driver.findElement(By.id("firstName"));
//        firstName.sendKeys("Sakina");
//        WebElement lastName = driver.findElement(By.id("lastName"));
//        lastName.sendKeys("Saki");
//        WebElement gender = driver.findElement(By.xpath("//input[@value='F']"));
//        gender.click();
//        WebElement dob = driver.findElement(By.id("dob"));
//        dob.sendKeys("12/12/2000");
//        WebElement ssn = driver.findElement(By.id("ssn"));
//        ssn.sendKeys("569-45-9809");
//        WebElement emailAddress = driver.findElement(By.id("emailAddress"));
//        emailAddress.sendKeys("saki@gmail.com");
//        WebElement password = driver.findElement(By.id("password"));
//        password.sendKeys("124578N12ch");
//        WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
//        confirmPassword.sendKeys("124578N12ch");
//        WebElement nextBtn = driver.findElement(By.xpath("//button[@type='submit']"));
//        nextBtn.click();
//
//        driver.findElement(By.id("address")).sendKeys(" 123 bfhslurjg");
//        driver.findElement(By.id("locality")).sendKeys("Karakol");
//        driver.findElement(By.id("region")).sendKeys("SA");
//        driver.findElement(By.id("postalCode")).sendKeys("23539");
//        driver.findElement(By.id("country")).sendKeys("China");
//        driver.findElement(By.id("homePhone")).sendKeys("(700)552-5453");
//        driver.findElement(By.id("agree-terms")).click();
//        driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();

    }
    @Given("once done, login into the app")
    public void once_done_login_into_the_app() {
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("124578N12ch");
        driver.findElement(By.id("submit")).click();
    }
    @Then("navigate to the Update Profile page by hitting profile picture and selecting {string}")
    public void navigate_to_the_update_profile_page_by_hitting_profile_picture_and_selecting(String profile) {
        WebElement avatar = driver.findElement(By.xpath("//img[@class='user-avatar rounded-circle']"));
        avatar.click();
        WebElement myProfile = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
        myProfile.click();

    }
    @Then("try updating few fields with valid data and submit it")
    public void try_updating_few_fields_with_valid_data_and_submit_it() {
        WebElement titleSelect = driver.findElement(By.id("title"));
        titleSelect.click();
        Select select = new Select(titleSelect);
        select.selectByIndex(3);

        WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
        submit.click();
    }
    @When("validate the success message is displayed")
    public void validate_the_success_message_is_displayed() {
        WebElement message = driver.findElement(By.xpath("//div[@class='form-group text-left']"));

        System.out.println(message.getText());
//        Alert alert = driver.switchTo().alert();
//        alert.dismiss();

    }
    @When("validate that the data is saved")
    public void validate_that_the_data_is_saved() {
        
    }


}
