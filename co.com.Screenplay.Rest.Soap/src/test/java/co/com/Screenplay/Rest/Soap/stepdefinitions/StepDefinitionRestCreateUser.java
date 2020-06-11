package co.com.Screenplay.Rest.Soap.stepdefinitions;

import co.com.Screenplay.Rest.Soap.model.ModelCreateUserRest;
import co.com.Screenplay.Rest.Soap.questions.LastResponseStatusCode;
import co.com.Screenplay.Rest.Soap.tasks.CreateUserRest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import static co.com.Screenplay.Rest.Soap.utils.Constant.VALUE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionRestCreateUser {


    @When("^you create an user$")
    public void youCreateAnUser(List<ModelCreateUserRest> modelCreateUserRest) {
      theActorInTheSpotlight().attemptsTo(CreateUserRest.with(modelCreateUserRest));
    }


    @Then("^I should see the user created$")
    public void iShouldSeeTheUserCreated() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));
    }

}

