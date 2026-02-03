import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShippingCalculator calc = new ShippingCalculator();

        double peso = InputUtils.leerDoubleEnRango(sc,
                "Ingresa el peso (0.1 - 50 kg): ", 0.1, 50);

        int distancia = InputUtils.leerIntEnRango(sc,
                "Ingresa la distancia (1 - 2000 km): ", 1, 2000);
