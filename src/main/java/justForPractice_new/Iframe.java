package justForPractice_new;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Iframe {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo-project.wedevx.co");

        WebElement frame = driver.findElement(By.id("panel3bh-header"));
        frame.click();

        WebElement iframes = driver.findElement(By.id("iframes_page"));
        iframes.click();


        WebElement iframe1 = driver.findElement(By.id("frame1"));
        //switch your driver to different iframe
        //after this point all driver.findElement calls will be looking for
        //the element in the iframe

        driver.switchTo().frame(iframe1);


        WebElement header1 = driver.findElement(By.xpath("//h1"));
        System.out.println(header1.getText());






    }
}
