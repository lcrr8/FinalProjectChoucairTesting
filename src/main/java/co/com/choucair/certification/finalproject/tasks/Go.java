package co.com.choucair.certification.finalproject.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.finalproject.userinterface.LocatorChoucairWebSite.*;

public class Go implements Task
{
    public static Go theJobsSection()
    {
        return Tasks.instrumented(Go.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(COOKIES_ACEPT),
                Click.on(JOB_SECTION));
    }
}
