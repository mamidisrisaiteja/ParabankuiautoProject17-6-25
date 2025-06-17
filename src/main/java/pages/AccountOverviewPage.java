package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOverviewPage {

    private WebDriver driver;
    private By accountoverviewHeading= By.xpath("//h1[text()='Accounts Overview']");

    //constructor
    public  AccountOverviewPage(WebDriver driver){
        this.driver=driver;
    }

    public boolean isAccountOverviewDisplayed(){
        return driver.findElement(accountoverviewHeading).isDisplayed();
    }
}


