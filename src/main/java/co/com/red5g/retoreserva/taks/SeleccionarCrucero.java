package co.com.red5g.retoreserva.taks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.retoreserva.userinterfaces.ConsultaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.red5g.retoreserva.models.builders.DestinoBuilder.con;

public class SeleccionarCrucero implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ConsultaPage.SLC_CRUISES),
                SelectFromOptions.byVisibleText(con().destino().getCrucero()).from(ConsultaPage.SLC_CRUISES),
                JavaScriptClick.on(ConsultaPage.BTN_BUSCAR)


                );
    }
}
