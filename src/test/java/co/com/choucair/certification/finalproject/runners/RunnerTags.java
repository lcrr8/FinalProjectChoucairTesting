package co.com.choucair.certification.finalproject.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ={"src/test/resources/features/finalProject.feature"},
        tags = {"@Tag0"},
        glue = {"co.com.choucair.certification.finalproject.stepdefinitions", "co.com.choucair.certification.finalproject.util"},
        snippets = SnippetType.CAMELCASE)

public class RunnerTags
{
}
