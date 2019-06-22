package snipeitapp.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import snipeitapp.pageObjects.loginPage.LoginForm;

public class ClickTheButton extends UIInteractionSteps {

    @Step("I click button Login.")
    public void login() {
        $(LoginForm.LOGIN_BUTTON).click();
    }
}
