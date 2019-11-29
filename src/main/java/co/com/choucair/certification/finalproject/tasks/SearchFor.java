package co.com.choucair.certification.finalproject.tasks;

import co.com.choucair.certification.finalproject.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.finalproject.userinterface.LocatorChoucairWebSite.*;
import static co.com.choucair.certification.finalproject.util.Constants.CERO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchFor implements Task
{
    private List<DataModel> data;

    public SearchFor(List<DataModel> data)
    {
        this.data = data;
    }

    public static SearchFor aJobAndRegistersHis(List<DataModel> data)
    {
        return Tasks.instrumented(SearchFor.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Scroll.to(SEARCH_JOBS_BUTTON).andAlignToTop(),
                Enter.theValue(data.get(CERO).getKeyword()).into(SEARCH_KEYWORDS),
                Enter.theValue(data.get(CERO).getLocation()).into(SEARCH_LOCATION),
                Click.on(SEARCH_JOBS_BUTTON),
                WaitUntil.the(TESTER_ANALYST_OPTION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TESTER_ANALYST_OPTION),
                Hit.the(Keys.ARROW_DOWN).into(SIGN_UP_FOR_WORK),
                Click.on(SIGN_UP_FOR_WORK),
                Enter.theValue(data.get(CERO).getFullName()).into(FULLNAME_FIELD),
                Enter.theValue(data.get(CERO).getEmail()).into(EMAIL_FIELD),
                Enter.theValue(data.get(CERO).getPhone()).into(PHONE_FIELD),
                Enter.theValue(data.get(CERO).getStudies()).into(STUDIES_FIELD),
                Enter.theValue(data.get(CERO).getExperience()).into(EXPERIENCE_TIME_FIELD),
                Enter.theValue(data.get(CERO).getKnowAtumation()).into(KNOW_AUTOMATION_FIELD),
                Enter.theValue(data.get(CERO).getSalary()).into(SALARY_FIELD),
                SelectFromOptions.byVisibleText(data.get(CERO).getAvailableTime()).from(AVAILABLE_TIME_FIELD),
                Enter.theValue(data.get(CERO).getMessage()).into(ADDITIONAL_MESSAGE_FIELD),
                Scroll.to(SELECT_FILE).andAlignToBottom(),
                Scroll.to(SEND_BUTTON).andAlignToBottom(),
                Click.on(SEND_BUTTON)
                );
    }

}
