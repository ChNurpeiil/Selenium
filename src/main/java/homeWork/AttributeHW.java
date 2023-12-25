package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeHW {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(2000);

        WebElement makeAppointment = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        makeAppointment.click();

        Thread.sleep(200);
        WebElement name = driver.findElement(By.xpath("//input[@value='John Doe']"));

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("John Doe");

        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("ThisIsNotAPassword");

        Thread.sleep(2000);
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        Thread.sleep(2000);
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        Thread.sleep(2000);
        WebElement medicaid = driver.findElement(By.xpath("//input[@value='Medicaid']"));
        medicaid.click();

        Thread.sleep(2000);
        WebElement date = driver.findElement(By.xpath("//input[@name='visit_date']"));
        date.click();
        date.sendKeys("24/12/2023");

        Thread.sleep(2000);
        WebElement comment = driver.findElement(By.id("txt_comment"));
        comment.sendKeys("Never give up!!");

        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("//button[@id='btn-book-appointment']"));
        button.click();

        WebElement facility = driver.findElement(By.xpath("//p[@id='facility']"));
        String facility1 = facility.getAttribute("id");
        System.out.println(facility1);

    }
}
