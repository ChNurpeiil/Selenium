package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW17_15_1__JS_Scrolling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://magento.softwaretestingboard.com/");

        driver.findElement(By.xpath("(//a[contains(text(),'Create an Account')])[1]")).click();
        driver.findElement(By.id("firstname")).sendKeys("Nur");
        driver.findElement(By.id("lastname")).sendKeys("Asy");
        driver.findElement(By.name("email")).sendKeys("nurr@domain.com");
        driver.findElement(By.id("password")).sendKeys("GJKghls2@14hlsgj");
        driver.findElement(By.name("password_confirmation")).sendKeys("GJKghls2@14hlsgj");
        //driver.findElement(By.xpath("//button[@title='Create an Account']")).click();

        driver.findElement(By.xpath("//span[@class='action nav-toggle']")).click();
        driver.findElement(By.id("ui-id-5")).click();
        driver.findElement(By.id("ui-id-17")).click();


        List<WebElement> newName = new ArrayList<>();

        List<WebElement> names = driver.findElements(By.xpath("//a[@class='product-item-link']"));


        for (WebElement name : names){
            System.out.println(name);

            if (name != name){
                newName.add(name);
            }
        }

    }
}
