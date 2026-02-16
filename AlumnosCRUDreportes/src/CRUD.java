public class CRUD {
    private Alumno[] alumnos = new Alumno[25];
    public boolean altaAlumno(int id, String nombre, double promedio) {
        if (id <= 0) {
            System.out.println("el id debe ser mayor a 0");
            return false;
        }
        if (nombre == null || nombre.trim().equals("")) {
            System.out.println("el nombre no puede estar vacio");
            return false;
        }
        if (promedio < 0 || promedio > 10) {
            System.out.println("el promedio debe estar entre 0 y 10");
            return false;
        }
        if (buscarIndice(id) != -1) {
            System.out.println("el id ya existe");
            return false;
        }
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                alumnos[i] = new Alumno(id, nombre, promedio);
                return true;
            }
        }
        System.out.println("no hay espacio disponible");
        return false;
    }
    public Alumno buscarPorId(int id) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                if (alumnos[i].getId() == id && alumnos[i].isActivo()) {
                    return alumnos[i];
                }
            }
        }
        return null;
    }
    public boolean actualizarPromedio(int id, double nuevoPromedio) {
        if (nuevoPromedio < 0 || nuevoPromedio > 10) {
            System.out.println("promedio invalido");
            return false;
        }
        Alumno a = buscarPorId(id);
        if (a != null) {
            a.setPromedio(nuevoPromedio);
            return true;
        }
        return false;
    }
    public boolean bajaLogica(int id) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                if (alumnos[i].getId() == id && alumnos[i].isActivo()) {
                    alumnos[i].setActivo(false);
                    return true;
                }
            }
        }
        return false;
    }
    public void listarActivos() {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].isActivo()) {
                System.out.println(alumnos[i]);
            }
        }
    }
    public void reportes() {
        double suma = 0;
        int contador = 0;
        Alumno mayor = null;
        Alumno menor = null;
        int mayoresA8 = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].isActivo()) {
                suma += alumnos[i].getPromedio();
                contador++;
                if (alumnos[i].getPromedio() >= 8.0) {
                    mayoresA8++;
                }
                if (mayor == null || alumnos[i].getPromedio() > mayor.getPromedio()) {
                    mayor = alumnos[i];
                }
                if (menor == null || alumnos[i].getPromedio() < menor.getPromedio()) {
                    menor = alumnos[i];
                }
            }
        }
        if (contador == 0) {
            System.out.println("no hay alumnos activos");
            return;
        }
        System.out.println("promedio general: " + (suma / contador));
        System.out.println("alumno con mayor promedio: " + mayor);
        System.out.println("alumno con menor promedio: " + menor);
        System.out.println("alumnos con promedio mayor o igual a 8: " + mayoresA8);
    }
    private int buscarIndice(int id) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
