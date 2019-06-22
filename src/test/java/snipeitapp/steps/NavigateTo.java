package snipeitapp.steps;

import net.thucydides.core.annotations.Step;
import snipeitapp.pageObjects.loginPage.SnipeItAppDemoLoginPage;

public class NavigateTo {

    SnipeItAppDemoLoginPage snipeItAppDemoLoginPage;

    @Step("Open the Snipe It App Demo LoginStepDefinitions page")
    public void theSnipeItAppDemoLoginPage() {
        snipeItAppDemoLoginPage.open();
    }
}