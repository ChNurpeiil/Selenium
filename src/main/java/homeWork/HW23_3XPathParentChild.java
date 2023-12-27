package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW23_3XPathParentChild {
    /*
    Exercise Title: Get the number of articles for specific language

Objective: In this exercise, you will practice interacting with web elements using Selenium WebDriver.

Task:

Go to https://www.wikipedia.org/

Print a number of articles that are in French with specific conditions for XPath

Conditions for XPath:

Start from //div[@class='central-featured']

The class attribute can be used only for div containing the value "central-featured-lang"

Ids and other attributes can't be used, only indexes
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");

        Thread.sleep(2000);

        WebElement findTxt = driver.findElement(By.xpath("(//div//small)[6]"));
        //                                                          (//div[@class='central-featured']//small)[6]
        String Txt = findTxt.getText();
        System.out.println(Txt);
    }
}
