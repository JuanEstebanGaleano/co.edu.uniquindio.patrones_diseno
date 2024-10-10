package co.edu.uniquindio.patrones_diseno.factorymethod;
import co.edu.uniquindio.patrones_diseno.factorymethod.factory.FabricaDispositivos;
import co.edu.uniquindio.patrones_diseno.factorymethod.factory.FabricaLaptop;
import co.edu.uniquindio.patrones_diseno.factorymethod.factory.FabricaTelefono;
/*
CONTEXTO:
Una empresa que fabrica dispositivos electrónicos, como teléfonos inteligentes, laptops y tablets,
necesita un metodo flexible para crear diferentes tipos de productos según la demanda del mercado.
La producción de estos dispositivos comparte algunos pasos generales
(como la instalación de software o ensamblaje de hardware), pero cada tipo de dispositivo tiene diferencias
clave en su proceso de producción.
 */
public class Main {
    public static void main(String[] args) {
    // Crear fábrica de teléfonos y producir uno
    FabricaDispositivos fabricaTelefono = new FabricaTelefono();
    fabricaTelefono.producirDispositivo();

    // Crear fábrica de laptops y producir una
    FabricaDispositivos fabricaLaptop = new FabricaLaptop();
    fabricaLaptop.producirDispositivo();
}
}