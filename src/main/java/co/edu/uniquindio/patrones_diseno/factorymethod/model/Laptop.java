package co.edu.uniquindio.patrones_diseno.factorymethod.model;

import co.edu.uniquindio.patrones_diseno.factorymethod.services.IDispositivo;

public class Laptop implements IDispositivo {
    @Override
    public void ensamblar() {
        System.out.println("Ensamblando una laptop.");
    }
}

