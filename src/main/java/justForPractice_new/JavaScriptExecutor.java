package justForPractice_new;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        //in js window.location='url' -> driver.get(url)
        js.executeScript("window.location='https://www.etsy.com/'");

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-1000)");

        Thread.sleep(2000);
        WebElement helpCenterLInk = driver.findElement(By.xpath("//a[@href='https://www.etsy.com/help?ref=ftr']"));
        js.executeScript("arguments[0].scrollIntoView()", helpCenterLInk);

        Thread.sleep(2000);
        WebElement signInButton = driver.findElement(By.xpath("//button[contains(text(), 'Войти')]"));
        js.executeScript("arguments[0].scrollIntoView()", signInButton);

        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red')", signInButton);

        js.executeScript("arguments[0].click()", signInButton);
    }
}
