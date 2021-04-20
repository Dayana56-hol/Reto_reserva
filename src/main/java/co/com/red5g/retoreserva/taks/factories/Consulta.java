package co.com.red5g.retoreserva.taks.factories;

import co.com.red5g.retoreserva.taks.*;
import net.serenitybdd.screenplay.Tasks;

public class Consulta {

    public static Consultar unDestino() {
        return Tasks.instrumented(Consultar.class);
    }

    public static OfertaViajes ofertasDisponibles() {
        return Tasks.instrumented(OfertaViajes.class);
    }

    public static AlquilarAta rentaVacation(){ return Tasks.instrumented(AlquilarAta.class);}

    public static BusquedaAp opcionApar(){ return Tasks.instrumented(BusquedaAp.class);}

    public static IngresarCosasH cosasPorHacer(){ return Tasks.instrumented(IngresarCosasH.class);}

    public static BusquedaCosasH lugarDeDestino(){ return Tasks.instrumented(BusquedaCosasH.class);}

    public static BusquedaCru opcionCrucero(){ return Tasks.instrumented(BusquedaCru.class);}

    public static SeleccionarCrucero crucero(){ return Tasks.instrumented(SeleccionarCrucero.class);}

    public static IngresarCru cruceroSeleccion(){ return Tasks.instrumented(IngresarCru.class);}



}

