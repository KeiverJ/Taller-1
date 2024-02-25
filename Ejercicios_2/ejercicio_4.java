package Ejercicios_2;
import java.util.Scanner;

/*EJERCICIO 4:  Realiza un programa que lea una cadena por teclado
y compruebe si es una letra mayúscula.
 */


public class ejercicio_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una letra: ");
        String letra = teclado.nextLine();

        if (letra.length() == 1 && Character.isUpperCase(letra.charAt(0))) {
            System.out.println("La letra  '"+letra+ "' ingresada es una letra MAYUSCULA.");
        } else {
            System.out.println("La letra '"+letra+ "' ingresada es MINUSCULA.");
        }

        teclado.close();

    }
    
}
