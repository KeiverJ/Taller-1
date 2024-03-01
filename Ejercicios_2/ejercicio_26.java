package Ejercicios_2;
import java.util.Scanner;

/**
Escribe un programa que lea un número n e imprima una pirámide de números
con n filas.
*/

public class ejercicio_26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite el numero de niveles para la piramide:");
        int niveles = teclado.nextInt();

        for (int i = 1; i <= niveles; i++) {
            for (int j = 1; j <= niveles - i; j++) {
                System.out.print("  ");
            }
                for (int k = 1; k <= i; k++) {
                    System.out.print(k + " ");
                }
                    for (int l = i - 1; l >= 1; l--) {
                        System.out.print(l + " ");
                    }
                        System.out.println(); 
                    }
                    teclado.close();
    }
}
