package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork15_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Thread.sleep(5000);
        driver.get("https://letcode.in/edit");

        Thread.sleep(1000);
        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.sendKeys("Nur Chynybek");

        Thread.sleep(1000);

        WebElement append = driver.findElement(By.id("join"));
        Thread.sleep(1000);
        append.clear();
        Thread.sleep(1000);
        append.sendKeys("Hello");

    }
}
