import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();
        sc.close();
        
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        
        System.out.println("El número tiene " + count + " dígitos.");
    }
}
