package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private WebDriver driver;

    //locators
    private By firstnamefield= By.id("customer.firstName");

    private By lastnamefield=By.id("customer.lastName");
    private By addressfield=By.id("customer.address.street");
    private By city=By.id("customer.address.city");
    private By state=By.id("customer.address.state");
    private By zipcode=By.id("customer.address.zipCode");
    private By phone=By.id("customer.phoneNumber");
    private By ssn=By.id("customer.ssn");
    private By usernamefield=By.id("customer.username");
    private By passwordfield=By.id("customer.password");
    private By confirmPassword=By.id("repeatedPassword");
    private By registerbutton=By.cssSelector("input[value='Register']");
    private By successMsg = By.xpath("//h1[contains(text(),'Welcome')]");

//constructor
public RegistrationPage(WebDriver driver){

    this.driver=driver;
    }

    public void fillRegistrationForm(String user,String pass)

    {
        driver.findElement(firstnamefield).sendKeys("Sai");
        driver.findElement(lastnamefield).sendKeys("Teja");
        driver.findElement(addressfield).sendKeys("123 Main Street");
        driver.findElement(city).sendKeys("Hyderabad");
        driver.findElement(state).sendKeys("Telangana");
        driver.findElement(zipcode).sendKeys("500001");
        driver.findElement(phone).sendKeys("1234567890");
        driver.findElement(ssn).sendKeys("987654321");
        driver.findElement(usernamefield).sendKeys(user);
        driver.findElement(passwordfield).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(pass);
    }
    public void clickRegister() {
    driver.findElement(registerbutton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMsg).getText();
    }


}
