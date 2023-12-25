package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork15_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Thread.sleep(5000);
        driver.get(" https://automationbookstore.dev/");


        WebElement searchBtn = driver.findElement(By.id("searchBar"));
        searchBtn.click();

        Thread.sleep(1000);
        searchBtn.sendKeys("Test Automation");

        Thread.sleep(1000);
        searchBtn.clear();

        Thread.sleep(1000);
        searchBtn.sendKeys("Cucumber");
        Thread.sleep(1000);
        searchBtn.clear();

        Thread.sleep(1000);
        searchBtn.sendKeys("Java");
        Thread.sleep(1000);
        searchBtn.clear();

        Thread.sleep(1000);
        searchBtn.sendKeys("Test");
        Thread.sleep(1000);
        searchBtn.clear();


    }
}
