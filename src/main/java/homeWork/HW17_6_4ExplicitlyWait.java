package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW17_6_4ExplicitlyWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        driver.get(" https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        WebElement enableBtn = driver.findElement(By.id("enable-button"));
        enableBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("disable")));

        driver.quit();


    }
}
