package justForPractice_new;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class just {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://dbank-qa.wedevx.co/bank/login");


        WebElement usernameTxt = driver.findElement(By.id("username"));
        WebElement passwordTxt = driver.findElement(By.id("password"));
        WebElement submitBtn = driver.findElement(By.id("submit"));

        usernameTxt.sendKeys("saki@gmail.com");
        passwordTxt.sendKeys("124578N12ch");
        submitBtn.click();


        WebElement checkingMenu = driver.findElement(By.id("checking-menu"));
        checkingMenu.click();

        WebElement newChecking = driver.findElement(By.id("new-checking-menu-item"));
        newChecking.click();


//        WebElement currentPassword = driver.findElement(By.name("currentPassword"));
//        currentPassword.sendKeys("124578N12ch");



    }
}
