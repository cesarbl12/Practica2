import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Libro> libros;
    public Biblioteca(){
        this.libros = new ArrayList<>();
    }
    public void agregarLibros(Libro libro){
        libros.add(libro);
    }
    public void mostrarLibros(){
        if (libros.isEmpty()){
            System.out.println("La biblioteca esta vacia");
        } else {
            for (Libro libro : this.libros){
                libro.mostrarInformacion();
            }
        }
    }
    public void buscarLibro(String titulo){
        for (Libro libro : this.libros){
           if (libro.getTitulo().equals(titulo)){
            System.out.println(libro.getTitulo());
           }
        }
    }
}
