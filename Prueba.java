import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear autores
        Autor autor1 = new Autor("12345", "Juan Pérez", "juan.perez@example.com");
        Autor autor2 = new Autor("67890", "Ana Gómez", "ana.gomez@example.com");

        // Crear libros
        Libro libro1 = new Libro("Java para principiantes", autor1, "978-1234567890", 2010);
        Libro libro2 = new Libro("Programación avanzada en Java", autor2, "978-0987654321", 1998);
        libro2.setLibroPrestado(true);

        // Crear biblioteca y agregar libros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibros(libro1);
        biblioteca.agregarLibros(libro2);

        // Solicitar al usuario qué tipo de libros desea ver
        System.out.println("¿Qué libros desea ver?");
        System.out.println("1. Libros prestados");
        System.out.println("2. Libros no prestados");
        System.out.print("Seleccione una opción (1 o 2): ");
        int opcion = scanner.nextInt();
        
        // Mostrar libros según la opción seleccionada
        switch (opcion) {
            case 1:
                System.out.println("Libros prestados:");
                for (Libro libro : biblioteca.obtenerLibrosPrestados()) {
                    System.out.println(libro);
                }
                break;
            case 2:
                System.out.println("Libros no prestados:");
                for (Libro libro : biblioteca.obtenerLibrosNoPrestados()) {
                    System.out.println(libro);
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        // Cerrar el escáner
        scanner.close();
    }
}
