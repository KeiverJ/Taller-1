package Ejercicios_2;
import java.util.Scanner;

/**
Escribir un programa que imprima todos los números pares entre dos números
que se le pidan al usuario
*/

public class ejercicio_20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menor = 0;
        int mayor = 0;
        System.out.println("Digita el primer numero");
        int prim_num = teclado.nextInt();
        System.out.println("Digita el segundo numero");
        int segun_num = teclado.nextInt();

        if (prim_num > segun_num){
            menor = segun_num;
            mayor = prim_num;
        } 
        else {
            mayor = segun_num;
            menor = prim_num;
        }
        
        System.out.println("Los números pares entre " + menor + " y " + mayor + " son:");
        for ( int i = menor; i < mayor; i++){
            if (i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
