package Ejercicios_1;
import java.util.Scanner;
/**Realiza un programa que dados dos números
muestre la suma resta división y multiplicación de
ambos*/
public class ejercicio_4 {
    public static void main (String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Ingrese el primer numero: ");
        int num1 = teclado.nextInt ();
        System.out.println ("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt ();
        int suma = num1 + num2;
        System.out.println ("La suma de los dos numeros es de: "+suma);
        int mult = num1 * num2;
        System.out.println("La multiplicacion de los dos numeros es de: "+mult);
        if (num1>num2){
            int resta = num1 - num2;
            System.out.println("La resta de los dos numeros es de: "+resta);
        } else {
            int resta = num2 - num1;
            System.out.println("La resta de los dos numeros es de: "+resta);
        } 
        if (num1 == 0 || num2 ==0){
            System.out.println("Error, ningun numero es divisible por cero");
        } else {
            double div = (double) num1 / (double) num2;
            System.out.println("La division de los dos numeros es de: "+div);
        }




    }
}
