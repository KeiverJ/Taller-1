package Ejercicios_1;
import java.util.Scanner;

/**
Realiza un programa que calcule la nota final de un
estudiante, considerando por cada respuesta 5 puntos, las
incorrectas restan un punto, y las no contestadas ni suman ni
restan.
*/

public class ejercicio_19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int respuestas_buenas_finales = 0;
        int i=0;
        System.out.println("Digite la cantidad de respuestas buenas");
        int respuestas_buenas = teclado.nextInt();
        System.out.println("Digite la cantidad de respuestas incorrectas");
        int respuestas_malas = teclado.nextInt();
        System.out.println("Digite la cantidad de respuestas no contestadas");
        int respuestas_vacias = teclado.nextInt();
        
        teclado.close();
        
        for (i=0; i<=respuestas_buenas; i++){
            respuestas_buenas_finales = i * 5;
        } 
        
        int calificacion = respuestas_buenas_finales - respuestas_malas;
        System.out.println("Su calificación es de: " + calificacion);
        
        
    }
}
