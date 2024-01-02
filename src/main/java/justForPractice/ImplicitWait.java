package justForPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo-project.wedevx.co");


        WebElement currentAddress = driver.findElement(By.name("currentAddress"));
        currentAddress.sendKeys("123 Main st");

        WebElement permanentAddressTxtBtn = driver.findElement(By.name("permanentAddress"));
        permanentAddressTxtBtn.sendKeys("Spacex");

    }
}
