package Ejercicios_1;

import java.util.Scanner;

/*Dos vehículos viajan a diferentes velocidades y están
distanciados por una distancia «d». El que está detrás viaja a
una velocidad mayor. Se pide hacer un algoritmo para
ingresar la distancia entre los dos vehículos (km) y sus
respectivas velocidades (km/h) y con esto determinar y
mostrar que tiempo (minutos) alcanzará el vehículo más
rápido al otro. */
public class ejercicio_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la distancia entre vehículos (km): ");
        double d = teclado.nextDouble();

        System.out.println("Ingresa velocidad del vehículo detrás (km/h): ");
        double v1 = teclado.nextDouble();

        System.out.println("Ingresa velocidad del vehículo delante (km/h): ");
        double v2 = teclado.nextDouble();

        double diferencia = v1 - v2;

        double t = d / diferencia;
        t = t * 60;

        System.out.println("Tiempo para alcanzar (minutos): " + t);

        teclado.close();

    }

}
