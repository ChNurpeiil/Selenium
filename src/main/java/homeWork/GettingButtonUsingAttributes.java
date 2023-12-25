package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingButtonUsingAttributes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");

        Thread.sleep(2000);
        WebElement addCustomerBnt = driver.findElement(By.xpath("//button[@ng-class='btnClass1']"));
        addCustomerBnt.click();
        String attributeAddCustomer = addCustomerBnt.getAttribute("ng-click");
        System.out.println(attributeAddCustomer);

        Thread.sleep(2000);
        WebElement openAccountBtn = driver.findElement(By.xpath("//button[@ng-class='btnClass2']"));
        openAccountBtn.click();
        String attributeOpenAccount = openAccountBtn.getAttribute("ng-click");
        System.out.println(attributeOpenAccount);

        Thread.sleep(2000);
        WebElement customersBtn = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
        customersBtn.click();
        String attributeCustomers = customersBtn.getAttribute("ng-click");
    }
}
