import java.util.Scanner;

public class Calificacion {

    public String obtenerCalificacion(double valor) {
return switch ((int) valor) {
case 0, 1, 2, 3, 4 -> "Insuficiente";
case 5 -> "Aprobado";
case 6 -> "Bien";
case 7, 8 -> "Notable";
case 9, 10 -> "Sobresaliente";
default -> "Nota inválida";

};
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Calificacion programa = new Calificacion();

System.out.print("Introduce la nota: ");
double nota = sc.nextDouble();

String calificacion = programa.obtenerCalificacion(nota);
System.out.println(calificacion);

sc.close();

}
}
