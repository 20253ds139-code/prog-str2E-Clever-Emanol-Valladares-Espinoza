public class Registros {
    private Persona[] personas = new Persona[20];
    public void alta(int id, String nombre) {
        if (id <= 0) {
            System.out.println("el ID debe ser mayor a 0");
            return;
        }
        if (buscarPorId(id) != -1) {
            System.out.println("no se permite ID repetido");
            return;
        }
        if (nombre.isEmpty()) {
            System.out.println("el nombre no puede estar vacio");
            return;
        }
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) {
                personas[i] = new Persona(id, nombre);
                System.out.println("persona registrada correctamente");
                return;
            }
        }

        System.out.println("arreglo lleno");
    }
    public void buscar(int id) {
        int pos = buscarPorId(id);
        if (pos != -1 && personas[pos].isActiva()) {
            System.out.println(personas[pos]);
        } else {
            System.out.println("no encontrada o inactiva");
        }
    }
    public void baja(int id) {
        int pos = buscarPorId(id);
        if (pos != -1 && personas[pos].isActiva()) {
            personas[pos].setActiva(false);
            System.out.println("persona dada de baja correctamente");
        } else {
            System.out.println("no encontrada o ya inactiva");
        }
    }
    public void listar() {
        System.out.println("PERSONAS ACTIVAS");
        for (Persona p : personas) {
            if (p != null && p.isActiva()) {
                System.out.println(p);
            }
        }
    }
    public void actualizar(int id, String nombre) {
        int pos = buscarPorId(id);
        if (pos != -1 && personas[pos].isActiva()) {
            if (nombre.isEmpty()) {
                System.out.println("nombre invalido");
                return;
            }
            personas[pos].setNombre(nombre);
            System.out.println("nombre actualizado correctamente");
        } else {
            System.out.println("no encontrada o inactiva");
        }
    }
    private int buscarPorId(int id) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && personas[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
