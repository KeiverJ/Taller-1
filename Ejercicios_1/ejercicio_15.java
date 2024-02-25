package Ejercicios_1;

import java.util.Scanner;

/*Escribe un programa que reciba dos variables numéricas (A y
B) y realiza un algoritmo que intercambie los valores de
ambas y muestre cuánto valen al final cada una. */
public class ejercicio_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el valor de A: ");
        int a = teclado.nextInt();

        System.out.println("Ingresa el valor de B: ");
        int b = teclado.nextInt();

        System.out.println("Valor inicial de A: " + a);
        System.out.println("Valor inicial de B: " + b);

        int temporal = a;
        a = b;
        b = temporal;

        System.out.println("Valor final de A: " + a);
        System.out.println("Valor final de B: " + b);
        teclado.close();

    }
}
