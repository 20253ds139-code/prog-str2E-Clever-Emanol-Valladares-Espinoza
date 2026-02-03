import java.util.Scanner;

public class InputUtils {

    public static double leerDoubleEnRango(Scanner sc, String mensaje, double min, double max) {
        double valor;
        do {
            System.out.print(mensaje);
            valor = sc.nextDouble();
        } while (valor < min || valor > max);
        return valor;
    }
    public static int leerIntEnRango(Scanner sc, String mensaje, int min, int max) {
        int valor;
        do {
            System.out.print(mensaje);
            valor = sc.nextInt();