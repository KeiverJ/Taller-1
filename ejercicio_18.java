package Ejercicios_2;
import java.util.Scanner;

/**
Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de
números a introducir). El programa debe informar de cuántos números
introducidos son mayores que 0, menores que 0 e iguales a 0.
*/

public class ejercicio_18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int e = 0;
        int a = 0;
        int o = 0;

        System.out.println("Digite la cantidad de numero a introducir");
        int num_i = teclado.nextInt();
        if (num_i < 0){
            System.out.println("Ingrese un numero mayor a 0");
        }
        else {
            for (int i=1; i<=num_i; i++){
                System.out.println("Digite el " + i + " numero");
                int num_f = teclado.nextInt();
                if (num_f == 0){
                    e++;
                }
                else if (num_f > 0){
                    a++;
                }
                else {
                    o++;
                }
            } 
            System.out.println("La cantidad de numeros mayores a 0 son: " + a + "\n" + "La cantidad de numeros menores a 0 son: " + o + "\n" + "La cantidad de numeros iguales a 0 son: " + e);
        }

        teclado.close();
    }  
}
