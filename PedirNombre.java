
package javaapplication8;

import java.util.Scanner;


public class PedirNombre {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduce tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("Tu nombre es: " + nombre);
    }
    
}
