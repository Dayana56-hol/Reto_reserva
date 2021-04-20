package co.com.red5g.retoreserva.taks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.retoreserva.interactions.CambiarPestana;
import co.com.red5g.retoreserva.userinterfaces.ConsultaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static co.com.red5g.retoreserva.models.builders.DestinoBuilder.con;

public class BusquedaAp implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(con().destino().getNombre()).into(ConsultaPage.TXT_DESTINACION_VACATION),
                JavaScriptClick.on(ConsultaPage.TXT_DESTINACION_VACATION),
                JavaScriptClick.on(ConsultaPage.BTN_DESTINATION)
                );
    }
}
