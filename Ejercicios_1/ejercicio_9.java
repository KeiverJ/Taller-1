package Ejercicios_1;
import java.util.Scanner;
/**Una tienda ofrece un descuento del 15 sobre el total de la
compra y un cliente desea saber cuánto deberá pagar
finalmente por su pedido*/
public class ejercicio_9 {
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio_comp = teclado.nextDouble ();
        double precio_fin = precio_comp -(precio_comp*0.15);
        System.out.println("El precio final del producto con el 15% de descuento es de: "+precio_fin);
        teclado.close();
    }
    
}
