import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;
        int contadorCtoF = 0;
        int contadorFtoC = 0;
        int contadorKmToMillas = 0;
        int contadorMillasToKm = 0;

        do {
            System.out.println("1) °C a °F");
            System.out.println("2) °F a °C");
            System.out.println("3) Km a Millas");
            System.out.println("4) Millas a Km");
            System.out.println("5) Salir");

            opcion = numeroValido(1, 5, scanner, "Selecciona una opcion del 1 al 5: ");

            switch(opcion) {
                case 1:
                    double celsius = obtenerNumero(scanner, "Ingresa la temperatura en celsius: ");
                    double fahrenheit = celsius * 9 / 5 + 32;
                    System.out.println(celsius + " °C = " + fahrenheit + " °F");
                    contadorCtoF++;
                    break;

                case 2:
                    double f = obtenerNumero(scanner, "Ingresa la temperatura en fahrenheit: ");
                    double c = (f - 32) * 5 / 9;
                    System.out.println(f + " °F = " + c + " °C");
                    contadorFtoC++;
                    break;

                case 3:
                    double km = obtenerNumero(scanner, "Ingresa la distancia en Km: ");
                    double millas = km * 0.621371;
                    System.out.println(km + " Km = " + millas + " Millas");
                    contadorKmToMillas++;
                    break;

                case 4:
                    double millas2 = obtenerNumero(scanner, "Ingresa la distancia en millas: ");
                    double km2 = millas2 / 0.621371;
                    System.out.println(millas2 + " Millas = " + km2 + " Km");
                    contadorMillasToKm++;
                    break;

                case 5:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion no valida intenta de nuevo");
            }

        } while(opcion != 5);

        int totalConversiones = contadorCtoF + contadorFtoC + contadorKmToMillas + contadorMillasToKm;
        System.out.println("Total de conversiones realizadas: " + totalConversiones);
        System.out.println("°C a °F: " + contadorCtoF);
        System.out.println("°F a °C: " + contadorFtoC);
        System.out.println("Km a Millas: " + contadorKmToMillas);
        System.out.println("Millas a Km: " + contadorMillasToKm);

        scanner.close();
    }

    public static int numeroValido(int min, int max, Scanner scanner, String mensaje) {
        int valor;
        while(true){
            System.out.print(mensaje);
            if(scanner.hasNextInt()){
                valor = scanner.nextInt();
                if(valor >= min && valor <= max){
                    return valor;
                }
                System.out.println("Opcion fuera de rango Debe ser entre " + min + " y " + max);
            } else {
                System.out.println("Dato invalido debes ingresar un numero");
                scanner.next();
            }
        }
    }

    public static double obtenerNumero(Scanner scanner, String mensaje) {
        double valor;
        while(true){
            System.out.print(mensaje);
            if(scanner.hasNextDouble()){
                valor = scanner.nextDouble();
                return valor;
            } else {
                System.out.println("Dato invalido debes ingresar un numero");
                scanner.next();
            }
        }
    }
}