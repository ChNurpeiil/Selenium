package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW17_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Thread.sleep(5000);
        driver.get(" https://practice-automation.com/modals/");
        WebElement formModal = driver.findElement(By.className("popmake-674"));
        formModal.click();
        Thread.sleep(1000);
        WebElement name = driver.findElement(By.id("g1051-name"));
        name.sendKeys("Nur");

        Thread.sleep(1000);
        WebElement email = driver.findElement(By.name("g1051-email"));
        email.sendKeys("@nur123");

        Thread.sleep(1000);
        WebElement message = driver.findElement(By.id("contact-form-comment-g1051-message"));
        message.sendKeys("Never give up!!!");

        Thread.sleep(1000);
        WebElement submit = driver.findElement(By.className("pushbutton-wide"));
        submit.click();

    }
}
