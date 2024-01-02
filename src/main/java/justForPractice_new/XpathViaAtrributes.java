package justForPractice_new;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathViaAtrributes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Thread.sleep(2000);
        driver.get("https://demo-project.wedevx.co/");

        Thread.sleep(2000);

        WebElement brokenPage = driver.findElement(By.xpath("//button[@id='broken_page']"));
        brokenPage.click();
        Thread.sleep(2000);

        WebElement  brokenImage = driver.findElement(By.xpath("//img[@alt='invalid-logo']"));
        System.out.println(brokenImage.getText());


        Thread.sleep(2000);

        WebElement validImage = driver.findElement(By.xpath("//img[@src='/image/gg.png']"));
        System.out.println(validImage.getText());

        String attributeValue = brokenImage.getAttribute("src");
        System.out.println(attributeValue);

        System.out.println(brokenImage.getAttribute("alt"));
        //if attribute doesn't exist you get a null
        System.out.println(brokenImage.getAttribute("al2t"));


        driver.findElement(By.xpath("//a[@href='https://www.wedevx.co/']"));
    }
}
