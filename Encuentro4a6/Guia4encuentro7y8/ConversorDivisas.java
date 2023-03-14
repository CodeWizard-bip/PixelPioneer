import java.util.Scanner;

public class ConversorDivisas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantidad;

        System.out.print("Ingrese una cantidad en euros: ");
        cantidad = sc.nextDouble();

        System.out.println("Seleccione la moneda a convertir (USD, JPY o GBP): ");
        String moneda = sc.next().toUpperCase();

        convertirDivisa(cantidad, moneda);

        sc.close();
    }

    public static void convertirDivisa(double cantidad, String moneda) {
        double cambio = 0;

        switch (moneda) {
            case "USD":
                cambio = 1.28611;
                break;
            case "JPY":
                cambio = 129.852;
                break;
            case "GBP":
                cambio = 0.86;
                break;
            default:
                System.out.println("Moneda no válida.");
                return;
        }

        double resultado = cantidad * cambio;
        System.out.println(cantidad + " euros equivalen a " + resultado + " " + moneda);
    }

}
