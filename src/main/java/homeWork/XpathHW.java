package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHW {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Thread.sleep(2000);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");

        Thread.sleep(2000);

        WebElement title = driver.findElement(By.xpath("//strong[contains(text(),'XYZ Bank')]"));
        System.out.println(title.getText());
    }
}
