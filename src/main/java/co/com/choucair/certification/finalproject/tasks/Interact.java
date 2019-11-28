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
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
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
                WaitUntil.the(ANNOUNCEMENT_SECTION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ANNOUNCEMENT_SECTION),
                Scroll.to(SEARCH_KEYWORDS).andAlignToBottom(),
                Scroll.to(AVAILABLE_JOBS_SECTION).andAlignToBottom(),
                Scroll.to(PREPARE_TO_APPLY_SECTION).andAlignToTop(),
                WaitUntil.the(PREPARE_TO_APPLY_SECTION, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(ABOUT_TESTING_LINKS).andAlignToBottom(),
                Scroll.to(ABOUT_TESTING_LINKS).andAlignToTop()
                );

    }
}
