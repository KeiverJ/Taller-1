package Ejercicios_2;
import java.util.Scanner;

public class ejercicio_11 {

    /* El director de una escuela está organizando un viaje de estudios y requiere determinar
cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el
servicio. La forma de cobrar es la siguiente:
* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
* De 50 a 99 alumnos, el costo es de 70 euros.
* De 30 a 49 alumnos, el costo es de 95 euros.
* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar
el número de alumnos.
Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo
que debe pagar cada alumno por el viaje.*/

public static void main(String[]args){

    Scanner teclado =new Scanner(System.in);

    System.out.println("Digite la cantidad de almunos que van a ir de excuerción:");
    int alumnos = teclado.nextInt();


    if (alumnos>=100) {

        int total= alumnos*65;
        System.out.println("El costo a pagar por cada alumno seria 65 eueros, y a la compañia de viajes se el debera entregar: "+total);
    } 
    else if (alumnos>=50 && alumnos<=99) {

        int total= alumnos*70;
        System.out.println("El costo a pagar por cada alumno seria 70 eueros, y a la compañia de viajes se el debera entregar: "+total); 
        
    }
    else if (alumnos>=30&&alumnos<=49) {
        int total= alumnos*95;
        System.out.println("El costo a pagar por cada alumno seria 95 eueros, y a la compañia de viajes se el debera entregar: "+total);
        
    }
    else{
        System.out.println("El costo de renta del autobus es de 4000 euros");
        
    }





teclado.close();
}
  
}
