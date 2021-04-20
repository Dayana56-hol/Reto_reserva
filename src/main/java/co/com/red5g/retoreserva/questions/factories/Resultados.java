package co.com.red5g.retoreserva.questions.factories;

import co.com.red5g.retoreserva.questions.Consultas;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Resultados {

    public Resultados(){
    }

    public static Question<String> Consultas(Target resultados){

        return new Consultas(resultados);
    }
}
