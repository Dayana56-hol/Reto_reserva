package co.com.red5g.retoreserva.taks;

import co.com.red5g.retoreserva.userinterfaces.ConsultaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static co.com.red5g.retoreserva.models.builders.DestinoBuilder.con;
import static co.com.red5g.retoreserva.userinterfaces.ConsultaPage.SLC_LISTA_CARTG;
import static co.com.red5g.retoreserva.userinterfaces.ConsultaPage.TXT_GOING_TO;


public class Consultar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(TXT_GOING_TO),
                Enter.theValue(con().destino().getNombre()).into(ConsultaPage.TXT_WHERE_YOU_GOING),
                Click.on(SLC_LISTA_CARTG),
                JavaScriptClick.on(ConsultaPage.BTN_BUSCAR)

        );

    }
}
