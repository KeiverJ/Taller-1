package Ejercicios_1;
import java.util.Scanner;
/**Un vendedor recibe un sueldo base más un 10 extra por
comisión de sus ventas el vendedor desea saber cuanto
dinero obtendrá por concepto de comisiones por las tres
ventas que realiza en el mes y el total que recibirá en el mes
tomando en cuenta su sueldo base y comisiones */
public class ejercicio_8 {
    public static void main (String args []) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el salario base: ");
        double salario = teclado.nextDouble ();
        System.out.println("Indique la primera venta: ");
        double vent1 = teclado.nextDouble ();
        System.out.println("Indique la segunda venta: ");
        double vent2 = teclado.nextDouble();
        System.out.println("Indique la tercera venta: ");
        double vent3 = teclado.nextDouble();
        double com = 0.1* (vent1+vent2+vent3);
        double salario_to = salario + com;
        System.out.println("El salario total a recibir es de: "+salario_to+", la comision es de: "+com);
        teclado.close();
    }
}
