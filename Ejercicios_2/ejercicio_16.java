package Ejercicios_2;
import java.util.Scanner;

/**
Una compañía de transporte internacional tiene servicio en algunos países de
América del Norte, América Central, América del Sur, Europa y Asia. El costo por
servicio de transporte se basa en el peso del paquete y la zona a la que va
dirigida. Parte de su política implica que los paquetes con un peso superior a
5kg no son transportados, por cuestiones de logística y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega de un paquete o,
en su caso, el rechazo de la entrega.
*/

public class ejercicio_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte ubicacion = 0;
        System.out.println("Digite el peso del paquete (Kg):");
        float paquete = teclado.nextFloat();
        System.out.println("Digite la zona: " + "\n" + "1: America del Norte" + "\n" + "2. America Central" + "\n" + "3. America del Sur" + "\n" + "4. Europa" + "\n" + "5. Asia");
        ubicacion = teclado.nextByte();

        if ( paquete >= 5){
            System.out.println("El paquete no puede ser transportado.");
        }
        else if (paquete < 0 ) {
            System.out.println("Peso digitado incorrectamente");
        }
        else {
            switch  (ubicacion) {
                case 1: 
                System.out.println("El precio del paquete es: " + ( paquete * 24) + " Euros");
                break;
            
                case 2:
                System.out.println("El precio del paquete es: " + ( paquete * 20) + " Euros");
                break;
            
                case 3:
                System.out.println("El precio del paquete es: " + ( paquete * 21) + " Euros");
                break;
            
                case 4:
                System.out.println("El precio del paquete es: " + ( paquete * 10) + " Euros");
                break;
            
                case 5:
                System.out.println("El precio del paquete es: " + ( paquete * 18) + " Euros");
                break;
            
                default:
                System.out.println("La zona digitada no existe");
                break;
            }
        }

        teclado.close();

    }
}
