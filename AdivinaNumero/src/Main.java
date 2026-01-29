import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intentosMaximos = 7;
        int intentos = 0;

        int fueraDeRango = 0;
        int noNumerico = 0;

        boolean gano = false;

        System.out.println("Adivina el numero");
        System.out.println("Adivina un número entre el 1 al 100");
        System.out.println("Tienes 7 intentos para adivinar");

        while (intentos < intentosMaximos && !gano) {

            System.out.print("Intento " + (intentos + 1) + ": ");

            if (!scanner.hasNextInt()) {
                System.out.println("El dato ingresado no es50 un numero");
                System.out.println("Porfavor ingresa un dato numerico");
                noNumerico++;
                scanner.next();
                continue;
            }

            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario < 1 || numeroUsuario > 100) {
                System.out.println("El numero esta fuera del rango del 1-100");
                fueraDeRango++;
                continue;
            }

            intentos++;

            if (numeroUsuario == numeroSecreto) {
                gano = true;
                System.out.println("¡GANASTE! adivinaste el numero secteto era: " + numeroSecreto);
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero secreto es MAYOR +");
            } else {
                System.out.println("El numero secreto es MENOR -");
            }
        }

        System.out.println("Resultados");
        System.out.println("Total de intentos utilizados: " + intentos);
        System.out.println("Total de numeros fuera de rango: " + fueraDeRango);
        System.out.println("Datos que no eran numeros: " + noNumerico);

        if (!gano) {
            System.out.println("Perdiste el numero secreto era: " + numeroSecreto);
        }

        scanner.close();
    }
}
