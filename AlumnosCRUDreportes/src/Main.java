import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CRUD sistema = new CRUD();
        int opcion;
        do {
            System.out.println("(0) salir");
            System.out.println("(1) alta alumno");
            System.out.println("(2) buscar por ID");
            System.out.println("(3) actualizar promedio");
            System.out.println("(4) baja logica");
            System.out.println("(5) listar activos");
            System.out.println("(6) reportes");
            System.out.print("opcion:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("promedio: ");
                    double promedio = sc.nextDouble();
                    if (sistema.altaAlumno(id, nombre, promedio)) {
                        System.out.println("alumno agregado");
                    } else {
                        System.out.println("no se pudo agregar");
                    }
                    break;
                case 2:
                    System.out.print("ID: ");
                    int buscar = sc.nextInt();
                    Alumno a = sistema.buscarPorId(buscar);
                    if (a != null) {
                        System.out.println(a);
                    } else {
                        System.out.println("no encontrado");
                    }
                    break;
                case 3:
                    System.out.print("ID: ");
                    int idAct = sc.nextInt();
                    System.out.print("nuevo promedio: ");
                    double nuevo = sc.nextDouble();
                    if (sistema.actualizarPromedio(idAct, nuevo)) {
                        System.out.println("actualizado");
                    } else {
                        System.out.println("error");
                    }
                    break;
                case 4:
                    System.out.print("ID: ");
                    int baja = sc.nextInt();
                    if (sistema.bajaLogica(baja)) {
                        System.out.println("alumno dado de baja");
                    } else {
                        System.out.println("no encontrado");
                    }
                    break;
                case 5:
                    sistema.listarActivos();
                    break;
                case 6:
                    sistema.reportes();
                    break;
                case 0:
                    System.out.println("fin del programa");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        } while (opcion != 0);
        sc.close();
    }
}
