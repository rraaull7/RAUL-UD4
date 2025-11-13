public class NotasMedia {

    public static double[] calcularMedia(int[][] notas) {
        double[] notasMedia = new double[notas.length];

        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            // Sumo todos los elementos de una fila
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            // Calculo media
            notasMedia[i] = suma / notas[i].length;
        }

        return notasMedia;
    }

    public static void mostrarNotaMedia(double[] notas) {
        for (double nota : notas) {
            System.out.println(nota);
        }
    }

    public static void main(String[] args) {
        int[][] notasAlumnos = new int[][]{
                {3, 4, 5},
                {9, 2, 3},
                {5, 6, 1},
                {8, 6, 1},
        };

        double[] notasMedia = calcularMedia(notasAlumnos);
        mostrarNotaMedia(notasMedia);
    }
}