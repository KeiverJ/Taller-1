package Ejercicios_1;
import java.util.Scanner;
/**Un alumno desea saber cual será su calificación final en la
materia de Algoritmos Dicha calificación se compone de los
siguientes porcentajes:
55 del promedio de sus tres calificaciones parciales
30 de la calificación del examen final
15 de la calificación de un trabajo final */
public class ejercicio_10 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese la nota del primer examen: ");
        double exam1 = teclado.nextDouble ();
        System.out.println("Ingrese la nota del segundo examen: ");
        double exam2 = teclado.nextDouble();
        System.out.println("Ingrese la nota del tercer examen: ");
        double exam3 = teclado.nextDouble();
        System.out.println("Ingrese la nota del examen: ");
        double exam = teclado.nextDouble();
        System.out.println("Ingrese la nota del trabajo final: ");
        double trab = teclado.nextDouble();
        double parci = (exam1+exam2+exam3)/3;
        double nota = parci *0.55 + exam *0.3 + trab *0.15;
        System.out.println("Su nota final es de: "+nota);
        teclado.close();
    }
}
