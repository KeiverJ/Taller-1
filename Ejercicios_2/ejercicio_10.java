package Ejercicios_2;
import java.util.Scanner;

/**
 * La asociación de vinicultores tiene como política fijar un precio inicial al
 * kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y
 * 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y
 * tamaño, se requiere determinar cuanto recibirá un productor por la uva que
 * entrega en un embarque considerando lo siguiente: Si es de tipo A, se le
 * cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
 * es de tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño
 * 1, y 50 céntimos cuando es de tamaño 2.
*/

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el kilo de la uva: ");
        float kilo = teclado.nextFloat();
        System.out.println("Digite el precio de la uva: ");
        float precio = teclado.nextFloat();
        System.out.println("Que tipo de uva es (A/B): ");
        String tipo = teclado.next();
        System.out.println("Que tipo de uva es (1/2): ");
        byte tamaño = teclado.nextByte();

        if (tipo.equalsIgnoreCase("A") && tamaño == 1) {
            System.out.println("El precio final es: " + ((kilo * precio) + (kilo * 0.20)));
        } else if (tipo.equalsIgnoreCase("A") && tamaño == 2) {
            System.out.println("El precio final es: " + ((kilo * precio) + (kilo * 0.30)));
        } else if (tipo.equalsIgnoreCase("B") && tamaño == 1) {
            System.out.println("El precio final es: " + ((kilo * precio) - (kilo * 0.30)));
        } else if (tipo.equalsIgnoreCase("B") && tamaño == 2) {
            System.out.println("El precio final es: " + ((kilo * precio) - (kilo * 0.50)));
        }
    }
}
