package Ejercicios_2;
import java.util.Scanner;

public class ejercicio_13 {

    /* Realiza un programa que pida por teclado el resultado (dato
entero) obtenido al lanzar un dado de seis caras y muestre por
pantalla el número en letras (dato cadena) de la cara opuesta al
resultado obtenido.
Nota1: En las caras opuestas de un dado de seis caras están los
números: 1-6, 2-5 y 3-4.
Nota 2: Si el número del dado introducido es menor que 1 o mayor
que 6, se mostrará el mensaje: «ERROR: número incorrecto». */
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese el resultado obtenido al lanzar un dado de seis caras:");
        int resultadoDado = teclado.nextInt();

        String caraOpuesta = "";

        switch (resultadoDado) {
            case 1:
                caraOpuesta = "6";
                break;
            case 2:
                caraOpuesta = "5";
                break;
            case 3:
                caraOpuesta = "4";
                break;
            case 4:
                caraOpuesta = "3";
                break;
            case 5:
                caraOpuesta = "2";
                break;
            case 6:
                caraOpuesta = "1";
                break;
            default:
                System.out.println("ERROR: número incorrecto");
                break;
        }

        if (!caraOpuesta.equals("")) {
            System.out.println("La cara opuesta al resultado obtenido es: " + caraOpuesta);
        }



teclado.close();
    }
}
