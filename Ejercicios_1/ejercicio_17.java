package Ejercicios_1;
import java.util.Scanner;

/**
 Un ciclista parte de una ciudad A a las HH horas, MM minutos
y SS segundos. El tiempo de viaje hasta llegar a otra ciudad B
es de T segundos. Escribir un algoritmo que determine la hora
de llegada a la ciudad B.
*/

public class ejercicio_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite la hora de salida de la ciudad A");
        int hora_a = teclado.nextInt();
        System.out.println("Digite los minutos de salida de la ciudad A");
        int minuto_a = teclado.nextInt();
        System.out.println("Digite los segundos de salida de la ciudad A");
        int segundos_a = teclado.nextInt();
        System.out.println("Digite el tiempo de viaje a la ciudad B en segundos");
        int segundos_b = teclado.nextInt();
        
        if (minuto_a <= 60 && segundos_a <= 60) {
           
        int segundos_final = (hora_a*3600)+(minuto_a*60)+segundos_a+segundos_b;
        
        int hora_final = segundos_final / 3600;
        int segunditos = segundos_final % 3600;
        int minutos_final = segunditos / 60;
        int segundos = segunditos % 60;

        System.out.println("Su hora de llegada es: " + hora_final + " horas " + minutos_final + " minutos" + " y " + segundos + " segundos"); 
        }
        else {
            System.out.println ("Chao");
        }
    }
}
