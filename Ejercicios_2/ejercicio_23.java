package Ejercicios_2;
import java.util.Scanner;

/**
Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó
10 €, el segundo 20 €, el tercero 40 € y así sucesivamente.
Realizar un programa para determinar cuánto debe pagar mensualmente y el
total de lo que pagará después de los 20 meses.
Este programa puede servir para calcular otras compras y con diferentes plazos
*/

public class ejercicio_23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el monto inicial del primer mes: ");
        double pago_i = teclado.nextDouble();
        System.out.print("Ingrese el plazo a pagar: ");
        int plazo = teclado.nextInt();
        double pago_f = 0;

        System.out.println("Detalle de pagos mensuales:");

        for (int i = 1; i <= plazo; i++) {
            System.out.println("Mes " + i + ": " + pago_i + " Euros");
            pago_f += pago_i;
            pago_i *= 2;
        }
        System.out.println("Total pagado después de " + plazo + " meses: " + pago_f + " Euros");
    }
}

