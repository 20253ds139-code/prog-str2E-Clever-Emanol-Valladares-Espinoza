
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("1. Calcular IMC");
            System.out.println("2. Área de rectángulo");
            System.out.println("3. Celsius a Fahrenheit");
            System.out.println("4. Área de círculo");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Peso (kg): ");
                    double peso = sc.nextDouble();
                    System.out.print("Altura (m): ");
                    double altura = sc.nextDouble();
                    System.out.println("IMC = " + calcularIMC(peso, altura));
                    break;

                case 2:
                    System.out.print("Base: ");
                    double base = sc.nextDouble();
                    System.out.print("Altura: ");
                    double h = sc.nextDouble();
                    System.out.println("Área = " + areaRectangulo(base, h));
                    break;

                case 3:
                    System.out.print("Celsius: ");
                    double c = sc.nextDouble();
                    System.out.println("Fahrenheit = " + convertirCelsiusAFahrenheit(c));
                    break;

                case 4:
                    System.out.print("Radio: ");
                    double r = sc.nextDouble();
                    System.out.println("Área = " + areaCirculo(r));
                    break;

                case 5:
                    System.out.println("Zayonara :)");
                    break;
            }

        } while (op != 5);
    }

    /** Calcula el IMC usando peso/altura^2.
     * @param peso Peso en kg.
     * @param altura Altura en metros.
     * @return IMC calculado.
     */
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    /** Calcula el área de un rectángulo.
     * @param base Base del rectángulo.
     * @param altura Altura del rectángulo.
     * @return Área.
     */
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    /** Convierte °C a °F.
     * @param c Celsius.
     * @return Fahrenheit.
     */
    public static double convertirCelsiusAFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    /** Calcula el área de un círculo con πr².
     * @param r Radio.
     * @return Área del círculo.
     */


    public static double areaCirculo(double r) {
        return Math.PI * r * r;
    }
}
