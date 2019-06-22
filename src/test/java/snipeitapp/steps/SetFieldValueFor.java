package snipeitapp.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import snipeitapp.pageObjects.loginPage.LoginForm;

public class SetFieldValueFor extends UIInteractionSteps {

    @Step("I set username to {0}")
    public void username(String username) {
        $(LoginForm.USERNAME_FIELD).clear();
        $(LoginForm.USERNAME_FIELD).type(username);
    }

    @Step("I set password to {0}")
    public void password(String password) {
        $(LoginForm.PASSWORD_FIELD).clear();
        $(LoginForm.PASSWORD_FIELD).type(password);
    }
}
