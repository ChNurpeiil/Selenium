package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW17_9CheckBoxes2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(" https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");

        WebDriverWait wait = new WebDriverWait(driver, 20);

        List<WebElement> checkBoxes = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("input[type='checkbox']")));

        for (WebElement checkbox : checkBoxes){
            System.out.println("Checkboxes: "+checkbox.getAttribute("id")+ " - Displayed: "+ checkbox.isDisplayed());

        }
//        WebElement oneCheckBox
    }
}
