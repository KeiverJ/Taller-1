package Ejercicios_2;
import java.util.Scanner;

/**
Crea una aplicación que permita adivinar un número. La aplicación genera un
número aleatorio del 1 al 100. A continuación va pidiendo números y va
respondiendo si el número a adivinar es mayor o menor que el introducido, a
demás de los intentos que te quedan (tienes 10 intentos para acertarlo). El
programa termina cuando se acierta el número (además te dice en
cuantos intentos lo has acertado), si se llega al limite de intentos te muestra
el número que había generado.
*/

public class ejercicio_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero_al = (int)(Math.random()*100+1);
        int numero_in = 0;
        int i = 10;
        System.out.println(numero_al);
        while (i>0) {
            System.out.println("Digita un numero: ");
            numero_in = teclado.nextInt();
            if (numero_in == numero_al){
                System.out.println("Felicidades, has adivinado el numero, lo lograste en: " + (10-(i-1)) + " intentos");
                break;
            }
            else if (numero_in > numero_al){
                System.out.println("El numero introducido es mayor que el numero a adivinar, te quedan " + (i-1) + " intentos");
            }
            else{
                System.out.println("El numero introducido es menor que el numero a adivinar, te quedan " + (i-1) + " intentos");
            }
            i--;
        }  
        if (i == 0) {
            System.out.println("Perdiste, el numero a adivinar era el: " + numero_al);
        }

        teclado.close();
    }
}
