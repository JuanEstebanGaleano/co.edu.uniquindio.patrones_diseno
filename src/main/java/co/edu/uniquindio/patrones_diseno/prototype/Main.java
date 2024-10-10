package co.edu.uniquindio.patrones_diseno.prototype;
import co.edu.uniquindio.patrones_diseno.prototype.model.Pizza;
/*
CONTEXTO:
En una fábrica de comida congelada,
se producen pizzas, lasañas y otros productos
que necesitan ser ajustados y personalizados.
El proceso de creación de una receta o producto
desde cero requiere tiempo y recursos, ya que se
deben definir los ingredientes, los tiempos de cocción y
otros parámetros clave. Sin embargo, cuando el producto base está listo
(por ejemplo, una pizza Margarita), pueden surgir diferentes variaciones
del mismo producto, como agregar más ingredientes (Pepperoni) o cambiar el tamaño.
*/
public class Main {
    public static void main(String[] args) {
        // Crear un prototipo de pizza
        Pizza pizzaBase = new Pizza("Margarita", "Grande");

        // Clonar la pizza base para crear una variante
        Pizza pizzaVariada = pizzaBase.clone();
        pizzaVariada.setSabor("Pepperoni");

        // Mostrar el resultado
        System.out.println(pizzaBase);
        System.out.println(pizzaVariada);
    }
}
