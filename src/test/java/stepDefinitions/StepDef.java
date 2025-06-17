package stepDefinitions;


import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.RegistrationPage;

import static org.testng.Assert.assertTrue;

public class StepDef extends BaseClass {

    WebDriver driver;
    LoginPage loginpage;
    RegistrationPage regPage;

    @Before
    public void setUp() {
        setupDriver();
        driver = BaseClass.driver;
    }

    @After
    public void tearDown() {
        quitDriver();
    }


    @Given("user navigates to the login page")
    public void user_navigates_to_the_login_page() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        loginpage= new LoginPage(driver);
    }
    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String user, String pass) {
         loginpage.enterUsername(user);
        loginpage.enterPassword(pass);

        //the username comes from featurefile and then it goes to loginpage

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginpage.clickLogin();
    }
    @Then("user should be navigated to the home page")
    public void user_should_be_navigated_to_the_home_page() {
        String title = driver.getTitle();
        assert title.contains("ParaBank");
    }

  //  The @Before annotation in Cucumber (along with JUnit or TestNG) is used to
    //  define a setup method
 //   that will be executed automatically before each scenario runs.

    //Registration page

    @Given("user navigates to the registration page")
    public void user_navigates_to_the_registration_page() {
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        regPage = new RegistrationPage(driver);

    }


    @When("user enters registration details with username {string} and password {string}")
    public void user_enters_registration_details_with_username_and_password(String username, String password) {
        regPage.fillRegistrationForm(username, password);
    }


    @And("user clicks on the register button")
    public void user_clicks_on_the_register_button() {
            regPage.clickRegister();
    }

    @Then("user should be redirected to the login page")
    public void userShouldBeRedirectedToTheLoginPage() {
        loginpage = new LoginPage(driver);
        assertTrue(loginpage.isLoginFormPresent());
        System.out.println("hi");

        //go to loginpage check the code
        //if you see the page after clicking register button  usename is displayed
        //after welcome like welcome jasmitha
    }
}