public class Inscripcion {
    private Alumno alumno;
    private Curso curso;
    private double[][] notas;

    public Inscripcion(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
        this.notas = new double[3][4]; // 3 cortes, 4 notas por corte
    }

    public void agregarNotas(int corte, double trabajos, double parcial, double certificacion, double autoevaluacion) {
        notas[corte - 1][0] = trabajos;
        notas[corte - 1][1] = parcial;
        notas[corte - 1][2] = certificacion;
        notas[corte - 1][3] = autoevaluacion;
    }
    public double calcularNotaFinal() {
        double notaFinal = 0;
        for (double[] corte : notas) {
            double promedioCorte = (corte[0] * 0.15) + (corte[1] * 0.7) + (corte[2] * 0.1) + (corte[3] * 0.05);
            notaFinal += promedioCorte;
        }
        return notaFinal / 3;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(alumno).append("\n").append(curso).append("\nNotas Registradas:\n");
        for (int i = 0; i < notas.length; i++) {
            sb.append("Corte " + (i + 1) + ": Trabajos: " + notas[i][0] + ", Parcial: " + notas[i][1] +
                    ", Certificación: " + notas[i][2] + ", Autoevaluación: " + notas[i][3] + "\n");
        }
        sb.append("Nota Final: ").append(String.format("%.2f", calcularNotaFinal()));
        return sb.toString();
    }
}
