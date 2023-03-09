
package javaapplication8;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Ingresa la temperatura en grados Celsius: ");
      double celsius = sc.nextDouble();
      
      double fahrenheit = 32 + (9 * celsius / 5);
      System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
   }
    
}
