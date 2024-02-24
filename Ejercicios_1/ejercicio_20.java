package Ejercicios_1;
import java.util.Scanner;

/**
. Realiza un programa que nos diga el dinero que tenemos (en
euros y céntimos) tras preguntarnos cuantas monedas
* tenemos de 2 euros, 1 euro, 50, 20 ó 10 céntimos.
*/

public class ejercicio_20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Cuantas monedas de 2 euros tienes:");
        int dos = teclado.nextInt();
        System.out.println("Cuantas monedas de 1 euros tienes:");
        int uno = teclado.nextInt();
        System.out.println("Cuantas monedas de 50 centimos tienes:");
        int cincuenta = teclado.nextInt();
        System.out.println("Cuantas monedas de 20 centimos tienes:");
        int veinte = teclado.nextInt();
        System.out.println("Cuantas monedas de 10 centimos tienes:");
        int diez = teclado.nextInt();
        
        int total = dos * 200 + uno * 100 + cincuenta * 50 + veinte * 20 + diez * 10;
        int euros = total / 100;
        int centimos = total % 100;

        System.out.println("Se dispone de " +euros + " euros y "+centimos + " centimos.");
    }
}
