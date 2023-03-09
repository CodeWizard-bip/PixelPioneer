
package javaapplication8;

import java.util.Scanner;


public class DobleYTripleDeUnNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int numero = sc.nextInt();

        int doble = numero * 2;
        int triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);

        System.out.println("El doble de " + numero + " es " + doble);
        System.out.println("El triple de " + numero + " es " + triple);
        System.out.println("La raíz cuadrada de " + numero + " es " + raizCuadrada);
    }
    
    
}
