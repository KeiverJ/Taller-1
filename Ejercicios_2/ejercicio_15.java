package Ejercicios_2;
import java.util.Scanner;

/**
Realiza un programa que pida un número entero entre uno y
doce e imprima el número de días que tiene el mes
correspondiente
*/

public class ejercicio_15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int mes;

    System.out.println("Digite el numero del mes:");
    System.out.println("1. Enero.");
    System.out.println("2. Febreo.");
    System.out.println("3. Marzo.");
    System.out.println("4. Abril.");
    System.out.println("5. Mayo.");
    System.out.println("6. Junio.");
    System.out.println("7. Julio.");
    System.out.println("8. Agosto.");
    System.out.println("9. Septiembre.");
    System.out.println("10. Octubre.");
    System.out.println("11. Noviembre.");
    System.out.println("12. Diciembre.");
    System.out.print("Mes: ");
    mes = teclado.nextInt();
    
    switch (mes) {
        case 1:
            System.out.println("El mes tiene 31 dias");
            break;
        case 2:
            System.out.println("El mes tiene 28 dias");
            break;   
        case 3:
            System.out.println("El mes tiene 31 dias");
            break; 
        case 4:
            System.out.println("El mes tiene 30 dias");
            break;
        case 5:
            System.out.println("El mes tiene 31 dias");
            break;        
        case 6:
            System.out.println("El mes tiene 30 dias");
            break;
        case 7:
            System.out.println("El mes tiene 31 dias");
            break;   
        case 8:
            System.out.println("El mes tiene 31 dias");
            break; 
        case 9:
            System.out.println("El mes tiene 30 dias");
            break;
        case 10:
            System.out.println("El mes tiene 31 dias");
            break;   
        case 11:
            System.out.println("El mes tiene 30 dias");
            break;
        case 12:
            System.out.println("El mes tiene 31 dias");
            break;      
        default:
            System.out.println("Digite el mes correctamente (1-12)");
            break;
    }
    teclado.close();
  }
}
