package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HW17_18_2Alert {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");

        WebElement addCustomerBtn = driver.findElement(By.xpath("//button[@ng-class='btnClass1']"));
        addCustomerBtn.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@ng-model='fName']"));
        firstName.sendKeys("Nur");

        driver.findElement(By.xpath("//input[@ng-model='lName']")).sendKeys("Asy");
        driver.findElement(By.xpath("//input[@ng-model='postCd']")).sendKeys("1234567");

        WebElement addCustom = driver.findElement(By.xpath("//button[@type='submit']"));
        addCustom.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.findElement(By.xpath("//button[@class='btn home']")).click();
        driver.findElement(By.xpath("//button[@ng-click='customer()']")).click();


        WebElement name = driver.findElement(By.id("userSelect"));
        name.click();




        Select select = new Select(name);
        select.selectByVisibleText("Nur Asy");

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        WebElement welcomeMessage = driver.findElement(By.xpath("(//div[@class='borderM box padT20 ng-scope']/div)[1]"));
        System.out.println(welcomeMessage.getText());

    }
}
