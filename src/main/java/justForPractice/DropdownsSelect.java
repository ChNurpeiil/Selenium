package justForPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownsSelect {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://demo-project.wedevx.co");

        WebElement form = driver.findElement(By.id("panel2bh-header"));
        form.click();

        WebElement practiceForm = driver.findElement(By.id("practiceForm_page"));
        practiceForm.click();

        WebElement stateDropdown = driver.findElement(By.id("react-select-6-input"));

        Select stateDropdownSelect = new Select(stateDropdown);

        List<WebElement> allStateOptions = stateDropdownSelect.getOptions();
        for (WebElement state : allStateOptions){
            System.out.println(state.getText());
        }
        stateDropdownSelect.selectByIndex(3);

        stateDropdownSelect.selectByValue("Texas");


    }
}
