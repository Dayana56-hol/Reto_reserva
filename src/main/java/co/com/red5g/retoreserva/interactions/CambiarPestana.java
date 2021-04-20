package co.com.red5g.retoreserva.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class CambiarPestana implements Interaction {

    private String title;

    public CambiarPestana(String title) {
        this.title = title;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Set<String> ListPage = BrowseTheWeb.as(actor).getDriver().getWindowHandles();

        for (String page:ListPage){
            driver.switchTo().window(page);
            if (driver.getTitle().contains(title))
                break;
        }

    }

    public static CambiarPestana in(String title) { return Tasks.instrumented(CambiarPestana.class, title);
    }
}
