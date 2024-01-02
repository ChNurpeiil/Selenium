package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW17_9CheckBoxes_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(" https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");

        WebDriverWait wait = new WebDriverWait(driver, 15);


        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@class='ui-btn ui-corner-all ui-btn-inherit ui-btn-icon-left ui-checkbox-on'] ")));

//        WebElement checkbox = label.findElement(By.tagName("input"));//input[@name='checkbox-0 ']
        //        WebElement checkbox = driver.findElement(By.xpath("//label[@class='ui-btn ui-corner-all ui-btn-inherit ui-btn-icon-left ui-checkbox-on']"));

        System.out.println(checkbox.isSelected());
        System.out.println(checkbox.isDisplayed());

        checkbox.click();
        System.out.println(checkbox.isSelected());
        System.out.println(checkbox.isDisplayed());


    }
}
