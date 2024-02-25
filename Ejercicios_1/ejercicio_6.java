package Ejercicios_1;
import java.util.Scanner;
/**Escribe un programa que calcule la media de tres números
introducidos por teclado. */
public class ejercicio_6 {
    public static void main (String args []) {
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Ingrese el numero 1: ");
        int num1 = teclado.nextInt ();
        System.out.println ("Ingrese el numero 2: ");
        int num2 = teclado.nextInt ();
        System.out.println ("Ingrese el numero 3: ");
        int num3 = teclado.nextInt ();
        int prom = (num1+num2+num3)/3;
        System.out.println ("La medida de los 3 numeros es de: "+prom);

        teclado.close();
    }
    
}
