package co.edu.uniquindio.patrones_diseno.abstractfactory.model;

import co.edu.uniquindio.patrones_diseno.abstractfactory.services.IFabricaElectrodomesticos;
import co.edu.uniquindio.patrones_diseno.abstractfactory.services.ISensor;
import co.edu.uniquindio.patrones_diseno.abstractfactory.services.ISistemaControl;

public class FabricaElectrodomesticosInteligentes implements IFabricaElectrodomesticos {
    @Override
    public ISistemaControl crearSistemaControl() {
        return new SistemaControlInteligente();
    }

    @Override
    public ISensor crearSensor() {
        return new SensorInteligente();
    }
}