public class Autor {
    private String id;
    private String nombreAutor;
    private String correoElectronico;

    // Constructor por defecto
    public Autor() {
        id = "00000";
        nombreAutor = "nombre completo";
        correoElectronico = "correo electronico";
    }

    // Constructor con parámetros
    public Autor(String id, String nombreAutor, String correoElectronico) {
        this.id = id;
        this.nombreAutor = nombreAutor;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombreAutor + ", Correo: " + correoElectronico;
    }
}
