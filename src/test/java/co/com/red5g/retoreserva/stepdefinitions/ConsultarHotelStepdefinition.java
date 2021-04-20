package co.com.red5g.retoreserva.stepdefinitions;

import co.com.red5g.retoreserva.exceptions.ExceptionDeResultados;
import co.com.red5g.retoreserva.questions.factories.Resultados;
import co.com.red5g.retoreserva.taks.factories.Consulta;
import co.com.red5g.retoreserva.userinterfaces.ConsultaPage;
import co.com.red5g.retoreserva.utils.constants.MensajesExcepciones;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class ConsultarHotelStepdefinition {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Robot");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));



    }

    @Dado("que un cliente necesita consultar los hoteles disponibles")
    public void queUnClienteNecesitaConsultarLosHotelesDisponibles() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.travelocity.com/"));

    }

    @Cuando("ingresa el destino y realiza la busqueda")
    public void ingresaElDestinoYRealizaLaBusqueda() {
        OnStage.theActorInTheSpotlight().attemptsTo(Consulta.unDestino());
    }


    @Entonces("debe ver los hoteles disponibles para el destino ingresado")
    public void debeVerLosHotelesDisponiblesParaElDestinoIngresado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Resultados.Consultas(ConsultaPage.LBL_RESULTADOS_UNO),
                Matchers.equalTo("What we are paid impacts our sort order"))
                        .orComplainWith(ExceptionDeResultados.class, MensajesExcepciones.LBL_ERROR_RESULTADOS_UNO));
    }

}
