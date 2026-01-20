import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = pedirEntero(scanner, "a");
        int b = pedirEntero(scanner, "b");
        int c = pedirEntero(scanner, "c");
        int suma = calcularSuma(a, b, c);
        double promedio = calcularPromedio(suma, 3);
        mostrarResultados(suma, promedio);
        scanner.close();
    }
    public static int pedirEntero(Scanner scanner, String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextInt();
    }
    public static int calcularSuma(int a, int b, int c) {
        return a + b + c;
    }
    public static double calcularPromedio(int suma, int cantidad) {
        return suma / (double) cantidad;
    }
    public static void mostrarResultados(int suma, double promedio) {
        System.out.println("suma = " + suma);
        System.out.println("prom = " + promedio);
    }
}