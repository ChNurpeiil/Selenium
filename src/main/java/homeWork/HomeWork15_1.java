package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork15_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Thread.sleep(5000);
        driver.get("https://demo-project.wedevx.co/");

        Thread.sleep(1000);
        WebElement forms = driver.findElement(By.id("panel2bh-header"));
        forms.click();


        Thread.sleep(1000);
        WebElement practiceForm = driver.findElement(By.id("practiceForm_page"));
        practiceForm.click();

        Thread.sleep(1000);
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Nurpeiil");

        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Chynybek");

        Thread.sleep(1000);
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("@nur123");

        Thread.sleep(1000);
        WebElement phoneNumber = driver.findElement(By.id("userMobile"));
        phoneNumber.sendKeys("077076676642");

        Thread.sleep(1000);
        WebElement subjects = driver.findElement(By.id("subjectsContainer"));
        subjects.sendKeys("SDET");

        Thread.sleep(1000);
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Asanbay");
    }
}
