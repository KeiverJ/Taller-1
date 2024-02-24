package Ejercicios_1;
import java.util.Scanner;
/**Escribir un programa que nos devuelva la
hipotenusa de un triángulo rectángulo conociendo
sus catetos*/
public class ejercicio_3 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Ingrese el valor de la base del rectangulo");
        double base = teclado.nextDouble();
        System.out.println("Ingrese el valor de la altura del rectangunlo");
        double altura = teclado.nextDouble ();
        double hyp = Math.sqrt(Math.pow(base, 2)+ Math.pow(altura, 2));
        System.out.println ("El valor de la hipotenusa del rectangulo es de: "+hyp);




    }
}
