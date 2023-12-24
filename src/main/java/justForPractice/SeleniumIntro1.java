package justForPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro1 {
    public static void main(String[] args) {
        //webDriver manager is a class that  has
        //different browser drivers.
        //for every  Selenium project that
        // executes tests on chrome browser
        //should setup chromeDriver at least 1 time
        WebDriverManager.chromedriver().setup();

        //WebDriver is a Selenium Interface
        //that represents all browser drivers
        //implementations are
        //ChromeDriver();
        //SafeDriver();
        //IEDriver();
        //FirefoxDriver();

        //new ChromeDriver() will open a browser
        WebDriver driver = new ChromeDriver();
        //get method is a method that directs
        //your browser to a special webpage
        driver.get("https://www.google.com/");
        driver.quit();

//        panel1bh-header
        //
    }
}
