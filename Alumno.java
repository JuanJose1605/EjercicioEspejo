public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String correo;
    private String telefono;

    public Alumno(String nombre, String apellido, int edad, String genero, String correo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "Nombre Completo: " + nombre + " " + apellido + "\nEdad: " + edad + "\nGénero: " + genero +
                "\nCorreo Electrónico: " + correo + "\nTeléfono: " + telefono;
    }
}
