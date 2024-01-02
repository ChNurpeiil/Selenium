package justForPractice_new;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HWSeleniumPractice2 {
    @Test
    public void hwTest2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

        Thread.sleep(2000);

        WebElement  firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("Nur");

        Thread.sleep(2000);
        WebElement  lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Chynybek");

        Thread.sleep(2000);
        WebElement  email = driver.findElement(By.name("email"));
        email.sendKeys("nurjohndoe@domain.com");

        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("fjkLASDHD12B");

        Thread.sleep(2000);
        WebElement  password_confirmation = driver.findElement(By.name("password_confirmation"));
        password_confirmation.sendKeys("fjkLASDHD12B");

        Thread.sleep(2000);
        WebElement  submit = driver.findElement(By.name("//div//button[@class='action submit primary']"));
        submit.click();

        Thread.sleep(2000);
        WebElement info = driver.findElement(By.xpath("//div//div[@class='box-content']/p"));
        assertEquals("Nur Chynybek\nnurjohndoe@domain.com",info.getText());

    }
}
