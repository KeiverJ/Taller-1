package Ejercicios_2;
import java.util.Scanner;

public class ejercicio_14 {
/*Realiza un programa que pida el día de la semana (del 1 al 7) y
escriba el día correspondiente. Si introducimos otro número nos
da un error. */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7 para obtener el día de la semana correspondiente:");
        int dia = teclado.nextInt();

        String diaSemana = "";

        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                System.out.println("Error: El número ingresado no corresponde a un día de la semana válido.");
                return;
        }

        System.out.println("El día correspondiente al número ingresado es: " + diaSemana);

        teclado.close(); 
    }
    
}
