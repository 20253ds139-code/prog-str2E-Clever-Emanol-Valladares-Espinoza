import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShippingCalculator calc = new ShippingCalculator();
        double peso = Input.leerDoubleEnRango(sc,
                "ingresa el peso (0.1 - 50 kg): ", 0.1, 50);
        int distancia = Input.leerIntEnRango(sc,
                "ingresa la distancia (1 - 2000 km): ", 1, 2000);
        int servicio = Input.leerIntEnRango(sc,
                "servicio (1 = estándar, 2 = express): ", 1, 2);
        boolean zonaRemota = Input.leerBoolean(sc,
                "¿es zona remota? (true/false): ");
        double subtotal = calc.calcularSubtotal(peso, distancia, servicio, zonaRemota);
        double iva = calc.calcularIVA(subtotal);
        double total = calc.calcularTotal(subtotal, iva);
        Input.imprimirTicket(peso, distancia, servicio, zonaRemota,
                subtotal, iva, total);
    }
}
