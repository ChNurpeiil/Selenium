package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW18_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://dbank-qa.wedevx.co/bank/login");

        WebElement userName = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement signIn = driver.findElement(By.id("submit"));

        System.out.println("Positive");

        userName.sendKeys("nurasi@gmail.com");
        password.sendKeys("124578N12ch");

        WebElement rememberMeCheckBox = driver.findElement(By.id("remember-me"));
        rememberMeCheckBox.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dashboard")));

            // Validation for successful login
            if (dashboard.isDisplayed()) {
                System.out.println("Login successful. Positive test case passed.");
            } else {
                System.out.println("Login failed. Positive test case failed.");
            }
        } catch (TimeoutException e) {
            System.out.println("Dashboard element not found. Positive test case failed.");

        }

        System.out.println("Negative");

        userName.sendKeys("Nur");
        password.sendKeys("123668@");
        rememberMeCheckBox.click();

        signIn.click();

        try {
            WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-message")));
            if (errorMessage.getText().contains("Invalid credentials")) {
                System.out.println("Login failed with incorrect credentials. Negative test case passed.");
            } else {
                System.out.println("Login did not fail as expected. Negative test case failed.");
            }
        } catch (TimeoutException e) {
            System.out.println("No error message found. Negative test case failed.");
        }

    }
}
