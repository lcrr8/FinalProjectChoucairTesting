package co.com.choucair.certification.finalproject.questions;

import co.com.choucair.certification.finalproject.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.choucair.certification.finalproject.userinterface.LocatorChoucairWebSite.*;
import static co.com.choucair.certification.finalproject.util.Constants.CERO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TheScreenResult implements Question<Boolean>
{
    private List<DataModel> data;

    public TheScreenResult(List<DataModel> data)
    {
        this.data = data;
    }

    public static TheScreenResult whenSendTheRegisterIs(List<DataModel> data)
    {
        return new TheScreenResult(data);
    }

    @Override
    public Boolean answeredBy(Actor actor)
    {
        actor.attemptsTo(
                Scroll.to(HELP_LOCATOR).andAlignToBottom());
        return Text.of(ERROR_OF_REGISTER).viewedBy(actor).asString().contains(data.get(CERO).getErrorOutput());
    }
}
