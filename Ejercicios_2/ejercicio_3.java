package Ejercicios_2;
import java.util.Scanner;

/**
Crea un programa que pida al usuario dos números y
muestre el resultado de su división. Si el segundo
número es 0, debe mostrar un mensaje de error
*/

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite el primer numero");
        float digito_1 = teclado.nextFloat();
        System.out.println("Digite el segundo numero");
        float digito_2 = teclado.nextFloat();
        
        if (digito_2 <= 0){
            System.out.println ("No se puede realizar la division");
        }
        else {
            float division = digito_1 / digito_2;
            System.out.println("El resultado de la division es: " + division);
        }

    }
}