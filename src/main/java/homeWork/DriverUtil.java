package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverUtil {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
//        WebDriverManager.iedriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.wedevx.co");
        driver.quit();
    }
}
