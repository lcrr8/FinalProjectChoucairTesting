package co.com.choucair.certification.finalproject.questions;

import co.com.choucair.certification.finalproject.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.choucair.certification.finalproject.userinterface.LocatorChoucairWebSite.NAME_OF_VIDEO;
import static co.com.choucair.certification.finalproject.util.Constants.CERO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Verifies implements Question<Boolean>
{
    private List<DataModel> data;

    public Verifies(List<DataModel> data)
    {
        this.data = data;
    }

    public static Verifies theNameOfTheVideoIs(List<DataModel> data)
    {
        return new Verifies(data);
    }

    @Override
    public Boolean answeredBy(Actor actor)
    {
        actor.attemptsTo(WaitUntil.the(NAME_OF_VIDEO, isVisible()).forNoMoreThan(10).seconds());
        return data.get(CERO).getOut().equals(Text.of(NAME_OF_VIDEO).viewedBy(actor).asString());
    }
}
