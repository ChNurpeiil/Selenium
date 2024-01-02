package justForPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxBtn {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://demo-project.wedevx.co");

        WebElement checkBoxBtn = driver.findElement(By.id("checkBox_page"));
        checkBoxBtn.click();

        WebElement child1CheckBox = driver.findElement(By.xpath("//label[@id='child1']//input"));
        System.out.println(child1CheckBox.isSelected());
        child1CheckBox.click();
        System.out.println(child1CheckBox.isSelected() );
    }
}
