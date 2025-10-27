import java.util.Scanner;

public class NotaPorLetra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una letra de nota (A-F): ");
        String letra = scanner.nextLine().toUpperCase();

        String resultado;

        if (letra.equals("A")) {
            resultado = "Sobresaliente";
        } else if (letra.equals("B")) {
            resultado = "Notable";
        } else if (letra.equals("C")) {
            resultado = "Bien";
        } else if (letra.equals("D")) {
            resultado = "Suficiente";
        } else if (letra.equals("F")) {
            resultado = "Insuficiente";
        } else {
            resultado = "Letra inválida";
        }

        System.out.println("Calificación: " + resultado);
        scanner.close();
    }
    
}
