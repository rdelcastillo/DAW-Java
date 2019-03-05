package org.iesgrancapitan.PROGR.Java.ejercicios.ej03funciones;

import java.util.Scanner;

/**
  * <p>Programa que pide caracteres e imprime 'VOCAL' si son vocales y 'NO VOCAL'
  * en caso contrario, el programa termina cuando se introduce un espacio.</p>
  * 
  * <p>Análisis</p>
  * <ul>
  * <li>Leer un carácter hasta que sea el espacio.
  * <li>Si el carácter no es espacio - si es una vocal - Muestro "Es vocal"
  * <li>Si no muestro "No es vocal"
  * </ul>
  * <p>Datos de entrada:vamos leyendo un carácter.</p>
  * <p>Información de salida:Mensajes: "Es vocal", "No es vocal"</p>
  * <p>Variables:car (caracter)</p>
  * 
  * <p>Diseño</p>
  * <ol>
  * <li>Repetir - Leer carácter hasta que sea un sólo carácter
  * <li>Mientras no sea espacio
  * <li>Si car no es el espacio
  * <li>Si es A,E,I,O,U o a,e,i,o,u - Mostrar "Es vocal"
  * <li>Si no mostrar "No es vocal"
  * <li>Repetir - Leer carácter hasta que sea un sólo carácter
  * </ol>
  *
  * @author Rafael del Castillo
  *
  */

public class Ej03VocalConsonante {
  
  public static void main(String args[]) {
    String car;

    // Pedimos un solo carácter y si no se introduce lo pedimos de nuevo
    car = caracter();

    //Proceso
    while (!car.equals(" ")) {
      if (esVocal(car)) {
        System.out.println("VOCAL");
      } else {
        System.out.println("NO VOCAL");
      }
      // Pedimos otro carácter
      car = caracter();
    }
  }

  // Funciones

  /**
   * Pide un solo carácter y comprueba si se ha introducido correctamente,
   * si no es así lo pide de nuevo.
   * 
   * @return <code>String de longitud 1</code>
   */
   public static String caracter() {
    Scanner s = new Scanner(System.in);
    String car;
    do {
      System.out.print("Introduce un carácter: ");
      car = s.nextLine();
    } while (car.length()!=1);
    return car;
  }

  /**
   * Comprueba si una cadena es vocal o no.
   *
   * @param c una cadena de caracteres
   * 
   * @return <code>true</code> si la cadena es vocal y <code>false</code> en caso contrario
   */
  public static boolean esVocal(String c) {
    c = c.toUpperCase();
    return "AEIOUÁÉÍÓÚ".contains(c) && c.length()==1;
  }
}

