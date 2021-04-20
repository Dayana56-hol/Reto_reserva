package co.com.red5g.retoreserva.taks;

import co.com.red5g.retoreserva.userinterfaces.ConsultaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class IngresarCosasH implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(ConsultaPage.BTN_THING)

        );
    }
}
