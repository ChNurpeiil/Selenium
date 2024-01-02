package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW17_6_1ExplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        driver.get(" https://practice-automation.com/spinners/");

        WebDriverWait wait = new WebDriverWait(driver,5);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='entry-content']//p")));

        WebElement visible = driver.findElement(By.xpath("//div[@class='entry-content']//p"));
        String message = visible.getText();
        System.out.println(message);

        driver.quit();
    }
}
