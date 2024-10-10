package co.edu.uniquindio.patrones_diseno.abstractfactory;

import co.edu.uniquindio.patrones_diseno.abstractfactory.model.FabricaElectrodomesticosEstandar;
import co.edu.uniquindio.patrones_diseno.abstractfactory.model.FabricaElectrodomesticosInteligentes;
import co.edu.uniquindio.patrones_diseno.abstractfactory.services.IFabricaElectrodomesticos;
import co.edu.uniquindio.patrones_diseno.abstractfactory.services.ISensor;
import co.edu.uniquindio.patrones_diseno.abstractfactory.services.ISistemaControl;
/*
En la producción de electrodomésticos como lavadoras, refrigeradores y hornos, hay versiones estándar
(sin conectividad) y versiones inteligentes (con conectividad IoT). Aunque ambos tipos de
electrodomésticos comparten componentes generales como motores, sistemas de control y sensores,
las versiones inteligentes requieren componentes más avanzados, como sistemas de control conectados
a internet y sensores inteligentes.
*/
public class Main {
    public static void main(String[] args) {
    // Crear fábrica de electrodomésticos estándar
    IFabricaElectrodomesticos fabricaEstandar = new FabricaElectrodomesticosEstandar();
    ISistemaControl sistemaEstandar = fabricaEstandar.crearSistemaControl();
    ISensor sensorEstandar = fabricaEstandar.crearSensor();
    sistemaEstandar.ensamblar();
    sensorEstandar.ensamblar();

    // Crear fábrica de electrodomésticos inteligentes
    IFabricaElectrodomesticos fabricaInteligente = new FabricaElectrodomesticosInteligentes();
    ISistemaControl sistemaInteligente = fabricaInteligente.crearSistemaControl();
    ISensor sensorInteligente = fabricaInteligente.crearSensor();
    sistemaInteligente.ensamblar();
    sensorInteligente.ensamblar();
    }
}