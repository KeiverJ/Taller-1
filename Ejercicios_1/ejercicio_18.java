package Ejercicios_1;
import java.util.Scanner;

/**
Escribe un programa que pida el nombre y los dos apellidos
de una persona y después muestre las iniciales
*/

public class ejercicio_18 {
        public static void main(String[] args) {
        String iniciales;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Digite su primer apellido");
        String apellido1 = teclado.nextLine();
        System.out.println("Digite su segundo apellido");
        String apellido2 = teclado.nextLine();
        
        iniciales = nombre.substring(0,1)+apellido1.substring(0,1)+apellido2.substring(0,1);
        
        System.out.println("Sus iniciales son: "+iniciales);

        teclado.close();
    }
}
