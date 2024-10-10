package co.edu.uniquindio.patrones_diseno.factorymethod.factory;

import co.edu.uniquindio.patrones_diseno.factorymethod.model.Laptop;
import co.edu.uniquindio.patrones_diseno.factorymethod.services.IDispositivo;

public class FabricaLaptop extends FabricaDispositivos {
    @Override
    public IDispositivo crearDispositivo() {
        return new Laptop();
    }
}