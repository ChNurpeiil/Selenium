package justForPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://dbank-qa.wedevx.co/bank/");

        Thread.sleep(2000);
        WebElement signUp = driver.findElement(By.xpath("//a[contains(text(),'Sign Up Here')]"));
        signUp.click();

        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();

        WebElement name = driver.findElement(By.id("firstName"));
        name.sendKeys("Elon");

        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.navigate().to("https://dbank-qa.wedevx.co/bank/");
    }
}
