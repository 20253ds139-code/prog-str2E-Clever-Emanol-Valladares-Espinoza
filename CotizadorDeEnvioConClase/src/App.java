import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShippingCalculator calc = new ShippingCalculator();
        double peso = leerDoubleEnRango(sc,
                "ingresa el peso de 0.1 a 50 kg: ", 0.1, 50);
        int distancia = leerIntEnRango(sc,
                "ingresa la distancia de 1 a 2000 km: ", 1, 2000);
        int servicio = leerIntEnRango(sc,
                "servicio 1 = estandar, 2 = express: ", 1, 2);
        boolean zonaRemota = leerBoolean(sc,
                "¿es zona remota? true/false: ");
        double subtotal = calc.calcularSubtotal(peso, distancia, servicio, zonaRemota);
        double iva = calc.calcularIVA(subtotal);
        double total = calc.calcularTotal(subtotal, iva);
        imprimirTicket(peso, distancia, servicio, zonaRemota, subtotal, iva, total);
    }
    public static double leerDoubleEnRango(Scanner sc, String msg, double min, double max) {
        double valor;
        do {
            System.out.print(msg);
            valor = sc.nextDouble();
        } while (valor < min || valor > max);
        return valor;
    }
    public static int leerIntEnRango(Scanner sc, String msg, int min, int max) {
        int valor;
        do {
            System.out.print(msg);
            valor = sc.nextInt();
        } while (valor < min || valor > max);
        return valor;
    }
    public static boolean leerBoolean(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextBoolean();
    }
    public static void imprimirTicket(double peso, int distancia, int servicio,
                                      boolean zonaR, double subtotal, double iva, double total) {
        String tipoS = (servicio == 1) ? "estandar" : "express";
        System.out.println("servicio: " + tipoS);
        System.out.println("peso: " + peso + " kg");
        System.out.println("distancia: " + distancia + " km");
        System.out.println("zona remota: " + zonaR);
        System.out.println("subtotal: $" + subtotal);
        System.out.println("IVA: $" + iva);
        System.out.println("total: $" + total);
    }
}
