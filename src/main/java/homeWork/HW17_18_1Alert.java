package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class HW17_18_1Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(" https://practice-automation.com/popups/");

        Thread.sleep(2000);
        driver.findElement(By.id("alert")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement confirm = driver.findElement(By.id("confirm"));
        confirm.click();
        Thread.sleep(2000);

        alert= driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(2000);

        confirm.click();
        alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);

        driver.findElement(By.id("prompt")).click();
        alert= driver.switchTo().alert();
        alert.sendKeys("Nurpeiil");
        alert.accept();

    }
}
