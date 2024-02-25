package Ejercicios_2;
import java.util.Scanner;

/**
Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla el resultado de la potencia. No se puede
utilizar el operador de potencia
*/

public class ejercicio_22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double resultado, base;
        int exponente;

        System.out.print("Digite el numero base: ");
        base = teclado.nextDouble();
        do {
            System.out.print("Digite el numero del exponente (debe ser un número entero no negativo): ");
            exponente = teclado.nextInt();
            if (exponente < 0) {
                System.out.println("Por favor, ingrese un exponente no negativo.");
            } 
            else if (exponente == 0)  {
                System.out.println("El resultado es: 1");
            } 
            else{
                resultado = base;
                    for (int i = 1; i < exponente; i++) {
                        resultado *= base;
                    }
                    System.out.println("El resultado es: " + resultado);
                }
            }while (exponente < 0);

            teclado.close();
        } 
    }
