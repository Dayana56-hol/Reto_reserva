package co.com.red5g.retoreserva.stepdefinitions;

import co.com.red5g.retoreserva.exceptions.ExceptionDeResultados;
import co.com.red5g.retoreserva.questions.factories.Resultados;
import co.com.red5g.retoreserva.taks.factories.Consulta;
import co.com.red5g.retoreserva.userinterfaces.ConsultaPage;
import co.com.red5g.retoreserva.utils.constants.MensajesExcepciones;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class ViajeOfertaStepdefinition {

    

    @Dado("que un cliente quiere ver las ofertas de viajes")
    public void queUnClienteQuiereVerLasOfertasDeViajes() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.travelocity.com/"));
    }


    @Cuando("ingresa a la opción de estas")
    public void ingresaALaOpciónDeEstas() {
        OnStage.theActorInTheSpotlight().attemptsTo(Consulta.ofertasDisponibles());

        
    }

    @Entonces("debe poder ver los viajes con descuento")
    public void debePoderVerLosViajesConDescuento() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Resultados.Consultas(ConsultaPage.LBL_RESULTADOS_CINCO),
                Matchers.equalTo("Book Discount Travel"))
                .orComplainWith(ExceptionDeResultados.class, MensajesExcepciones.LBL_ERROR_RESULTADOS_CUATRO));    }
}
