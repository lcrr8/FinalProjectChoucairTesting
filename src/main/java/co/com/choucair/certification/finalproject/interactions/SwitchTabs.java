package co.com.choucair.certification.finalproject.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Set;

public class SwitchTabs implements Interaction
{
    public static SwitchTabs toNextTab()
    {
        return new SwitchTabs();
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {

        Set<String> tabsWindow = Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles();
        for (String tab : tabsWindow)
        {
            Serenity.getWebdriverManager().getCurrentDriver().switchTo().window(tab);
        }
    }
}
