package justForPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RadioButton {
    public static void main(String[] args) {
        //radioButton_page

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://demo-project.wedevx.co");

        WebElement radioButton_page = driver.findElement(By.id("radioButton_page"));
        radioButton_page.click();

        WebElement impressiveBtn=driver.findElement(By.xpath("//input[@value='Impressive']"));
        impressiveBtn.click();

        //AssertTrue(impressiveBtn.isSelected());
        System.out.println(impressiveBtn.isSelected());
        System.out.println(impressiveBtn.isEnabled());

        WebElement yesBtn = driver.findElement(By.xpath("//input[@value='Yes']"));
        System.out.println(yesBtn.isSelected());

        WebElement noBtn = driver.findElement(By.xpath("//input[@value='No']"));

        System.out.println(noBtn.isEnabled());

        //ElementClickInterceptedException
        noBtn.click();
        driver.quit();
    }
}
