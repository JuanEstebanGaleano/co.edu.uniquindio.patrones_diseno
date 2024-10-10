package co.edu.uniquindio.patrones_diseno.abstractfactory.model;

import co.edu.uniquindio.patrones_diseno.abstractfactory.services.ISensor;

public class SensorInteligente implements ISensor {
    @Override
    public void ensamblar() {
        System.out.println("Ensamblando sensor inteligente con conectividad.");
    }
}
