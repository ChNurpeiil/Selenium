package justForPractice_new;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementNotFound {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo-project.wedevx.co/");

        Thread.sleep(2000);

       // driver.findElement(By.xpath("//div[@class='ascar']"));

        WebElement webTablesButton= driver.findElement(By.id("webTables_page"));
        webTablesButton.click();
        Thread.sleep(2000);

        List<WebElement> allThElement = driver.findElements(By.xpath("//table//th"));
        System.out.println(allThElement.size());

        for (WebElement th: allThElement){
            System.out.println(th.getText());
        }

        List<WebElement> allTdElement = driver.findElements(By.xpath("//table//td"));
        System.out.println(allTdElement.size());

        for (WebElement td: allTdElement){
            System.out.println(td.getText());
        }

        List<WebElement> list = driver.findElements(By.xpath("//table//ts"));
        System.out.println(list.size());

    }
}
