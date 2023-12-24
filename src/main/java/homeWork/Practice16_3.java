package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice16_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" https://demo-project.wedevx.co/");
        WebElement webTables = driver.findElement(By.id("webTables_page"));
        webTables.click();

        Thread.sleep(20000);
        WebElement cupcake = driver.findElement(By.id("enhanced-table-checkbox-3"));
        cupcake.click();

        Thread.sleep(20000);
        WebElement eclair = driver.findElement(By.id("enhanced-table-checkbox-2"));
        eclair.click();

        Thread.sleep(20000);
        WebElement marshmallow= driver.findElement(By.id("enhanced-table-checkbox-4"));
        marshmallow.click();

        Thread.sleep(2000);
        WebElement nextPage = driver.findElement(By.id("Go to next page"));

        Thread.sleep(2000);
        WebElement lollipop= driver.findElement(By.id("enhanced-table-checkbox-3"));
        lollipop.click();

        Thread.sleep(20000);
        WebElement nougat= driver.findElement(By.id("enhanced-table-checkbox-1"));
        nougat.click();
    }
}
