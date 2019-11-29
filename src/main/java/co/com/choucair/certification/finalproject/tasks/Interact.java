package co.com.choucair.certification.finalproject.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static co.com.choucair.certification.finalproject.userinterface.LocatorChoucairWebSite.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Interact implements Task
{
    public static Interact withSeveralSectionsOfThePage()
    {
        return Tasks.instrumented(Interact.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Hit.the(Keys.PAGE_DOWN).into(BE_CHOUCAIR_SECTION),
                Hit.the(Keys.PAGE_UP).into(ANNOUNCEMENT_SECTION),
                Click.on(ANNOUNCEMENT_SECTION),
                Scroll.to(SEARCH_JOBS_BUTTON).andAlignToBottom(),
                Click.on(SEARCH_LOCATION),
                Scroll.to(TESTER_ANALYST_OPTION).andAlignToBottom(),
                Scroll.to(ABOUT_TESTING_LINKS).andAlignToTop()
                );

    }
}
