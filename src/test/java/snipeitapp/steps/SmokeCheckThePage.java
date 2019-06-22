package snipeitapp.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import snipeitapp.pageObjects.dashboardPage.BasicElements;

import java.util.ArrayList;


public class SmokeCheckThePage extends UIInteractionSteps {

    public ArrayList<Boolean> dashboard() {
        //TODO: implement the smoke check for all main elements of the Dashboard page

        ArrayList<Boolean> checklist =  new ArrayList<Boolean>();

        String pageHeader = $(BasicElements.PAGE_HEADER).getTextContent().trim();
        Boolean headerCheck = pageHeader.equalsIgnoreCase("Dashboard");
        checklist.add(headerCheck);

        return(checklist);
    }

}
