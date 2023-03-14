import java.util.Scanner;

public class Personas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String seguir = "Sí";
        int n;

        System.out.print("Ingrese la cantidad de personas: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese la edad de la persona: ");
            int edad = sc.nextInt();

            System.out.println("Nombre: " + nombre + " Edad: " + edad + " " + esMayorDeEdad(edad));

            System.out.print("¿Desea seguir mostrando personas? (Sí/No): ");
            seguir = sc.next();
            if (seguir.equalsIgnoreCase("No")) {
                break;
            }
        }
        sc.close();
    }

    public static String esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

}
