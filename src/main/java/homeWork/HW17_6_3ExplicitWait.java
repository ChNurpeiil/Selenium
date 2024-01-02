package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW17_6_3ExplicitWait {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        WebElement displayBtnAfter10Sec = driver.findElement(By.id("display-other-button"));
        displayBtnAfter10Sec.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement hidden = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));

    }
}
