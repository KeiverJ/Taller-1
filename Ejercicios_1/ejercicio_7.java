package Ejercicios_1;
import java.util.Scanner;
/**Crea un programa que reciba por teclado una cantidad de
minutos y te devuelva la conversión en horas y minutos
equivalentes. */
public class ejercicio_7 {
    public static void main (String args []) {
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Ingrese la cantidad de minutos: ");
        int min = teclado.nextInt ();
        int horas = min / 60;
        int min_1 = min % 60;
        System.out.println ("La cantidad en horas es: "+ horas +" y en minutos es de: " +min_1);
    }
}
