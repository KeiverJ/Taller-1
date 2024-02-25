package Ejercicios_2;
import java.util.Scanner;

/**
Escribe un programa que lea 10 números por teclado y que luego los muestre en
orden inverso, es decir, el primero que se introduce es el último en mostrarse y
viceversa
*/

public class ejercicio_27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("Digita los numeros.");
        for (int i = 0; i < 10 ; i++) {
            System.out.print("Numero ["+(i+1)+"]: ");
            numeros[i] = teclado.nextInt();
        }        
        System.out.println("Estos son los valores en orden inverso:");
        for (int i = 9 ; i >= 0 ; i--) {
            System.out.println("Numero ["+(i+1)+"]: " + numeros[i]);            
        }
    }   
}
