package co.com.ScreenPlay.Rest.Soap2.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.ScreenPlay.Rest.Soap2.util.enums.SoapService.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BeforeHooksSoap {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("brandon").whoCan(CallAnApi.at(BASE_URL.toString()));
    }
}
