package Ejercicios_2;

/**
Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).
*/

public class ejercicio_30 {
    public static void main(String[] args) {
        int sumaTotal = 0;
        int sumaColumna = 0;
        int sumaFila = 0;

        int[][] matriz = new int[4][5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int)(Math.random()*900+100); 
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
