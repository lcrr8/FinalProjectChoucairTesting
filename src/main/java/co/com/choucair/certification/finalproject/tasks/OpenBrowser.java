package co.com.choucair.certification.finalproject.tasks;

import co.com.choucair.certification.finalproject.userinterface.ChoucairWebSiteHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task
{
    private ChoucairWebSiteHomePage choucairWebSiteHomePage;

    public static OpenBrowser onTheHomePageOfThechoucairWebSite()
    {
        return Tasks.instrumented(OpenBrowser.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.browserOn(choucairWebSiteHomePage));
    }
}
