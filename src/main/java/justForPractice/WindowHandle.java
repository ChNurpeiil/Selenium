package justForPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo-project.wedevx.co");

        driver.findElement(By.id("panel3bh-header")).click();
        WebElement browser = driver.findElement(By.xpath("//button[@id='browserWindows_page']"));
        browser.click();

        //
       String uniqueIdCurrentTab = driver.getWindowHandle();
        System.out.println(uniqueIdCurrentTab);

        WebElement newTab = driver.findElement(By.id("tabButton"));
        newTab.click();

        //It's important to save the id of your current tab
        uniqueIdCurrentTab = driver.getWindowHandle();
        System.out.println(uniqueIdCurrentTab);

        newTab.click();



        //
        Set<String> allOpenTabIds = driver.getWindowHandles();
        //how to access Set?
        //
        for (String tabId : allOpenTabIds){
            if (!tabId.equals(uniqueIdCurrentTab)){
                driver.switchTo().window(tabId);
                break;
            }
        }
        WebElement h1 = driver.findElement(By.xpath("//h1"));
        System.out.println(h1.getText());

    }
}
