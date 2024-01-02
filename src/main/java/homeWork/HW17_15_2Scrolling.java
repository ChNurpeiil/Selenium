package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW17_15_2Scrolling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Переход на веб-страницу и регистрация нового пользователя
        driver.get("https://magento.softwaretestingboard.com/men/tops-men.html");

        // Проверка начального количества элементов на странице (по умолчанию - 12)
        validateItemsPerPage(driver, wait, 12);

        // Изменение количества элементов на странице на 24 и проверка
        changeItemsPerPage(driver, wait, "24");
        validateItemsPerPage(driver, wait, 24);

        // Изменение количества элементов на странице на 36 и проверка
        changeItemsPerPage(driver, wait, "36");
        validateItemsPerPage(driver, wait, 36);

        // Закрытие браузера после завершения теста
        driver.quit();
    }

    // Метод для изменения количества элементов на странице
    private static void changeItemsPerPage(WebDriver driver, WebDriverWait wait, String displayCount) {
        // Создание объекта для выполнения JavaScript-кода
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement displayDropdown = driver.findElement(By.xpath("(//select[@id='limiter'])[2]"));

        // Использование JavaScript для изменения значения выпадающего списка
        js.executeScript("arguments[0].value = arguments[1]", displayDropdown, displayCount);
        js.executeScript("arguments[0].dispatchEvent(new Event('change'))", displayDropdown);

        // Ожидание применения выбранного значения
        Select select = new Select(displayDropdown);
        select.selectByIndex(1);
        select.selectByIndex(2);
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div.pages-items"), "Page 1 of"));

        // Ожидание изменения количества элементов на странице после выбора нового значения
//        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("ol.products li.item"), 0));
    }

    // Метод для проверки количества элементов на странице
    private static void validateItemsPerPage(WebDriver driver, WebDriverWait wait, int expectedItemCount) {
        // Поиск всех элементов на странице
        List<WebElement> items = driver.findElements(By.cssSelector("ol.products li.item"));
        int actualItemCount = items.size();

        // Проверка количества элементов на странице
        if (actualItemCount == expectedItemCount) {
            System.out.println("Number of items per page: " + actualItemCount + " - Validation Passed");
        } else {
            System.out.println("Number of items per page: " + actualItemCount + " - Validation Failed");
        }

        // Подсчет количества страниц
        int pageCount = driver.findElements(By.cssSelector("div.pages-items ul li")).size();
        System.out.println("Number of pages: " + pageCount);


    }
}
