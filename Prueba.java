
public class Prueba{
    public static void main(String[] args) {
        //crea 3 libros
    Libro libro1 = new Libro("tituloDelLibro","autor", "isbn", 1999 );
    Libro libro2 = new Libro("tituloDelLibro","autor", "isbn", 1998 );
    Libro libro3 = new Libro("tituloDelLibro","autor", "isbn", 1996 );

        //muestra la informacion de los 3 libros
    libro1.mostrarInformacion();
    libro2.mostrarInformacion();
    libro3.mostrarInformacion();

        //crea la biblioteca
    Biblioteca libros = new Biblioteca();

        //muestra el libro que deseas
    libros.agregarLibros(libro1);
    libros.mostrarLibros();

}


}