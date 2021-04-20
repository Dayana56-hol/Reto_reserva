package co.com.red5g.retoreserva.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/seleccionar_crucero.feature",
        glue="co.com.red5g.retoreserva.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class SeleccionarCrucero {
}
