package co.com.choucair.certification.finalproject.tasks;

import co.com.choucair.certification.finalproject.interactions.SwitchTabs;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Set;

import static co.com.choucair.certification.finalproject.userinterface.LocatorChoucairWebSite.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenTheLink implements Task
{
    public static OpenTheLink inThePrepareSection()
    {
        return Tasks.instrumented(OpenTheLink.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Hit.the(Keys.PAGE_UP).into(BLACK_BOX_TECHNIQUES_LINK),
                WaitUntil.the(BLACK_BOX_TECHNIQUES_LINK, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BLACK_BOX_TECHNIQUES_LINK),
                SwitchTabs.toNextTab()
                );

    }
}
