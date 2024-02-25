package Ejercicios_1;

import java.util.Scanner;

/*Escribe un programa que reciba un número de dos cifras y
muestre por pantalla el número invertido. */
public class ejercicio_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número de dos cifras: ");
        int numero = teclado.nextInt();

        int cifra1 = numero / 10;
        int cifra2 = numero % 10;

        int invertido = cifra2 * 10 + cifra1;

        System.out.println("El número invertido es: " + invertido);
        teclado.close();

    }

}
