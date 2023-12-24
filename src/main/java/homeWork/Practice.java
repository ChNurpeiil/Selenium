package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-project.wedevx.co/");

        Thread.sleep(10000);
        WebElement radioBtn = driver.findElement(By.id("radioButton_page"));
        radioBtn.click();

        WebElement yesBtn = driver.findElement(By.name("row-radio-buttons-group"));
        yesBtn.click();
    }
}
