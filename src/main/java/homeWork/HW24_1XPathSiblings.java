package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW24_1XPathSiblings {
    /*
    Task:

Go to https://www.wikipedia.org/

Print a number of articles that are in Chinese with specific conditions for XPath

Conditions for XPath:

Start from the "Italiano" element

Only one value of the attribute can be used and only once - "it"

Ids and other attributes can't be used, only indexes
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");

        Thread.sleep(2000);

        WebElement ItalianArticles = driver.findElement(By.xpath("//div[@lang='it']/following-sibling::div"));

        String printArticles = ItalianArticles.getText();
        System.out.println(printArticles);
    }
}
