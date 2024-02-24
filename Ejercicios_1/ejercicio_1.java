package Ejercicios_1;
import java.util.Scanner;
/**Escribir un programa que pregunte al usuario su
nombre y luego lo salude*/
public class ejercicio_1 {
    public static void main (String args []) {
        Scanner teclado = new Scanner (System.in);
        System.out.print ("Ingrese su nombre:  ");
        String nombre = teclado.nextLine ();
        System.out.println ("Hola usuario: "+ nombre);
    }
}