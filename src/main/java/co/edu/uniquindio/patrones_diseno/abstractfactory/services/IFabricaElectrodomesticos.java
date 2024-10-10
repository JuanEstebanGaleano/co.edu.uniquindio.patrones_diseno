package co.edu.uniquindio.patrones_diseno.abstractfactory.services;

public interface IFabricaElectrodomesticos {
    ISistemaControl crearSistemaControl();
    ISensor crearSensor();
}