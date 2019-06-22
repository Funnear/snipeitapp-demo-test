package snipeitapp.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import snipeitapp.pageObjects.dashboardPage.BasicElements;

public class GetMesageText extends UIInteractionSteps {

    public String successAlert(){
        return $(BasicElements.SUCCESS_ALERT).getText().trim();
    }

}
