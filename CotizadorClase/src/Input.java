import java.util.Scanner;
public class Input {
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
        } while (valor < min || valor > max);
        return valor;
    }
    public static boolean leerBoolean(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextBoolean();
    }
    public static void imprimirTicket(double peso, int distancia, int servicio,
                                      boolean zonaRemota, double subtotal, double iva, double total) {
        String tipoServicio;
        if (servicio == 1) {
            tipoServicio = "estándar";
        } else {
            tipoServicio = "express";
        }
        System.out.println("servicio: " + tipoServicio);
        System.out.println("peso: " + peso + " kg");
        System.out.println("distancia: " + distancia + " km");
        System.out.println("zona remota: " + zonaRemota);
        System.out.println("subtotal: $" + subtotal);
        System.out.println("IVA: $" + iva);
        System.out.println("total: $" + total);
    }
}
