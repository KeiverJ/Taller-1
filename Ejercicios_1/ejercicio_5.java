package Ejercicios_1;
import java.util.Scanner;
/**Realizar un programa que reciba una temperatura Fahrenheit
y la convierta a grados Celsius
 */
public class ejercicio_5 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Ingrese la temperatura en Fahrenhheit: ");
        double fah = teclado.nextDouble();
        double cel = (fah-32) /1.8;
        System.out.println ("La conversion a celsiuls es: "+cel);
    }
}
