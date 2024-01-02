package justForPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class KeyboardActions {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://demo-project.wedevx.co");

        WebElement forms = driver.findElement(By.id("panel2bh-header"));
        forms.click();

        WebElement practiceForm = driver.findElement(By.id("panel2bh-content"));
        practiceForm.click();

        WebElement firstName = driver.findElement(By.id("firstName"));

        Actions actions = new Actions(driver);

        actions.sendKeys(firstName,"Elon").keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).sendKeys("c")
                .sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").perform();
    }
}
