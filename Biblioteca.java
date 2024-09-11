import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibros(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> buscarLibrosPorTitulo(String titulo) {
        List<Libro> encontrados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                encontrados.add(libro);
            }
        }
        return encontrados;
    }

    public List<Libro> obtenerLibrosPrestados() {
        List<Libro> prestados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getLibroPrestado()) {
                prestados.add(libro);
            }
        }
        return prestados;
    }

    public List<Libro> obtenerLibrosNoPrestados() {
        List<Libro> noPrestados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (!libro.getLibroPrestado()) {
                noPrestados.add(libro);
            }
        }
        return noPrestados;
    }

    @Override
    public String toString() {
        return libros.toString();
    }
}
