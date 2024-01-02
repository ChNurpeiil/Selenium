package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HW17_12_1MovingSlider {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://practice-automation.com/slider/");

        WebElement slider = driver.findElement(By.xpath("//input[@id='slideMe']"));
        Actions actions = new Actions(driver);



        WebElement currentValue = driver.findElement(By.xpath("//p[contains(text(),'Current value:')]"));
        System.out.println(currentValue.getText());
        actions.clickAndHold(slider).moveByOffset(-591, 25).perform();
        System.out.println(currentValue.getText());
        actions.clickAndHold(slider).moveByOffset(-50, 25).perform();
        System.out.println(currentValue.getText());
        actions.clickAndHold(slider).moveByOffset(0, 25).perform();
        System.out.println(currentValue.getText());
        actions.clickAndHold(slider).moveByOffset(30, 25).perform();
        System.out.println(currentValue.getText());

        actions.dragAndDropBy(slider,10,25);
        System.out.println(currentValue.getText());

        //this is not working


    }
}
