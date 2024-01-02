package justForPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo-project.wedevx.co");


        WebElement dynamicPropertiesBtn = driver.findElement(By.id("dynamicProperties_page"));
        dynamicPropertiesBtn.click();

        //WebDriverWait is actually explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement  enableAfterBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        enableAfterBtn.click();


    }
}
