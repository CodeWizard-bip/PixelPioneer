import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Ingrese la operación que desea realizar ( +, -, *, / )");
        char operacion = sc.next().charAt(0);

        switch (operacion) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + sumar(num1, num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + restar(num1, num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + multiplicar(num1, num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + dividir(num1, num2));
                break;
            default:
                System.out.println("Operación inválida");
                break;
        }

        sc.close();
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        return num1 / num2;
    }
}
