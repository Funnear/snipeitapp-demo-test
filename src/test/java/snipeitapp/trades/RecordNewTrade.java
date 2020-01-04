package snipeitapp.trades;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.WebServiceEndPoints;

public class RecordNewTrade {

    @Step("Record a new trade")
    public void withDetails(String trade) {
        System.out.println(trade);
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .body(trade)
                .when()
                .post(WebServiceEndPoints.REGISTRATION.getUrl());
    }
}
