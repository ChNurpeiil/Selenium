package justForPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo-project.wedevx.co");

        Thread.sleep(5000);

        WebElement currentAddress = driver.findElement(By.name("currentAddress"));
        currentAddress.sendKeys("123 Main st");

        WebElement permanentAddressTxtBtn = driver.findElement(By.name("permanentAddress"));
        permanentAddressTxtBtn.sendKeys("Spacex");
    }
}
