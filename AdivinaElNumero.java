import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
final int MIN = 0, MAX = 100;
int secreto = MIN + new Random().nextInt(MAX - MIN + 1);
int intento, intentos = 0;
Scanner sc = new Scanner(System.in);

System.out.println("Estoy pensando un número del " + MIN + " al " + MAX + "...");

do {
System.out.print("Tu intento: ");
intento = sc.nextInt();
intentos++;

if (intento < secreto)
System.out.println("Mayor");
else if (intento > secreto)
System.out.println("Menor");
else
System.out.println("¡Acertaste en " + intentos + " intentos!");
} while (intento != secreto);

sc.close();
}
}
