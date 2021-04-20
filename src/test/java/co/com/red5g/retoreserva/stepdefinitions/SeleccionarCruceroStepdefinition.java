package co.com.red5g.retoreserva.stepdefinitions;

import co.com.red5g.retoreserva.exceptions.ExceptionDeResultados;
import co.com.red5g.retoreserva.questions.factories.Resultados;
import co.com.red5g.retoreserva.taks.factories.Consulta;
import co.com.red5g.retoreserva.userinterfaces.ConsultaPage;
import co.com.red5g.retoreserva.utils.constants.MensajesExcepciones;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;


public class SeleccionarCruceroStepdefinition {


    @Dado("que un cliente necesita consultar los cruceros")
    public void queUnClienteNecesitaConsultarLosCruceros() {
        OnStage.theActorInTheSpotlight().attemptsTo(Consulta.opcionCrucero());
    }

    @Cuando("ingresa el lugar de destino del crucero y realiza la busqueda")
    public void ingresaElLugarDeDestinoDelCruceroYRealizaLaBusqueda() {
        OnStage.theActorInTheSpotlight().attemptsTo(Consulta.crucero());

    }

    @Entonces("debe ver los resultados de los cruceros")
    public void debeVerLosResultadosDeLosCruceros() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Resultados.Consultas(ConsultaPage.LBL_RESULTADOS_CUATRO),
                Matchers.equalTo("Book with confidence:"))
                .orComplainWith(ExceptionDeResultados.class, MensajesExcepciones.LBL_ERROR_RESULTADOS_TRES));

    }

    @Y("poder ingresar a una de las opciones")
    public void poderIngresarAUnaDeLasOpciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(Consulta.cruceroSeleccion());
    }
}
