package co.edu.uniquindio.patrones_diseno.abstractfactory.model;

import co.edu.uniquindio.patrones_diseno.abstractfactory.services.ISistemaControl;

public class SistemaControlEstandar implements ISistemaControl {
    @Override
    public void ensamblar() {
        System.out.println("Ensamblando sistema de control estándar.");
    }
}