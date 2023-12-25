package justForPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIntro {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://demo-project.wedevx.co/");

        Thread.sleep(2000);
        WebElement formsSelectionBtn = driver.findElement(By.id("panel2bh-header"));
        formsSelectionBtn.click();

        Thread.sleep(1000);

        WebElement practiceForm = driver.findElement(By.id("practiceForm_page"));
        practiceForm.click();

        Thread.sleep(1000);

        WebElement studentRegistrationFormTitle= driver.findElement(By.xpath("//h3"));
        System.out.println(studentRegistrationFormTitle.getText());


    }
}
