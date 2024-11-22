public class Curso {

        private String nombre;
        private int creditos;
        private String descripcion;

        public Curso(String nombre, int creditos, String descripcion) {
            this.nombre = nombre;
            this.creditos = creditos;
            this.descripcion = descripcion;
        }

        @Override
        public String toString() {
            return "Curso: " + nombre + "\nCréditos: " + creditos + "\nDescripción: " + descripcion;
        }
}
