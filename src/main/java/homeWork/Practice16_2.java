package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice16_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" https://demo-project.wedevx.co/");
        WebElement checkBox = driver.findElement(By.id("checkBox_page"));
        checkBox.click();
        Thread.sleep(2000);
        WebElement check1 = driver.findElement(By.id("child1"));
        check1.click();
        Thread.sleep(2000);
        WebElement check2 = driver.findElement(By.id("child2"));
        check2.click();
        Thread.sleep(2000);
        check1.click();
    }
}
