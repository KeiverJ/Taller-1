package Ejercicios_1;

import java.util.Scanner;

/*Escribe un programa que calcule la «distancia» que existe
entre dos números pasados por teclado*/
public class ejercicio_11 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int numero2 = teclado.nextInt();

        int distancia = Math.abs(numero1 - numero2);

        System.out.println("La distancia entre " + numero1 + " y " + numero2 + " es: " + distancia);
        teclado.close();
    }
}