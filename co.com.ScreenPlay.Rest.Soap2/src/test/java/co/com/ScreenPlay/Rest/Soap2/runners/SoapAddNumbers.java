package co.com.ScreenPlay.Rest.Soap2.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/add_two_numbers.feature"},
        glue = {"co.com.ScreenPlay.Rest.Soap2.stepdefinitions","co.com.ScreenPlay.Rest.Soap2.util"},
        snippets = CAMELCASE
)

public class SoapAddNumbers {
}
