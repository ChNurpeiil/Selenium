package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW22_1XPathContainsStars_withEnds_with {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" https://demo-project.wedevx.co/");

        Thread.sleep(2000);

        WebElement widgets = driver.findElement(By.xpath("//div[contains(@id, 'panel4bh-header')]"));
        widgets.click();

        Thread.sleep(2000);
        WebElement tabs = driver.findElement(By.xpath("//button[contains(@id, 'tabs_page')]"));
        tabs.click();

        Thread.sleep(2000);
        WebElement whatBtn = driver.findElement(By.xpath("//button[contains(text(), 'What')]"));
        whatBtn.click();

        Thread.sleep(2000);
        WebElement originBtn = driver.findElement(By.xpath("//button[contains(@id, 'simple-tab-1')]"));
        originBtn.click();

        Thread.sleep(2000);
        WebElement useBtn = driver.findElement(By.xpath("//button[contains(text(), 'Use')]"));
        useBtn.click();

        Thread.sleep(2000);
        WebElement moreBtn = driver.findElement(By.xpath("//button[contains(text(),'More')]"));
    }
}
