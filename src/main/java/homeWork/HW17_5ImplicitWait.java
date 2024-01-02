package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HW17_5ImplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" https://www.x-rates.com/table/?from=USD&amount=1");

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr[position()<=5]"));
        Map<String, String> dataMap = new HashMap<>();

        for (WebElement row: rows){
            List<WebElement> columns = row.findElements(By.xpath(".//td[position() <= 2]"));
            if (columns.size() >= 2){
                String key = columns.get(0).getText();
                String value = columns.get(1).getText();
                dataMap.put(key, value);
            }
        }
        System.out.println(dataMap);
    }
}

