package Ejercicios_2;
import java.util.Scanner;

/**
Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’
en caso contrario, el programa termina cuando se introduce un espacio
*/

public class ejercicio_19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String caracteres;
        int tamaño;
        char caracter;
        boolean vocal = true;
        System.out.println("Digita los caracteres a analizar, si quieres cerrar el programa, introduce un espacio");
        caracteres = teclado.nextLine();
        while (!caracteres.equals(" ")){
            tamaño = caracteres.length();
          for (int i=0; i< tamaño ;i++){
            caracter = caracteres.toUpperCase().charAt(i);
            if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
              vocal = true;
            } 
             else {
              vocal = false;
              break;
            }
          }
          if (vocal == true){
            System.out.println("Los carácteres son vocales.");
           } 
           else {
             System.out.println("Los carácteres no son vocales");
           }
          System.out.println("Digita los caracteres a analizar, si quieres cerrar el programa, introduce un espacio");
              caracteres = teclado.nextLine(); 
         }

         teclado.close();
      }
}
