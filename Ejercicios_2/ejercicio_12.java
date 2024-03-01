package Ejercicios_2;
import java.util.Scanner;


public class ejercicio_12 {

    /*La política de cobro de una compañía telefónica es:
Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, de tal forma
que los primeros cinco minutos cuestan 1 euro,
 los siguientes tres, 80 céntimos, 
los siguientes dos minutos a 70 céntimos
 y a partir del décimo minuto, 50 céntimos.
Además,
 se carga un impuesto de 3% cuando es domingo, 
 y si es otro día, en turno de
mañana 15% y en turno de tarde 10%.
Realice un algoritmo para determinar cuánto debe pagar por cada concepto una
persona que realiza una llamada */
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    //variables min, dia, impuesto mañana, tarde, costo total

    System.out.println("Ingrese la duración de la llamada en minutos:");
    int duracionLlamada = teclado.nextInt();

    System.out.println("Ingrese el día de la semana (1 para domingo, 2 para otro día):");
    int dia = teclado.nextInt();

    System.out.println("Ingrese el turno de la llamada (1 para mañana, 2 para tarde):");
    int truno = teclado.nextInt();

    double costoTotal = 0;

    if (duracionLlamada <= 5) {
        costoTotal = 1;
    } else if (duracionLlamada <= 8) {
        costoTotal = 1 + 0.8 * (duracionLlamada - 5);
    } else if (duracionLlamada <= 10) {
        costoTotal = 1 + 0.8 * 3 + 0.7 * (duracionLlamada - 8);
    } else {
        costoTotal = 1 + 0.8 * 3 + 0.7 * 2 + 0.5 * (duracionLlamada - 10);
    }

    if (dia == 1) {
        costoTotal *= 1.03;
    } else {
        if (truno == 1) {
            costoTotal *= 1.15; 
        } else {
            costoTotal *= 1.10;
        }
    }

    System.out.println("El costo total de la llamada es: " + costoTotal + " euros.");



    teclado.close();

    }
    
}


