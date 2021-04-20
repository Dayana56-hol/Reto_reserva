package co.com.red5g.retoreserva.models.builders;

import co.com.red5g.retoreserva.models.Destino;
import javafx.util.Builder;

public class DestinoBuilder implements Builder<Destino> {

    private String nombre;
    private String crucero;

    public DestinoBuilder() {
        this.nombre = "";
        this.crucero = "";
    }

    @Override
    public Destino build() {
        return new Destino(this); }

    public static DestinoBuilder con(){
        return new DestinoBuilder();
    }


    public DestinoBuilder conNombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public DestinoBuilder conCrucero(String crucero){
        this.crucero = crucero;
        return this;
    }


    public Destino destino(){
        conNombre("Cartagena");
        conCrucero("Bahamas");
        return build();
    }



    public String getNombre() {
        return nombre;
    }
    public String getCrucero() {
        return crucero;
    }



}
