package Ejercicios_1;

import java.util.Scanner;

/*Escribe un programa que solicite al usuario dos pares de
números: (x1, y1) y (x2, y2), que representan dos puntos en el
plano. Calcula la distancia entre ambos.*/
public class ejercicio_12 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa x1: ");
        int x1 = teclado.nextInt();

        System.out.println("Ingresa y1: ");
        int y1 = teclado.nextInt();

        System.out.println("Ingresa x2: ");
        int x2 = teclado.nextInt();

        System.out.print("Ingresa y2: ");
        int y2 = teclado.nextInt();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("La distancia entre los puntos es: " + distancia);
        teclado.close();

    }
}