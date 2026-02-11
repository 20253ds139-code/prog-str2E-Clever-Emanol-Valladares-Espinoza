import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registros gestor = new Registros();
        int opcion;
        do {
            System.out.println("(1) alta");
            System.out.println("(2) buscar por ID (solo activas)");
            System.out.println("(3) baja logica por ID");
            System.out.println("(4) listar activas");
            System.out.println("(5) actualizar nombre por ID");
            System.out.println("(0) salir");
            System.out.print("opcion elegida: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int idAlta = sc.nextInt();
                    sc.nextLine();
                    System.out.print("nombre: ");
                    String nombreAlta = sc.nextLine();
                    gestor.alta(idAlta, nombreAlta);
                    break;
                case 2:
                    System.out.print("ID a buscar: ");
                    gestor.buscar(sc.nextInt());
                    break;
                case 3:
                    System.out.print("ID para baja logica: ");
                    gestor.baja(sc.nextInt());
                    break;
                case 4:
                    gestor.listar();
                    break;
                case 5:
                    System.out.print("ID a actualizar: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();
                    System.out.print("nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    gestor.actualizar(idAct, nuevoNombre);
                    break;
                case 0:
                    System.out.println("programa finalizado");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        } while (opcion != 0);
    }
}
