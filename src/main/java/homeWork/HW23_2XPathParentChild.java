package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW23_2XPathParentChild {
//Exercise Title: Find element using child-parent relation
//
//Objective: In this exercise, you will practice interacting with web elements using Selenium WebDriver.
//
//Task:
//
//Go to https://www.wikipedia.org/
//
//Locate the search bar input with specific conditions
//
//Conditions for XPath:
//
//Start from <body> tag
//
//ids can't be used, only class names and indexes

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");
        Thread.sleep(2000);

        WebElement searchBtn = driver.findElement(By.xpath("//body//input[@name='search']"));
        //                                                           //body/div/form/fieldset/div/input[@name='search']
        //                                                                   то же самое но //input[@name='search']
        searchBtn.click();
    }
}
