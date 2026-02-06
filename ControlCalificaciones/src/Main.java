import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeService service = new GradeService();
        String nombre = leerTextoNoVacio(sc, "nombre del alumno: ");
        double p1 = leerDoubleEnRango(sc, "parcial 1: ", 0, 100);
        double p2 = leerDoubleEnRango(sc, "parcial 2: ", 0, 100);
        double p3 = leerDoubleEnRango(sc, "parcial 3: ", 0, 100);
        int asistencia = leerIntEnRango(sc, "asistencia (%): ", 0, 100);
        boolean entregoProyecto = leerBoolean(sc, "¿entrego proyecto? (true/false): ");
        double promedio = service.calcularPromedio(p1, p2, p3);
        double finalCal = service.calcularFinal(promedio, asistencia);
        String estado = service.determinarEstado(finalCal, asistencia, entregoProyecto);
        imprimirReporte(nombre, p1, p2, p3, promedio, asistencia, entregoProyecto, finalCal, estado);
        sc.close();
    }
    public static String leerTextoNoVacio(Scanner sc, String msg) {
        String texto;
        do {
            System.out.print(msg);
            texto = sc.nextLine();
        } while (texto.trim().isEmpty());
        return texto;
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
    public static void imprimirReporte(String nombre,
                                       double p1, double p2, double p3,
                                       double promedio,
                                       int asistencia,
                                       boolean entregoProyecto,
                                       double finalCal,
                                       String estado) {
        System.out.println("alumno: " + nombre);
        System.out.println("parciales: " + p1 + ", " + p2 + ", " + p3);
        System.out.println("promedio: " + promedio);
        System.out.println("asistencia: " + asistencia + "%");
        System.out.println("entrego proyecto: " + entregoProyecto);
        System.out.println("calificacion final: " + finalCal);
        System.out.println("estado: " + estado);
    }
}
