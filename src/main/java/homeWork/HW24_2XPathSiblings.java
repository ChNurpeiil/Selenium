package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW24_2XPathSiblings {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");

        Thread.sleep(2000);

        WebElement ItalianArticles = driver.findElement(By.xpath("(//div[@lang='it']/preceding-sibling::div)[6]"));

        String printArticles = ItalianArticles.getText();
        System.out.println(printArticles);
    }
    }

