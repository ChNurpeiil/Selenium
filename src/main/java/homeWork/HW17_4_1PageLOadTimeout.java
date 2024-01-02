package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW17_4_1PageLOadTimeout {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MILLISECONDS);
        driver.get(" https://www.nasdaq.com/market-activity/stocks/tsla/real-time");


//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.get(" https://www.nasdaq.com/market-activity/stocks/tsla/real-time");

    }
}
