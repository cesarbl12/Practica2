import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Libro> libros;
    public Biblioteca(){
        this.libros = new ArrayList<>();
    }
    //agrega el libro a la variable libros
    public void agregarLibros(Libro libro){
        libros.add(libro);
    }
    // clase que muestra los libros, en caso de no tener nada que mostrar envia mensaje de error.
    public void mostrarLibros(){
        if (libros.isEmpty()){
            System.out.println("La biblioteca esta vacia");
        } else {
            for (Libro libro : this.libros){
                libro.mostrarInformacion();
            }
        }
    }
    // clase que busca el libro a traves del titulo 
    public void buscarLibro(String titulo){
        for (Libro libro : this.libros){
           if (libro.getTitulo().equals(titulo)){
            System.out.println(libro.getTitulo());
           }
        }
    }
}
