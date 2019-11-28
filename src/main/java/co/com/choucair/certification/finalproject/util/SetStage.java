package co.com.choucair.certification.finalproject.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SetStage
{
    @Before
    public void configurationInitial()
    {
        OnStage.setTheStage(new OnlineCast());
    }
}
