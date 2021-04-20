package co.com.red5g.retoreserva.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Consultas implements Question <String> {

    private Target resultados;

    public Consultas(Target resultados) {
        this.resultados = resultados;
    }

    @Override
        public String answeredBy(Actor actor) {
            return resultados.resolveFor(actor).getText();
        }
    }

