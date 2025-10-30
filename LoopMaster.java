import java.util.Scanner;

public class LoopMaster {

public static void contarHastaN(int n) {
for (int i = 1; i <= n; i++) {
if (i < n) {
System.out.print(i + " ");
} else {
System.out.print(i);
}
}
System.out.println();
}

    public static void imprimirSumaHastaN(int n) {
int suma = 0;
for (int i = 1; i <= n; i++) {
suma += i;
}
System.out.println("Suma = " + suma);
}

    public static void imprimirTablaMultiplicar(int n) {
for (int i = 1; i <= 10; i++) {
System.out.println(n + " x " + i + " = " + (n * i));
}
}

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Introduce un número: ");
int n = scanner.nextInt();

contarHastaN(n);
imprimirSumaHastaN(n);
imprimirTablaMultiplicar(n);
}
}






