package co.edu.uniquindio.patrones_diseno.factorymethod.factory;

import co.edu.uniquindio.patrones_diseno.factorymethod.model.Telefono;
import co.edu.uniquindio.patrones_diseno.factorymethod.services.IDispositivo;

public class FabricaTelefono extends FabricaDispositivos {
    @Override
    public IDispositivo crearDispositivo() {
        return new Telefono();
    }
}