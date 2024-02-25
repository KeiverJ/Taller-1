package Ejercicios_2;
import java.util.Scanner;

/*EJERCICIO 6: Realiza un programa que calcule la aceptación de una solicitud en
base a los siguientes parámetros: edad, nota y sexo.
* Mínimo: Nota (5), edad (18), sexo M –> POSIBLE
* Mínimo: Nota (5), edad (18), sexo F –> ACEPTADA
* Otros casos –> NO ACEPTADA */

public class ejercicio_6 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        //VARIABLES: nota, edad, sexo
        
        System.out.println("Digite su nota: ");
        byte nota = teclado.nextByte();
        System.out.println("Digite su edad: ");
        byte edad = teclado.nextByte();
        teclado.nextLine();

        System.out.println("Digite su genero (M/F): ");
        String genero=teclado.nextLine();
        

        if (nota>=5 && edad>=18 && genero.equals("M")) {

            System.out.println("SOLICITUD POSIBLE");
            
        }
        
        else if (nota>=5 && edad>=18 &&genero.equals("F")) {

            System.out.println("SOLICITUD ACEPTADA");
            
        }
        else{
            System.out.println("SOLICITUD DENEGADA");
        }
        


        teclado.close();
    }
    
}
