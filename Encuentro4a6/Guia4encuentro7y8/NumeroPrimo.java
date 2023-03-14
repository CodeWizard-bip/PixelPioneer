import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un número: ");
        num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println(num + " es un número primo");
        } else {
            System.out.println(num + " no es un número primo");
        }
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
