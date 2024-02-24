package Ejercicios_2;
import java.util.concurrent.TimeUnit;

/**
Hacer un programa que muestre un cronometro, indicando las horas, minutos y
segundos
*/

public class ejercicio_24 {
  public static void main(String args[]) throws InterruptedException {
    int hora, minuto, segundo;
    String borraAnterior = "\b\b\b\b\b\b\b\b"; 
    for (hora=0; hora<=23; hora++) {
      for (minuto=0; minuto<=59; minuto++) {
        for (segundo=0; segundo<=59; segundo++) {
          System.out.printf("%02d:%02d:%2d",hora,minuto,segundo);
          TimeUnit.SECONDS.sleep(1);
          System.out.print(borraAnterior);
        }
      }
    }
  }
}