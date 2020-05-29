package snipeitapp.status;

import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static starter.WebServiceEndPoints.RATE_LIMIT;

public class ApplicationStatus {

    public AppStatus currentStatus() {
        int statusCode = RestAssured.get(RATE_LIMIT.getUrl()).statusCode();
        return (statusCode == 200) ? AppStatus.RUNNING : AppStatus.DOWN;
    }

    @Step("Get current status message")
    public void readStatusMessage() {
        SerenityRest.get(RATE_LIMIT.getUrl());
    }
}
