import java.util.Random;
import java.util.Scanner;

public class AdivinarMultiplicacion {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(11); // Generar número aleatorio entre 0 y 10
        int num2 = rand.nextInt(11);

        int resultado = num1 * num2;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Adivina el resultado de la multiplicación entre %d y %d: ", num1, num2);
        int respuesta = sc.nextInt();

        while (respuesta != resultado) {
            System.out.println("Respuesta incorrecta, intenta nuevamente.");
            System.out.printf("Adivina el resultado de la multiplicación entre %d y %d: ", num1, num2);
            respuesta = sc.nextInt();
        }

        System.out.println("¡Respuesta correcta!");
    }
}
