
public class Prueba{
public static void main(String[] args) {
    Libro libro1 = new Libro("tituloDelLibro","autor", "isbn", 1999 );
    Libro libro2 = new Libro("tituloDelLibro","autor", "isbn", 1998 );
    Libro libro3 = new Libro("tituloDelLibro","autor", "isbn", 1996 );


    libro1.mostrarInformacion();
    libro2.mostrarInformacion();
    libro3.mostrarInformacion();

    Biblioteca libros = new Biblioteca();

    libros.agregarLibros(libro1);
    libros.mostrarLibros();

}


}