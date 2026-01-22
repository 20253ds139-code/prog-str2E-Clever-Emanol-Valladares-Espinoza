import java.util.Scanner;
public class ActividadIfElseTarifa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la edad: ");
        int edades = scanner.nextInt();
        if (edades < 0 || edades > 120) {
            System.out.println("Edad inválida");
            return;
        }

        System.out.print("¿Es estudiante? (true/false): ");
        boolean estudiante = scanner.nextBoolean();

        int tarifa;

        if (edades < 12) {
            tarifa = 50;
        } else if (edades <= 17) {
            if (estudiante) {
                tarifa = 60;
            } else {
                tarifa = 80;
            }
        } else {
            if (estudiante) {
                tarifa = 90;
            } else {
                tarifa = 120;
            }
        }

        System.out.println("\nEdad ingresada: " + edades);
        System.out.println("Es estudiante: " + estudiante);
        System.out.println("Tarifa final: $" + tarifa);
    }
}