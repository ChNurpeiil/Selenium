package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class h16_20RemoveExistingCustomer {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
        Thread.sleep(2000);

        WebElement addCustomer = driver.findElement(By.xpath("//button[@ng-class='btnClass1']"));
        addCustomer.click();

        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.xpath("//input[@ng-model='fName']"));
        firstName.sendKeys("Nur");

        Thread.sleep(2000);
        WebElement lastName = driver.findElement(By.xpath("//input[@ng-model='lName']"));
        lastName.sendKeys("Chynybek");

        Thread.sleep(2000);
        WebElement postCode = driver.findElement(By.xpath("//input[@ng-model='postCd']"));
        postCode.sendKeys("120077");

        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();

        Thread.sleep(2000);
        WebElement customer = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
        customer.click();


    }
}
