package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW17_10_2Dropdowns_practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://magento.softwaretestingboard.com/");

        WebElement click = driver.findElement(By.xpath("(//a[contains(text(),'Create an Account')])[1]"));
        click.click();

        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("Sadhfhjgg");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.sendKeys("Assdf");
        WebElement email_address = driver.findElement(By.id("email_address"));
        email_address.sendKeys("bhsdhfjgkg@domain.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("hglHKGK@530d");
        WebElement password2 = driver.findElement(By.id("password-confirmation"));
        password2.sendKeys("hglHKGK@530d");

        WebElement search = driver.findElement(By.xpath("//button[@title='Create an Account']"));
        search.click();

        WebElement manageAddress = driver.findElement(By.xpath("//div[@class='block-title']/a"));
        manageAddress.click();


        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("Google");

        WebElement phone = driver.findElement(By.id("telephone"));
        phone.sendKeys("+996552556226");

        WebElement streetAddress1 = driver.findElement(By.id("street_1"));
        streetAddress1.sendKeys("MKP-12");

        WebElement streetAddress2 = driver.findElement(By.id("street_2"));
        streetAddress2.sendKeys("Asanbay");
        WebElement streetAddress3 = driver.findElement(By.id("street_3"));
        streetAddress3.sendKeys("83");
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Bishkek");

        WebElement zipCode = driver.findElement(By.id("zip"));
        zipCode.sendKeys("12345-6789");

        WebElement countries = driver.findElement(By.id("country"));
        countries.click();
        Select country = new Select(countries);
        country.selectByIndex(45);

        WebElement saveAddress = driver.findElement(By.xpath("//button[@class='action save primary']"));
        saveAddress.click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")));
        System.out.println(message.getText());

        WebElement billingAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='box box-address-billing']")));
        System.out.println(billingAddress.getText());

        WebElement shippingAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='box box-address-shipping']")));
        System.out.println(shippingAddress.getText());

    }
}
