package Ejercicios_1;

import java.util.Scanner;
/*Escribe un programa que reciba un número y calcule su raíz
cuadrada y cúbica. */

public class ejercicio_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        double numero = teclado.nextDouble();

        double raizCuadrada = Math.sqrt(numero);
        double raizCubica = Math.cbrt(numero);

        System.out.println("Raíz cuadrada de " + numero + ": " + raizCuadrada);
        System.out.println("Raíz cúbica de " + numero + ": " + raizCubica);
        teclado.close();
    }

}
