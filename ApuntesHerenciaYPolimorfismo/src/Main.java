public class Main {

    public static void main(String[] args) {

        Gato botas = new Gato("Botas");
        Perro bruno = new Perro("Bruno");

        botas.comer();
        botas.hacerSonido();
        System.out.println("-------------------");
        bruno.comer();
        bruno.hacerSonido();

        Animal[] animales = new Animal[3];
        animales[0] = new Perro("Rufus");
        animales[1] = new Gato("Honey");
        animales[2] = new Perro("Solovino");

        for (Animal animal : animales) {
            System.out.println("-------");
            animal.comer();
            animal.hacerSonido();
        }

        Animal animal1 = new Perro("Nicky");
        Perro perr1 = (Perro) animal1;
        perr1.marcarTerritorio();
    }
}