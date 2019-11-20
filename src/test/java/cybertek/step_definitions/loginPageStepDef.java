package cybertek.step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginPageStepDef {
    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String email, String password) {
        System.out.println("email  "+email);
        System.out.println("password  "+password);

    }

    @Then("Homepage should be displayed")
    public void homepage_should_be_displayed() {
        System.out.println("Home page displayed");
    }

    @Then("title should be {string}")
    public void title_should_be(String title) {
        System.out.println("Title "+ title);

    }

    @Then("there should be {int} menu options")
    public void there_should_be_menu_options(Integer count) {
        System.out.println("Count = "+count );
    }


}
