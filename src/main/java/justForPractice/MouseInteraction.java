package justForPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseInteraction {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://demo-project.wedevx.co");

        WebElement buttons = driver.findElement(By.id("buttons_page"));
        buttons.click();

        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        //How do you perform advaced mouse interaction? like double or right click?
        //I use Action class Selenium - that has methods like doubleclick, right click etc

        Actions actions = new Actions(driver);

        actions.doubleClick(doubleClickBtn).perform();

        WebElement rightButton = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightButton).perform();

        WebElement clickBtn = driver.findElement(By.id("TiIX0"));
        actions.click(clickBtn).perform();


    }
}
