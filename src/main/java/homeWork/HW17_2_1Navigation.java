package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW17_2_1Navigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(2000);

        WebElement customerLoginBtn = driver.findElement(By.xpath("//button[text()='Customer Login']"));
        customerLoginBtn.click();

        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);
        WebElement bankManagerLoginBtn = driver.findElement(By.xpath("//button[text()='Bank Manager Login']"));
        bankManagerLoginBtn.click();
        Thread.sleep(2000);

        WebElement addBtn = driver.findElement(By.xpath("//button[@ng-click='addCust()']"));
        addBtn.click();
        Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(2000);
        WebElement openAccountBtn = driver.findElement(By.xpath("//button[@ng-class='btnClass2']"));
        openAccountBtn.click();
        Thread.sleep(2000);
        driver.navigate().back();
        WebElement customersBtn = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
        customersBtn.click();

        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);

        WebElement homePage = driver.findElement(By.xpath("//button[@class='btn home']"));
        homePage.click();

        driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list");


    }
}
