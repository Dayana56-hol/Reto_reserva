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
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;


public class CosasHacerStepdefinition {


    @Dado("que un cliente necesita consultar cosas por hacer en los lugares de destino")
    public void queUnClienteNecesitaConsultarCosasPorHacerEnLosLugaresDeDestino() {
        OnStage.theActorInTheSpotlight().attemptsTo(Consulta.cosasPorHacer());



    }

    @Cuando("ingresa el lugar de destino y realiza la busqueda")
    public void ingresaElLugarDeDestinoYRealizaLaBusqueda() {
        OnStage.theActorInTheSpotlight().attemptsTo(Consulta.lugarDeDestino());


    }

    @Entonces("debe ver los resultados de las cosas por hacer")
    public void debeVerLosResultadosDeLasCosasPorHacer() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Resultados.Consultas(ConsultaPage.LBL_RESULTADOS_DOS),
                Matchers.equalTo("Top 10 things to do"))
                .orComplainWith(ExceptionDeResultados.class, MensajesExcepciones.LBL_ERROR_RESULTADOS_DOS));

    }
}
