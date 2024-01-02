package justForPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UploadFile {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo-project.wedevx.co");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        WebElement uploadDownloadPage = driver.findElement(By.id("uploadDownload_page"));
        uploadDownloadPage.click();


        WebElement chooseFileBtn = driver.findElement(By.id("uploadFile"));

        //when you need to upload a file
        //you don't need to click on the button, just sendKeys right away
        chooseFileBtn.sendKeys("C:/Users/ASUSN/Downloads/picture.jpg");

        WebElement downloadBtn = driver.findElement(By.id("downloadButton"));
        downloadBtn.click();


//        driver.quit();
    }
}
