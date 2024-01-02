package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HwW17_8_1Upload {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(" https://formstone.it/components/upload/demo/");

        WebElement uploadFirst = driver.findElement(By.xpath("//div[@class='demo_example fs-tabs-content fs-tabs__1 fs-demo fs-tabs-enabled fs-tabs-active']//input[@class='fs-upload-input']"));
        uploadFirst.sendKeys("C:/Users/ASUSN/Downloads/logo.png");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
                .withTimeout(5, TimeUnit.SECONDS);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='content']")));


        WebElement result = driver.findElement(By.xpath("//span[@class='content']"));

        System.out.println(result.getText());

    }
}
