package Ejercicios_2;
import java.util.Scanner;

/*Realiza un programa que calcule la potencia de un número, dado este
y su exponente.
Pueden ocurrir tres casos:
* El exponente sea positivo: imprime resultado en pantalla
* El exponente sea 0, el resultado es 1
* El exponente sea negativo, el resultado es 1/potencia con el
exponente positivo */

public class ejercicio_5 {

    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        //variables base, exponente
            
        Double resultado;
                
        System.out.println("Programa para calcular la potencia de un numero");

        System.out.println("digite la base: ");
        int base = teclado.nextInt();

        System.out.println("digite el exponente");
        int exponente = teclado.nextInt();


        // condiciones / operaciones
        //* El exponente sea positivo: imprime resultado en pantalla 
        //* El exponente sea 0, el resultado es 1
        //* El exponente sea negativo, el resultado es 1/potencia con el
        if(exponente >0 ){    
        resultado = Math.pow(base,exponente);
        System.out.println("El resultado es: "+ resultado); 
        }  
        if(exponente ==0 ){
        System.out.println("El resultado de la operacion es: 1");
        }
        if (exponente <0 ){
        resultado = Math.pow(base,exponente) ;
        System.out.println("El resultado es: "+ resultado);
        }


        teclado.close();
    }
    
}
