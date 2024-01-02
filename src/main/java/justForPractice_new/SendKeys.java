package justForPractice_new;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-project.wedevx.co");

        Thread.sleep(5000);

        WebElement fullNameTxtBox = driver.findElement(By.id("name"));
        //sendKeys method takes a String that will be populated
        //to the located txt box in html
        fullNameTxtBox.sendKeys("Elon Musk");

        Thread.sleep(1000);
        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys("elon@spacex.com");

        Thread.sleep(1000);
        WebElement currentAddressTxtBox = driver.findElement(By.id("currentAddress"));
        currentAddressTxtBox.sendKeys("123 Main St");

        Thread.sleep(1000);
        WebElement permanentAddressTxtBox = driver.findElement(By.id("permanentAddress"));
        permanentAddressTxtBox.sendKeys("123 SpaceX ave");




        WebElement submit = driver.findElement(By.className("MuiButton-contained"));
        submit.click();

//        class="MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1hw9j7s"
    }
}
