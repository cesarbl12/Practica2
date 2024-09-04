import java.time.LocalDate;
public class Libro {
    private int añoPublicacion;
    private String tituloDelLibro;
    private String autor;
    private String isbn;

//Constructor
    public Libro(){
        añoPublicacion = 0;
        tituloDelLibro = "titulo de libro";
        autor = "nombre";
        isbn = "000 00 00000 00 0";
    }
//Segundo constructor 
    public Libro(String tituloDelLibro, String autor, String isbn, int añoPublicacion){
        this.tituloDelLibro = tituloDelLibro;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.autor = autor;
    }

//Mostrar informacion
    public void mostrarInformacion(){
        System.out.println("Titulo:" + tituloDelLibro);
        System.out.println("Autor:" + autor);
        System.out.println("Año de publicacion:" + añoPublicacion);
        System.out.println("isbn:" + isbn);
    }   
//mostrar si es antiguo o no el libro
    public boolean esAntiguo(){
        int añoActual = LocalDate.now().getYear();

        if (añoActual - añoPublicacion > 20){
            return true;
        } else {
            return false;
        }
    }
//getters para busqueda por titulo
    public String getTitulo(){
        return tituloDelLibro;
    }
    
}
