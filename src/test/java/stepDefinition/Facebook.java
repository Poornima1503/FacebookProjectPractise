package stepDefinition;

import FacebookPages.CreatePage;
import FacebookPages.ForgotAccountPage;
import FacebookPages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigFileReader;

import static stepDefinition.CucumberHooks.driver;

public class Facebook {

    @Given("^I am a facebook user$")
    public void i_am_a_facebook_user()  {

    }

    @When("^I access Facebook URL$")
    public void i_access_Facebook_URL() throws Exception {
        ConfigFileReader cfr = new ConfigFileReader();
        driver.get(cfr.getApplicationURL());

    }

    @When("^I click on 'forgot account link'$")
    public void i_click_on_forgot_account_link() {
        PageFactory.initElements(driver, HomePage.class);
       // HomePage hm = new HomePage();
      //  hm.ForgotAccountLink();
        HomePage.ForgotAccountLink();
    }

    @Then("^I see 'forgot account' page$")
    public void i_see_forgot_account_page()  {
        PageFactory.initElements(driver, ForgotAccountPage.class);
        ForgotAccountPage.findYourAccount();
    }

    @When("^I click on the link 'create page'$")
    public void i_click_on_the_link_create_page(){
        PageFactory.initElements(driver, HomePage.class);
        HomePage.CreatePageLink();
    }

    @Then("^I am taken to a page to create new page$")
    public void i_am_taken_to_a_page_to_create_new_page()  {
        PageFactory.initElements(driver, CreatePage.class);
        CreatePage.CreateAPage();
    }

}
