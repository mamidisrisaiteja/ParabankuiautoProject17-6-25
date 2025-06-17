package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   private  WebDriver driver;

   //Locators
    private By usernamefield=By.name("username");
    private By passwordfield=By.name("password");
    private By loginButton = By.cssSelector("input.button");



    //constructor
    public LoginPage(WebDriver driver){

        this.driver=driver;
    }

    public void enterUsername(String user){
        driver.findElement(usernamefield).sendKeys(user);
        //this username comes from stepdef file
    }

    public void enterPassword(String pass){

        driver.findElement(passwordfield).sendKeys(pass);
    }

    // Click login button
    public void clickLogin() {

        driver.findElement(loginButton).click();
    }

    // Check if error message is displayed
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }


    public boolean isLoginFormPresent() {
        return driver.findElement(usernamefield).isDisplayed();
    }
}
