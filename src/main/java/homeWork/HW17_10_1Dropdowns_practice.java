package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW17_10_1Dropdowns_practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(" https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement customerLoginBtn = driver.findElement(By.xpath("//button[@ng-click='customer()']"));
        customerLoginBtn.click();

        WebElement selectName = driver.findElement(By.id("userSelect"));

        selectName.click();

        Select selectId = new Select(selectName);
        selectId.selectByIndex(2);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("(//div[@ng-hide='noAccount'])[1]")).getText();

        driver.findElement(By.xpath("//button[@ng-class='btnClass1']")).click();


    }
}
