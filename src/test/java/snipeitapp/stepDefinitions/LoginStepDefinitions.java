package snipeitapp.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import snipeitapp.steps.*;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    SetFieldValueFor setFieldValueFor;

    @Steps
    ClickTheButton clickTheButton;

    @Steps
    SmokeCheckThePage smokeCheckThePage;

    @Steps
    GetMesageText getMesageText;

    @Given("I am on the Snipe It App Demo Login page")
    public void i_am_on_the_Snipe_It_App_Demo_Login_page() {
        navigateTo.theSnipeItAppDemoLoginPage();
    }

    @When("I set the username to {string}")
    public void i_set_the_username(String username) {
        setFieldValueFor.username(username);
    }


    @And("I set the password to {string}")
    public void i_set_the_password(String password) {
        setFieldValueFor.password(password);
    }

    @And("I click button Login")
    public void i_click_button_Login() {
        clickTheButton.login();
    }

    @Then("Dashboard page is open")
    public void dashboard_page_is_open() {

        assertThat(smokeCheckThePage.dashboard()).containsOnly(true);

    }

    @Then("{string} message is displayed")
    public void message_is_displayed(String message) {
        assertThat(getMesageText.successAlert()).containsIgnoringCase( message.trim() );
    }
}
