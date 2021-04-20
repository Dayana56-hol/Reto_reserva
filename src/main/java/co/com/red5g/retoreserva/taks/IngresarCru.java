package co.com.red5g.retoreserva.taks;

import co.com.red5g.retoreserva.interactions.CambiarPestana;
import co.com.red5g.retoreserva.userinterfaces.ConsultaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class IngresarCru implements Task {

    String url = "https://www.travelocity.com/Cruise-CabinCategory?adultCount=2&cabinType=inside&childCount=0&sailing-token=AQoCbXMSAmFyGICQx6KdLyADKgNtaWEyAnVzOgNtaWFCAnVz";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(ConsultaPage.BTN_CONTINUE_CRUCERO),
                CambiarPestana.in(url)
        );
    }
}
