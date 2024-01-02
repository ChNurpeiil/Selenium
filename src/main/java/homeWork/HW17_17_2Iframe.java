package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW17_17_2Iframe {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://practice-automation.com/iframes/");

        WebElement iframe1 = driver.findElement(By.id("frame2"));

        WebElement iframe2 = driver.findElement(By.id("frame1"));

        driver.switchTo().frame(iframe1);
        List<WebElement> linkFooter = driver.findElements(By.xpath("//li[@class='GlobalFooter__Menu__List__Item']"));
        System.out.println("Link from footer: ");
        for (WebElement link : linkFooter){
            System.out.println(link.getText());
        }

        driver.switchTo().parentFrame();
        driver.switchTo().frame(iframe2);
        WebElement downloads = driver.findElement(By.xpath("//a[@href='/downloads']"));
        downloads.click();

        WebElement lastVersion = driver.findElement(By.xpath("(//p[@class='card-text'])[1]"));
        System.out.println("Last version in Selenium server: "+lastVersion.getText());



    }
}
