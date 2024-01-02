package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Next17_15_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://magento.softwaretestingboard.com/men/tops-men.html");

        Set<String> allProductNames = new HashSet<>();

        boolean hasNextPage = true;
        while (hasNextPage) {
            List<WebElement> names = driver.findElements(By.xpath("//a[@class='product-item-link']"));


            for (WebElement name : names) {
                String productName = name. getText();
                allProductNames.add(productName);
            }
            try {


                WebElement nextPage = driver.findElement(By.xpath("(//a[@title='Next'])[2]"));

                if (!nextPage.getAttribute("class").contains("disabled")) {
                    nextPage.click();
                } else {

                    hasNextPage = false;
//                System.out.println("Reached the last page. Exiting loop.");
//
//                break;
                }
            }catch (NoSuchElementException e){
                hasNextPage= false;
            }

            System.out.println(allProductNames.size());
            System.out.println("'unique Product Names:");
            for (String uniqueName : allProductNames) {
                System.out.println(uniqueName);
            }


        }
    }
}
