package Ejercicios_2;
import java.util.Scanner;

/**
Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.
*/

public class ejercicio_28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 0; i < 10; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == maximo) {
                System.out.print(" (máximo)");
            } else if (numeros[i] == minimo) {
                System.out.print(" (mínimo)");
            }
            System.out.println();
        }
        teclado.close();
    }
}
