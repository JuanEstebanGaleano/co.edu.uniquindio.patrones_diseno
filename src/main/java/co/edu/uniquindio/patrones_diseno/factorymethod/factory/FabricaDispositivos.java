package co.edu.uniquindio.patrones_diseno.factorymethod.factory;

import co.edu.uniquindio.patrones_diseno.factorymethod.services.IDispositivo;

public abstract class FabricaDispositivos {
    public abstract IDispositivo crearDispositivo();

    public void producirDispositivo() {
        IDispositivo dispositivo = crearDispositivo();
        dispositivo.ensamblar();
    }
}