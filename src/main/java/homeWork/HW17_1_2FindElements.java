package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW17_1_2FindElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list");

        Thread.sleep(2000);
        List<WebElement> customerElements = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped']/tbody/tr"));

        for (WebElement customerElement: customerElements ) {
            WebElement postCodeElement = customerElement.findElement(By.xpath("(//td)[6]"));

            String postcode = postCodeElement.getText();

            if (postcode.contains("8")) {
                WebElement name =customerElement.findElement(By.xpath("(//td)[1]"));
                String customerName = name.getText();
                System.out.println(customerName);
                System.out.println(name.getText());
            }
        }
    }
}
