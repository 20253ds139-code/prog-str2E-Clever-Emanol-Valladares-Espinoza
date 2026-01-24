import java.util.Scanner;

public class ActividadSwitchCalculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1) Hacer una Sumar");
        System.out.println("2) Hacer una Restar");
        System.out.println("3) Hacer una Multiplicar");
        System.out.println("4) Hacer una Dividir");

        System.out.print("Elige una opcion: ");
        int opcion = scanner.nextInt();

        if (opcion < 1 || opcion > 4) {
            System.out.println("Opcion invalida");
            scanner.close();
            return;
        }

        System.out.print("Ingresa el primer valor: ");
        double a = scanner.nextDouble();

        System.out.print("Ingresa el segundo valor: ");
        double b = scanner.nextDouble();

        double resultado;

        switch (opcion) {
            case 1:
                resultado = a + b;
                System.out.println("Operacion: Suma");
                System.out.println("Valores: Primer Valor = " + a + ", Segundo Valor = " + b);
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = a - b;
                System.out.println("Operacion: Resta");
                System.out.println("Valores: Primer Valor = " + a + ", Segundo Valor = " + b);
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = a * b;
                System.out.println("Operacion: Multiplicacion");
                System.out.println("Valores: Primer Valor = " + a + ", Segundo Valor = " + b);
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                System.out.println("Operacion: Division");
                System.out.println("Valores: Primer Valor = " + a + ", Segundo Valor = " + b);

                if (b == 0) {
                    System.out.println("No se puede dividir entre cero");
                } else {
                    resultado = a / b;
                    System.out.println("Resultado: " + resultado);
                }
                break;
        }

        scanner.close();
    }
}
