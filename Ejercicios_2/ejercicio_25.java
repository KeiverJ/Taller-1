package Ejercicios_2;
import java.util.Scanner;

/**
Crea un programa que muestre en pantalla los N primeros números primos.
Se pide por teclado la cantidad de números primos que queremos mostrar.
*/

public class ejercicio_25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números primos que desea mostrar: ");
        int num = teclado.nextInt();

        int contador = 0;
        int numero = 2;

        while (contador < num) {
            boolean esPrimo = true;
            if (numero < 2) {
                esPrimo = false;
            } 
            else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo == true) {
                System.out.print(numero + ", ");
                contador++;
            }
            numero++;
        }
    }
}
