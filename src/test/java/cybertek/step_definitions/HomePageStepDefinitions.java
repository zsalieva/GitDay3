package cybertek.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cybertek.utilities.ConfigurationReader;
import cybertek.utilities.Driver;

public class HomePageStepDefinitions {

    @Given("user on the login page")
    public void user_on_the_login_page() {
        System.out.println("i'm going to login page");
        System.out.println("email: "+ ConfigurationReader.getProperty("leader_email"));
        System.out.println("email: "+ ConfigurationReader.getProperty("leader_password"));

    }

    @When("user logs in as a team lead")
    public void user_logs_in_as_a_team_lead() {
        System.out.println("I'm in login page");
       // Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {
        System.out.println("I can see the home page");
    }
    @Then("the Title should be correct")
    public void the_Title_should_be_correct() {
        System.out.println("Checking Title ");
    }
    @When("user logs in as a team member")
    public void user_logs_in_as_a_team_member() {

        System.out.println("Login as a Team member");
    }
    @When("user logs in as a Teacher")
    public void user_logs_in_as_a_Teacher() {
        System.out.println("Login as a Teacher");
    }

}
