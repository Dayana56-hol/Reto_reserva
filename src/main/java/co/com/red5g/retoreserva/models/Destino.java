package co.com.red5g.retoreserva.models;

import co.com.red5g.retoreserva.models.builders.DestinoBuilder;

public class Destino {

    private String nombre;
    private String crucero;

    public Destino(final DestinoBuilder productosDesdeBuilder) {
        this.nombre = productosDesdeBuilder.getNombre();
        this.crucero = productosDesdeBuilder.getCrucero();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCrucero() {
        return crucero;
    }


}
