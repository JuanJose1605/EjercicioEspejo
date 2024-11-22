import java.util.ArrayList;
import java.util.Scanner;

public class sistemaAcademico {
     static Scanner scanner = new Scanner(System.in);

    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(scanner.nextLine());
    }
    public static double leerDecimal(String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(scanner.nextLine());
    }

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        // Registro de alumnos
        System.out.println("Ingreso de Datos del Alumno:");
        Alumno alumno = new Alumno(
                leerTexto("Nombre: "),
                leerTexto("Apellido: "),
                leerEntero("Edad: "),
                leerTexto("Género: "),
                leerTexto("Correo: "),
                leerTexto("Teléfono: ")
        );
        alumnos.add(alumno);

        // Registro de cursos
        System.out.println("\nIngreso de Datos del Curso:");
        Curso curso = new Curso(
                leerTexto("Nombre del Curso: "),
                leerEntero("Cantidad de Créditos: "),
                leerTexto("Descripción del Curso: ")
        );
        cursos.add(curso);

        // Inscripción y registro de notas
        System.out.println("\nIngreso de Notas:");
        Inscripcion inscripcion = new Inscripcion(alumno, curso);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Notas del Corte " + i + ":");
            inscripcion.agregarNotas(
                    i,
                    leerDecimal("Nota de Trabajos: "),
                    leerDecimal("Nota Parcial: "),
                    leerDecimal("Nota de Certificación: "),
                    leerDecimal("Nota de Autoevaluación: ")
            );
        }
        inscripciones.add(inscripcion);

// Mostrar información completa
        System.out.println("\nResumen de Información:");
        System.out.println(inscripcion);
}}
