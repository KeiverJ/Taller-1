package Ejercicios_1;
import java.util.Scanner;
/**Realiza un programa que nos diga el dinero que tenemos (en
euros y céntimos) tras preguntarnos cuantas monedas
tenemos de 2 euros, 1 euro, 50, 20 ó 10 céntimos. */
public class ejercicio_20 {
    public static void main (String args []) {
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Ingrese la cantidad de monedas de 2 euros: ");
        int dosEu = teclado.nextInt ();
        System.out.println ("Ingrese la cantidad de monedas de 1 euro: ");
        int unEu = teclado.nextInt ();
        System.out.println ("Ingrese la cantidad de monedas de 50 centimos: ");
        int cincent = teclado.nextInt ();
        System.out.println ("Ingrese la cantidad de monedas de 20 centimos: ");
        int veintcent = teclado.nextInt ();
        System.out.println ("Ingrese la cantidad de monedas de 10 centimos: ");
        int diezcent = teclado.nextInt ();
        int total = dosEu * 200 + unEu *100 + cincent *50 + veintcent *20 + diezcent *10;
        int euros = total /100;
        int centimos = total %100;
        System.out.println ("La cantidad total es de: " +euros+" euros y "+centimos);


    }

}