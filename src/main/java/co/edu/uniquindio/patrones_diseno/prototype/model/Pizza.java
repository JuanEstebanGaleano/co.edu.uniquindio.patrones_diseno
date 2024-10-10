package co.edu.uniquindio.patrones_diseno.prototype.model;

import co.edu.uniquindio.patrones_diseno.prototype.services.IProductoCongelado;

public class Pizza implements IProductoCongelado {
    private String sabor;
    private String tamaño;

    public Pizza(String sabor, String tamaño) {
        this.sabor = sabor;
        this.tamaño = tamaño;
    }

    @Override
    public Pizza clone() {
        // Clonar la pizza con las mismas propiedades
        return new Pizza(this.sabor, this.tamaño);
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Pizza de sabor " + sabor + " y tamaño " + tamaño;
    }
}
