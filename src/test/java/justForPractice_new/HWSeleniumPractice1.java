package justForPractice_new;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HWSeleniumPractice1 {
    @Test
    public void hwTest1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.globalsqa.com/angularJs-protractor/BankingProject/#");

        Thread.sleep(2000);
        WebElement bankManagerLoginBtn = driver.findElement(By.xpath("//button[contains(text(), 'Bank')]"));
        bankManagerLoginBtn.click();

        Thread.sleep(2000);
        WebElement customersBtn = driver.findElement(By.xpath("//button[@class='btn btn-lg tab'][3]"));
        customersBtn.click();

        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.xpath("//table/thead//td[1]"));
        assertEquals("First Name", firstName.getText());

        Thread.sleep(2000);
        WebElement lastName = driver.findElement(By.xpath("//table/thead//td[2]"));
        assertEquals("Last Name", lastName.getText());

        Thread.sleep(2000);
        WebElement postCode = driver.findElement(By.xpath("//table/thead//td[3]"));
        assertEquals("Post Code", postCode.getText());
    }
}
