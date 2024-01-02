package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW17_16_Windows {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://practice-automation.com/window-operations/");

        String unique = driver.getWindowHandle();
        System.out.println(unique);

        Thread.sleep(3000);

        WebElement newWindow = driver.findElement(By.xpath("//b[contains(text(),'New Window')]"));
        newWindow.click();

        unique = driver.getWindowHandle();
        System.out.println(unique);


        Thread.sleep(3000);
        WebElement newTab = driver.findElement(By.xpath("//b[contains(text(),'New Tab')]"));
        newTab.click();
        unique = driver.getWindowHandle();
        System.out.println(unique);


//        driver.navigate().back();
        Thread.sleep(3000);
        WebElement replaceWindow = driver.findElement(By.xpath("//b[contains(text(),'Replace')]"));
        replaceWindow.click();

        unique = driver.getWindowHandle();
        System.out.println(unique);




    }
}
