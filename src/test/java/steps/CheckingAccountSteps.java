package steps;

import com.github.dockerjava.api.model.Link;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import models.AccountCard;
import models.BankTransaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckingAccountSteps {

    @BeforeAll
    public static void setUp() {
        WebDriverManager.firefoxdriver().setup();
    }

    WebDriver driver = new FirefoxDriver();

    @Given("the user is on dbank homepage")
    public void the_user_is_on_dbank_homepage() {

        driver.get("https://dbank-qa.wedevx.co/bank/login");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Given("the user logged in as {string} {string}")
    public void the_user_logged_in_as(String username, String password) {
        WebElement usernameTxt = driver.findElement(By.id("username"));
        WebElement passwordTxt = driver.findElement(By.id("password"));
        WebElement submitBtn = driver.findElement(By.id("submit"));

        usernameTxt.sendKeys(username);
        passwordTxt.sendKeys(password);
        submitBtn.click();

    }

    @Given("the user clicks on the  checking button")
    public void the_user_clicks_on_the_checking_button() {
        WebElement checkingMenu = driver.findElement(By.id("checking-menu"));
        checkingMenu.click();


    }

    @Given("the user clicks new checking button")
    public void the_user_clicks_new_checking_button() {
        WebElement newCheckingBtn = driver.findElement(By.id("new-checking-menu-item"));
        newCheckingBtn.click();

        String expectedUrl = "https://dbank-qa.wedevx.co/bank/account/checking-add";
        assertEquals(expectedUrl, driver.getCurrentUrl(), "new checking Button didn't take to the url" + expectedUrl);

    }

    @When("the user selects {string} Account type")
    public void the_user_selects_account_type(String idOfRadioBtn) {
        WebElement accountTypeRadioBtn = driver.findElement(By.id(idOfRadioBtn));
        accountTypeRadioBtn.click();

    }

    @When("the user select {string} Account Ownership")
    public void the_user_select_account_ownership(String ownershipTypeRadioBtnId) {
        WebElement ownershipRadioBtn = driver.findElement(By.id(ownershipTypeRadioBtnId));
        ownershipRadioBtn.click();
    }

    @When("the user names the account {string}")
    public void the_user_names_the_account(String accountName) {
        WebElement accountNameTxt = driver.findElement(By.id("name"));
        accountNameTxt.sendKeys(accountName);
    }

    @When("the user makes the initial deposit of ${double}")
    public void the_user_makes_the_initial_deposit_of_$(Double openingBalance) {
        WebElement openingBalanceTxtBox = driver.findElement(By.id("openingBalance"));
        openingBalanceTxtBox.sendKeys(String.valueOf(openingBalance));

    }

    @When("the user clicks on submit")
    public void the_user_clicks_on_submit() {
        WebElement submit = driver.findElement(By.id("newCheckingSubmit"));
        submit.click();
    }

    @Then("the user should see the green {string}")
    public void the_user_should_see_the_green(String expectedConfMessage) {

        WebElement newAccountConfAlertDiv = driver.findElement(By.id("new-account-conf-alert"));
        expectedConfMessage = "Confirmation " + expectedConfMessage + "\n×";

//        String actualConfMessage = newAccountConfAlertDiv.getText();
//        System.out.println(actualConfMessage.substring(0, actualConfMessage.indexOf("\n")));
        assertEquals(expectedConfMessage, newAccountConfAlertDiv.getText());
//        System.out.println(newAccountConfAlertDiv.getText());


    }

    @Then("the user should see newly added account card")
    public void the_user_should_see_newly_added_account_card(List<AccountCard> accountCardList) {
        WebElement firstRowDiv = driver.findElement(By.id("firstRow"));
        List<WebElement> allFirstRowDivs = driver.findElements(By.xpath("//div[@id='firstRow']/div"));
//        for (WebElement card : allFirstRowDivs){
//            System.out.println(card.getText());

        WebElement lastAccountCard = allFirstRowDivs.get(allFirstRowDivs.size() - 1);
//        System.out.println(lastAccountCard.getText());
        String actualResult = lastAccountCard.getText();

        String actualAccountName = actualResult.substring(0, actualResult.indexOf("\n")).trim();

        String actualAccountType = actualResult.substring(actualResult.indexOf("Account"),actualResult.indexOf("Ownership:")).trim();

        String actualOwnership = actualResult.substring(actualResult.indexOf("Ownership:"), actualResult.indexOf("Account Number:")).trim();

        String actualAccountNumber = actualResult.substring(actualResult.indexOf("Account Number:"), actualResult.indexOf("Interest Rate:")).trim();

        String actualInterestRate = actualResult.substring(actualResult.indexOf("Interest Rate:"), actualResult.indexOf("Balance:")).trim();

        String actualBalance = actualResult.substring(actualResult.indexOf("Balance:")).trim();

        AccountCard expectedResult = accountCardList.get(0);
        assertEquals(expectedResult.getAccountName(), actualAccountName);
        assertEquals("Account: "+expectedResult.getAccountType(), actualAccountType);
        assertEquals("Ownership: "+ expectedResult.getOwnership(), actualOwnership);
        assertEquals("Interest Rate: "+expectedResult.getInterestRate(),actualInterestRate);
        String expectedBalance = String.format("%.2f", expectedResult.getBalance());
        assertEquals("Balance: $"+ expectedBalance,actualBalance);





        System.out.println("////////////////////");
        System.out.println(lastAccountCard.getText());


    }

    //    }
    @Then("the user should see the following transactions")
    public void the_user_should_see_the_following_transactions(List<BankTransaction> expectedTransactions) {
        WebElement firstRowTransaction = driver.findElement(By.xpath("//table[@id='transactionTable']/tbody/tr"));

        List<WebElement> firstRowColumns = firstRowTransaction.findElements(By.xpath("td"));
        String actualCategory = firstRowColumns.get(1).getText();
        String actualDescription = firstRowColumns.get(2).getText();
        double actualAmount = Double.parseDouble(firstRowColumns.get(3).getText().substring(1));
        double actualBalance = Double.parseDouble(firstRowColumns.get(4).getText().substring(1));

         BankTransaction expectedTransaction = expectedTransactions.get(0);

        assertEquals(expectedTransaction.getCategory(),actualCategory,"Transaction category mismatch");
//        assertEquals(expectedTransaction.getDescription(),actualDescription,"Transaction description mismatch");
        assertEquals(expectedTransaction.getAmount(), actualAmount,"Transaction amount mismatch");
        assertEquals(expectedTransaction.getBalance(),actualBalance,"Transaction balance mismatch");



    }

}
