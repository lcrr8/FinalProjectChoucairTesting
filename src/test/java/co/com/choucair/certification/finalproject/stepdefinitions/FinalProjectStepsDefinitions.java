package co.com.choucair.certification.finalproject.stepdefinitions;

import co.com.choucair.certification.finalproject.models.DataModel;
import co.com.choucair.certification.finalproject.questions.TheScreenResult;
import co.com.choucair.certification.finalproject.questions.Verifies;
import co.com.choucair.certification.finalproject.tasks.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FinalProjectStepsDefinitions
{
    @Given("^That (.*) wants to evaluate the quality on the jobs section of the Choucair website$")
    public void thatUserWantsToEvaluateTheQualityOnTheJobsSectionOfTheChoucairWebsite(String actor)
    {
        theActorCalled(actor).wasAbleTo(OpenBrowser.onTheHomePageOfThechoucairWebSite());
    }


    @When("^The user enters and interacts with the existing sections on the page, and opens the Black box Techniques link\\.$")
    public void theUserEntersAndInteractsWithTheExistingSectionsOnThePageAndOpensTheBlackBoxTechniquesLink()
    {
        theActorInTheSpotlight().attemptsTo(
                Go.theJobsSection(),
                Interact.withSeveralSectionsOfThePage(),
                OpenTheLink.inThePrepareSection());
    }

    @Then("^The User verifies the link contains the text right\\.$")
    public void theUserVerifiesTheLinkContainsTheTextRight(List<DataModel>data)
    {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verifies.theNameOfTheVideoIs(data)));
    }


    @Given("^That (.*) wants to search a job and register the data on the jobs section of the Choucair website$")
    public void thatUserWantsToSearchAJobAndRegisterTheDataOnTheJobsSectionOfTheChoucairWebsite(String actor)
    {
        theActorCalled(actor).wasAbleTo(OpenBrowser.onTheHomePageOfThechoucairWebSite());
    }

    @When("^The User searches a job but not registers all his data in the required fields$")
    public void theUserSearchesAJobButNotRegistersAllHisDataInTheRequiredFields(List<DataModel>data)
    {
        theActorInTheSpotlight().attemptsTo(
                Go.theJobsSection(),
                SearchFor.aJobAndRegistersHis(data));
    }

    @Then("^The User sends the register but it is not successfully$")
    public void theUserSendsTheRegisterButItIsNotSuccessfully(List<DataModel>data)
    {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheScreenResult.whenSendTheRegisterIs(data)));
    }
}
