package Ejercicios_2;
import java.util.Scanner;

/*Escribe un programa que reciba un año y nos diga si es
bisiesto o no */


public class ejercicio_9 {

    public static void main(String[]arg){
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Introduce un año");
    int año = teclado.nextInt();

    if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)) ) {

        System.out.println("El año es bisiesto");

    } else {
      System.out.println("El año NO es bisiesto");
  
    }

  teclado.close();      
    }

}
