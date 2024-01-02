package justForPractice_new;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://demo-project.wedevx.co");

        WebElement windowOption = driver.findElement(By.id("panel3bh-header"));
        windowOption.click();

        WebElement alertPage = driver.findElement(By.id("alerts_page"));
        alertPage.click();

        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();


        Thread.sleep(2000);
        //switches to teh currently active alert.
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        alert.accept();

        WebElement alertButtonWithDismissOption = driver.findElement(By.id("confirmButton"));
        alertButtonWithDismissOption.click();
        Thread.sleep(2000);

        alert= driver.switchTo().alert();
        alert.dismiss();

        alertButtonWithDismissOption.click();
        Thread.sleep(2000);

        alert.accept();

        WebElement promptButton = driver.findElement(By.id("promptButton"));
        promptButton.click();
        Thread.sleep(2000);

        alert= driver.switchTo().alert();

        alert.sendKeys("I'm proud myself for studying hard and consistently, and I know that "+
                "all of my efforts will pay off big time. When that happens I will thank my self for doing this");

        alert.accept();


    }
}
