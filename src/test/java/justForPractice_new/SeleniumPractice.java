package justForPractice_new;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumPractice {
    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo-project.wedevx.co/");

        Thread.sleep(2000);

        WebElement webTablesOption = driver.findElement(By.id("webTables_page"));
        webTablesOption.click();

        Thread.sleep(2000);

        WebElement firstColumnHeader= driver.findElement(By.xpath("//table/thead/tr/th[2]"));
        assertEquals("Dessert (100g serving)", firstColumnHeader.getText());

        Thread.sleep(2000);

        WebElement secondColumnHeader= driver.findElement(By.xpath("//table/thead/tr/th[3]"));
        assertEquals("Calories\nsorted ascending", secondColumnHeader.getText());

        Thread.sleep(2000);
        WebElement firstRowDessertName = driver.findElement(By.xpath("//table/tbody/tr[1]/th"));
        assertEquals("Frozen yoghurt", firstRowDessertName.getText());



        Thread.sleep(2000);
        WebElement firstRowDessertCalories = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]"));
        assertEquals("159", firstRowDessertCalories.getText());
    }
}
