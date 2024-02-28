package Ejercicios_2;
import java.util.Scanner;

/* EJERCICIO 8: Realiza un programa que clasifique un triángulo tras
recibir el tamaño de sus lados. Se debe clasificar
como triángulo rectángulo, isósceles, equilátero o
escaleno  */


public class ejercicio_8 {

    public static void main(String[] args) {

Scanner teclado =new Scanner(System.in);
//variables
System.out.println("Introduce el lado 1: ");
int lado1=teclado.nextInt();

System.out.println("Introduce el lado 2: ");
int lado2=teclado.nextInt();

System.out.println("Introduce el lado 3: ");
int lado3=teclado.nextInt();
//processo 
if (lado1 == lado2 && lado2 == lado3) {
    System.out.println("El triángulo es equilátero.");
} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
    System.out.println("El triángulo es isósceles.");
} else {
    if (Math.pow(lado1, 2) == Math.pow(lado2, 2) + Math.pow(lado3, 2) ||
        Math.pow(lado2, 2) == Math.pow(lado1, 2) + Math.pow(lado3, 2) ||
        Math.pow(lado3, 2) == Math.pow(lado1, 2) + Math.pow(lado2, 2)) {
        System.out.println("El triángulo es rectángulo.");
    } else {
        System.out.println("El triángulo es escaleno.");
    }
}

teclado.close();
    }
    
}
