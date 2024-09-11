import java.time.LocalDate;

public class Libro {
    private int añoPublicacion;
    private String tituloDelLibro;
    private Autor autor;
    private String isbn;
    private boolean libroPrestado;

    // Constructor por defecto
    public Libro() {
        añoPublicacion = 0;
        tituloDelLibro = "titulo de libro";
        isbn = "000 00 00000 00 0";
        libroPrestado = false;
    }

    // Constructor con parámetros
    public Libro(String tituloDelLibro, Autor autor, String isbn, int añoPublicacion) {
        this.tituloDelLibro = tituloDelLibro;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.autor = autor;
        this.libroPrestado = false; // Por defecto, no está prestado
    }

    public boolean esAntiguo() {
        int añoActual = LocalDate.now().getYear();
        return (añoActual - añoPublicacion > 20);
    }

    public String getTitulo() {
        return tituloDelLibro;
    }

    public boolean getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(boolean libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    @Override
    public String toString() {
        return "Título: " + tituloDelLibro + ", Autor: [" + autor.toString() + "], Año: " + añoPublicacion + ", ISBN: " + isbn + ", Prestado: " + libroPrestado;
    }
}
