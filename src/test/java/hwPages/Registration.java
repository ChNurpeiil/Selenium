package hwPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration {
    private WebDriver driver;


    public Registration(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'Sign Up Here')]")
    private WebElement signUp;

    @FindBy(id = "title")
    private WebElement pleaseSelect;


    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(xpath="//input[@value='F']")
    private WebElement gender;

    @FindBy(id="dob")
    private WebElement dob;

    @FindBy(id = "ssn")
    private WebElement ssn;

    @FindBy(id = "emailAddress")
    private WebElement emailAddress;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id="confirmPassword")
    private WebElement confirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement nextBtn;


    @FindBy(id="address")
    private WebElement address;
    @FindBy(id="locality")
    private WebElement locality;
    @FindBy(id="region")
    private WebElement region;
    @FindBy(id="postalCode")
    private WebElement postalCode;
    @FindBy(id="country")
    private WebElement country;
    @FindBy(id="homePhone")
    private WebElement homePhone;
    @FindBy(id="agree-terms")
    private WebElement agree;
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    private  WebElement clickBtn;


    public void signIn(){
        signUp.click();
        pleaseSelect.click();
        Select select = new Select(pleaseSelect);
        select.selectByIndex(2);
        firstName.sendKeys("Saku");
        lastName.sendKeys("Shi");
        gender.click();
        dob.sendKeys("10/10/1991");
        ssn.sendKeys("567-89-0987");
        emailAddress.sendKeys("life@gmail.com");
        password.sendKeys("124578N12ch");
        confirmPassword.sendKeys("124578N12ch");
        nextBtn.click();

        address.sendKeys("324 Mecca");
        locality.sendKeys("Madina");
        region.sendKeys("AF");
        postalCode.sendKeys("45673");
        country.sendKeys("China");
        homePhone.sendKeys("(700)552-5453");
        agree.click();
        clickBtn.click();
    }



}
