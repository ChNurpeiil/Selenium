package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW17_17_1Iframe {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://practice-automation.com/iframes/");

        WebElement iframe1 = driver.findElement(By.id("frame2"));

        driver.switchTo().frame("frame2");
        WebElement menu = driver.findElement(By.xpath("//button[@aria-label='Menu']"));
        menu.click();


        List<WebElement> topics =driver.findElements(By.xpath("//li[@class='MenuModal__Content__List__Item MenuModal__Content__List__Item--left']"));
        System.out.println("All topic: ");
        for (WebElement topic : topics){

            System.out.println(topic.getText());
        }

        List<WebElement> sites = driver.findElements(By.xpath("//li[@class='MenuModal__Content__List__Item']"));
        System.out.println("All sites: ");
        for (WebElement site : sites){

            System.out.println(site.getText());
        }
    }
}
