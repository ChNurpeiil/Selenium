package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HW17_7_1FluentWaits {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(" https://magento.softwaretestingboard.com/");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(5,TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class)
                        .ignoring(ElementNotInteractableException.class);

//        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create an Account"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname"))).sendKeys("TestFirstnpme");
        driver.findElement(By.id("lastname")).sendKeys("TestLastnpme");
        driver.findElement(By.id("email_address")).sendKeys("examplep@test.com");
        driver.findElement(By.id("password")).sendKeys("Y7YBJiHn!3y7iv*");
        driver.findElement(By.id("password-confirmation")).sendKeys("Y7YBJiHn!3y7iv*");



        driver.findElement(By.xpath("//button[@title='Create an Account']")).click();

//        wait.until(ExpectedConditions.urlContains("/customer/account/index"));



        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class ='action edit']"))).click();
        driver.findElement(By.id("email")).sendKeys("examplep@test.com");
        driver.findElement(By.id("pass")).sendKeys("Y7YBJiHn!3y7iv*");
        driver.findElement(By.id("send2")).click();

        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("NewName");
        driver.findElement(By.xpath("//button[@title='Save']")).click();




        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
        String beforeEditName = firstName.getAttribute("value");
        System.out.println("Name before modification: " + beforeEditName);

        firstName.clear();
        firstName.sendKeys("ModifiedFirstName");

        driver.findElement(By.xpath("//button[@title='Save']")).click();

        String afterEditName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname"))).getAttribute("value");
        System.out.println("Name after modification: " + afterEditName);

        driver.quit();
    }
}
