package Ejercicios_1;
import java.util.Scanner;
/**Escribir un programa que calcule el perimetro y
área de un rectángulo dada su base y su altura*/
public class ejercicio_2 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Dame el valor de la base del rectangulo: ");
        double base = teclado.nextDouble ();
        System.out.println ("Dame el valor de la altura del rectangulo: ");
        double altura = teclado.nextDouble ();
        double area = base * altura;
        double perimetro = 2*(base+altura);
        System.out.println("El area de este rectangulo es: "+ area);
        System.out.println("El perimetro de este rectangulo es: "+perimetro);
    }


}