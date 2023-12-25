package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Thread.sleep(5000);
        driver.get("https://magento.softwaretestingboard.com/");

        Thread.sleep(1000);
        WebElement signIn = driver.findElement(By.partialLinkText("Sign In"));
        signIn.click();

        Thread.sleep(1000);
        WebElement createAnAccount = driver.findElement(By.partialLinkText("Create"));
        createAnAccount.click();
    }
}
