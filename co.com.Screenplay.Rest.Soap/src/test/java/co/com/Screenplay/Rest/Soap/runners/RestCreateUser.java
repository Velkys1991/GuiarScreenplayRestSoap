package co.com.Screenplay.Rest.Soap.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/create_user.feature"},
        glue = {"co.com.Screenplay.Rest.Soap.stepdefinitions","co.com.Screenplay.Rest.Soap.utils"},
        snippets = SnippetType.CAMELCASE
)
public class RestCreateUser {
}
