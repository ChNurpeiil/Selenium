package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW17_12_2MovingSlider {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://practice-automation.com/gestures/");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("moveMe")));

        Actions actions = new Actions(driver);

        actions.clickAndHold(box).dragAndDropBy(box,500,50).perform();

    }
}
