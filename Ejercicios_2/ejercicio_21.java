package Ejercicios_2;
import java.util.Scanner;

/**
Escribe un programa que pida el limite inferior y superior de un intervalo. Si el
límite inferior es mayor que el superior lo tiene que volver a pedir. A
continuación se van introduciendo números hasta que introduzcamos el 0.
Cuando termine el programa dará las siguientes informaciones:
• La suma de los números que están dentro del intervalo (intervalo abierto).
• Cuantos números están fuera del intervalo.
• Informa si hemos introducido algún número igual a los límites del intervalo.
*/

public class ejercicio_21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int lim_inf, lim_sup;
        int total = 0;
        int i = 0;
        boolean dato_lim = false;

        System.out.println("Si quieres detener el programa digita 0");
        do {
          System.out.print("Introduce el límite inferior: ");
          lim_inf = teclado.nextInt();
          System.out.print("Introduce el límite superior: ");
          lim_sup = teclado.nextInt();

          if (lim_inf > lim_sup) {
            System.out.println("El limite inferior no puede ser mayor al limite superior, registra los datos denuevo.");
          }
        } while (lim_inf > lim_sup);

        do {
          System.out.println("Digita  un número: ");
          num = teclado.nextInt();
          
          if (num != 0) {
            if (num > lim_inf && num < lim_sup) {
              total += num;
            } else if (num <= lim_inf || num >= lim_sup) {
              i++;
            }
            if (num == lim_inf || num == lim_sup) {
              dato_lim = true;
            }
          } 
        } while (num != 0);
        
        System.out.println("La suma de los numeros que estan entre los limites " + lim_inf +"-" + lim_sup +" es: " + total);
        System.out.println("Se digitaron " + i + " números fuera del intervalo " + lim_inf +"-"+ lim_sup);
        if (dato_lim == true){
          System.out.println("Si se introdujeron los mismos valores de los limites");
        } else {
          System.out.println("No se ha introducido ningun valor similar a los limites");
        }
      }
}
