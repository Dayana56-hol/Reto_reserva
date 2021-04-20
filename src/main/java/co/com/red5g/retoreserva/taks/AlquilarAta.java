package co.com.red5g.retoreserva.taks;

import co.com.red5g.retoreserva.userinterfaces.ConsultaPage;
import co.com.red5g.retoreserva.userinterfaces.MasViajesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class AlquilarAta implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(MasViajesPage.BTN_MORE_TRAVEL),
                JavaScriptClick.on(MasViajesPage.BTN_VACATION_RENTALS)

        );
    }
}
