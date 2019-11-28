package co.com.choucair.certification.finalproject.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocatorChoucairWebSite extends PageObject
{
    public static final Target COOKIES_ACEPT = Target.the("Accept the cookies")
            .located(By.id("cookie_action_close_header"));
    public static final Target JOB_SECTION = Target.the("Here you can select the jobs section")
            .located(By.id("menu-item-550"));
    public static final Target BE_CHOUCAIR_SECTION = Target.the("Section of what it is to be choucair")
            .locatedBy("//a[contains(text(),'¿Qué es ser Choucair?')]");
    public static final Target ANNOUNCEMENT_SECTION = Target.the("Section of jobs announcements")
            .locatedBy("//a[contains(text(),'Convocatorias')]");
    public static final Target AVAILABLE_JOBS_SECTION = Target.the(" Section of available jobs")
            .locatedBy("//li//a[@href=\"https://www.choucairtesting.com/job/analista-de-pruebas-medellin/\"]");
    public static final Target PREPARE_TO_APPLY_SECTION = Target.the("Here you can prepare to apply a job")
            .locatedBy("//li[@class='post-7550 job_listing type-job_listing status-publish has-post-thumbnail hentry']//a");
    public static final Target ABOUT_TESTING_LINKS = Target.the("Here you find links about software and testing")
            .locatedBy("//a[contains(text(),'Técnicas de caja negra')]");
    public static final Target BLACK_BOX_TECHNIQUES_LINK = Target.the("Here you can select the black box techniques link")
            .locatedBy("//ul//a[@href=\"https://www.youtube.com/watch?v=Uo2xvx7zhwo\"]");
    public static final Target NAME_OF_VIDEO = Target.the("Check the name of the video")
            .locatedBy("//yt-formatted-string[contains(text(),'Foundation Level - ISTQB - Clases de Equivalencia')]");

    public static final Target SEARCH_KEYWORDS = Target.the("Search keywords textbox")
            .located(By.id("search_keywords"));
    public static final Target SEARCH_LOCATION = Target.the("Search location textbox")
            .located(By.id("search_location"));
    public static final Target SEARCH_JOBS_BUTTON = Target.the("Search the search jobs button")
            .locatedBy("//div[contains(@class,'search_submit')]//input");
    public static final Target TESTER_ANALYST_OPTION = Target.the("Tester analyst role")
            .locatedBy("//li//a[@href=\"https://www.choucairtesting.com/job/analista-de-pruebas-medellin/\"]");
    public static final Target SIGN_UP_FOR_WORK = Target.the("Sign up for work button")
            .locatedBy(".//input[contains(@class,'application_button button')]");
    public static final Target FULLNAME_FIELD = Target.the("Here you put your full name")
            .located(By.xpath("//input[@name='your-name']"));
    public static final Target EMAIL_FIELD = Target.the("Here put your address email")
            .located(By.xpath("//input[@name='your-email']"));
    public static final Target PHONE_FIELD = Target.the("Here put your phone number")
            .located(By.xpath("//input[@name='tel']"));
    public static final Target STUDIES_FIELD = Target.the("Here put your studies")
            .located(By.xpath("//textarea[@name='estudios']"));
    public static final Target EXPERIENCE_TIME_FIELD = Target.the("Here put your time of experience ")
            .located(By.xpath("//textarea[@name='exp']"));
    public static final Target KNOW_AUTOMATION_FIELD = Target.the("Here write if you know about automation")
            .located(By.xpath("//textarea[@name='auto']"));
    public static final Target SALARY_FIELD = Target.the("Here write how much money you want")
            .located(By.xpath("//input[@name='salario']"));
    public static final Target AVAILABLE_TIME_FIELD = Target.the("Here write what available time you have")
            .located(By.xpath("//select[@name='curso']"));
    public static final Target ADDITIONAL_MESSAGE_FIELD = Target.the("Here write an additional message")
            .located(By.xpath("//textarea[@name='your-message']"));

    public static final Target SELECT_FILE = Target.the("Here you can upload a file")
            .located(By.xpath("//label[contains(text(),'*CV (Límite del archivo 8 megas)')]"));
    public static final Target CAPTCHA_FIELD = Target.the("Here you can confirm the captcha option")
            .located(By.xpath("//div[@id='anr_captcha_field_1']"));
    public static final Target SEND_BUTTON = Target.the("Here you can confirm the register")
        .locatedBy("//input[contains(@value,'Enviar')]");
    public static final Target HELP_LOCATOR = Target.the("Help locator")
            .locatedBy("//a[contains(text(),'Analista de Pruebas Bogotá')]");
    public static final Target ERROR_OF_REGISTER = Target.the("Here you can confirm something is wrong with the register")
            .locatedBy("//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors']");


}
