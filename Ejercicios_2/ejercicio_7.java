package Ejercicios_2;
import java.util.Scanner;

/**
Realiza un programa que pida los puntos centrales
de dos circunferencias (x1, y1), (x2, y2) y los radios de
las mismas (r1, r2). El programa debe clasificar según
corresponda como: exteriores, tangentes exteriores,
secantes, tangentes interiores, interiores o
concéntricas.
*/

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite x1:");
        int x1 = teclado.nextInt();
        System.out.println("Digite y1:");
        int y1 = teclado.nextInt();
        System.out.println("Digite x2:");
        int x2 = teclado.nextInt();
        System.out.println("Digite y2:");
        int y2 = teclado.nextInt();
        System.out.println("Digite r1:");
        int r1 = teclado.nextInt();
        System.out.println("Digite r2:");
        int r2 = teclado.nextInt();
        
        double distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        
        if (distancia == 0) {
        System.out.println("La clasificacion es: Concéntricas.");
        } else if (distancia > (r1+r2)) {
          System.out.println("La clasificacion es: Exteriores.");
        } else if ((distancia > 0) && distancia < Math.abs(r1-r2)) {
          System.out.println("La clasificacion es: Interiores.");
        } else if (distancia == (r1+r2)) {
          System.out.println("La clasificacion es: Tangentes exteriores.");
        } else if (distancia == Math.abs(r1-r2)) {
          System.out.println("La clasificacion es: Tangentes interiores.");
        } else if (distancia < (r1+r2) && distancia > Math.abs(r1-r2)) {
          System.out.println("La clasificacion es: Secantes.");
        }
    }
}
