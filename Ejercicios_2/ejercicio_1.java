package Ejercicios_2;
import java.util.Scanner;

/**
Realiza un programa que reciba dos números por teclado e indique cual es mayor o si son iguales.
*/

public class ejercicio_1 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    System.out.println("Este programa pide dos números y calcula cual es mayor.");
    System.out.print("Introduce el primer número: ");
    int numero1 = teclado.nextInt();
    System.out.print("Introduce el segundo número: ");
    int numero2 = teclado.nextInt();
    
    if (numero1 > numero2){
        System.out.println("El primer número, " +numero1 + ", es mayor que el número dos," +numero2);
    }else if (numero1 < numero2){
        System.out.println("El segundo número, " +numero2 + ", es mayor que el primer número " +numero1);
    }else {
        System.out.println("Ambos números son iguales, " +numero1);
    }  
    teclado.close();  
  }
}
