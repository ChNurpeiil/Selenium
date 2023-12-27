package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW23_1XPathParentAndChild {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list");

        Thread.sleep(2000);
        WebElement findAccountNumberAlbus = driver.findElement(By.xpath("(//tr[@class='ng-scope']//td)[19]"));
        String printNumber = findAccountNumberAlbus.getText();
        System.out.println(printNumber);
    }
}
