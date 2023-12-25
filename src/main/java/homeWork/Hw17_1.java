package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw17_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Thread.sleep(5000);
        driver.get("https://practice-automation.com/modals/");
        WebElement simpleModel = driver.findElement(By.className("pum-trigger"));
        simpleModel.click();


        Thread.sleep(1000);
        WebElement title = driver.findElement(By.className("pum-title"));

        Thread.sleep(1000);
        WebElement text = driver.findElement(By.className("pum-content"));

        Thread.sleep(1000);


    }
}
