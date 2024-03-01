package Ejercicios_2;
import java.util.Scanner;

/**
Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las sumas
parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La
suma total debe aparecer en la esquina inferior derecha
*/

public class ejercicio_29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sumaTotal = 0;
        int sumaColumna = 0;
        int sumaFila = 0;
        
        int[][] matriz = new int[4][5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingresa un número para la posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("\nSuma parcial: \n");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }

            for (int j = 0; j < 5; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("| " + sumaFila);
        }

        for (int j = 0; j < 5; j++) {
            System.out.print("--------");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.print(sumaColumna + "\t");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("| Total: " + sumaTotal);
    }
}
