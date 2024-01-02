package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW17_1_1FIndElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");

        List<WebElement> find = driver.findElements(By.xpath("//a[@class='link-box']"));
        System.out.println(find.size());

        for (WebElement element: find){
            System.out.println(element.getText());
        }

    }
}
