package Ejercicios_2;
import java.util.Scanner;

//EJERCICIO 2
//Realiza un programa que pida un número por teclado y nos indique si es par o impar.


public class ejercicio_2 {
public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);

System.out.println("Ingrese un numero: ");
int numero = teclado.nextInt();

//proceso
if (numero%2 == 0) {

    System.out.println("El numero es par");
    
} else {

    System.out.println("El numero es impar");
    
}

teclado.close();

}
    
}
