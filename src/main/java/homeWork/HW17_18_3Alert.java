package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW17_18_3Alert {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");

        WebElement addCustomerBtn = driver.findElement(By.xpath("//button[@ng-class='btnClass1']"));
        addCustomerBtn.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@ng-model='fName']"));
        firstName.sendKeys("Nur");

        driver.findElement(By.xpath("//input[@ng-model='lName']")).sendKeys("Asy");
        driver.findElement(By.xpath("//input[@ng-model='postCd']")).sendKeys("1234567");

        WebElement addCustom = driver.findElement(By.xpath("//button[@type='submit']"));
        addCustom.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement homePage = driver.findElement(By.xpath("//button[@class='btn home']"));
        homePage.click();

        WebElement customerLoginBtn = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']"));
        customerLoginBtn.click();

        WebElement nameSelect = driver.findElement(By.id("userSelect"));
        nameSelect.click();

        Select select1 = new Select(nameSelect);
        List<WebElement> options = select1.getOptions();
        boolean found = false;

        for (WebElement option : options){
            if (option.getText().equals("Nur Asy")){
                found= true;
                break;
            }
        }

        if (found){
            select1.selectByVisibleText("Nur Asy");
        } else {
            System.out.println("Option 'Nur Asy not found.");
        }


        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
        WebElement openBtn = driver.findElement(By.xpath("//button[@ng-class='btnClass2']"));
        openBtn.click();

        WebElement customerSelect = driver.findElement(By.id("userSelect"));
        customerSelect.click();
        Select select = new Select(customerSelect);
        select.selectByVisibleText("Nur Asy");

        WebElement currency = driver.findElement(By.id("currency"));
        currency.click();
        Select selectCurrency = new Select(currency);
        selectCurrency.selectByIndex(1);

        WebElement process = driver.findElement(By.xpath("//button[@type='submit']"));
        process.click();

        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        homePage.click();

        WebElement customerLoginBtn1 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']"));
        customerLoginBtn1.click();

        WebElement nameSelect1 = driver.findElement(By.id("userSelect"));
        nameSelect1.click();

        select1.selectByVisibleText("Nur Asy");

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();


        WebElement info = driver.findElement(By.xpath("(//div[@ng-hide='noAccount'])[1]"));
        System.out.println(info.getText());

    }
}
