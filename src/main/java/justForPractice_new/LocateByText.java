package justForPractice_new;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo-project.wedevx.co/");

        Thread.sleep(5000);

        WebElement linkBtn = driver.findElement(By.id("links_page"));
        linkBtn.click();

        Thread.sleep(2000);
        WebElement createdLink = driver.findElement(By.linkText("Created"));
        createdLink.click();

        Thread.sleep(2000);
        WebElement movedLink = driver.findElement(By.linkText("Moved"));
        movedLink.click();

        Thread.sleep(2000);
        WebElement notFoundLink = driver.findElement(By.partialLinkText("Not"));
        notFoundLink.click();

        Thread.sleep(2000);
        WebElement badRequest = driver.findElement(By.partialLinkText("Bad"));
        badRequest.click();
    }
}
