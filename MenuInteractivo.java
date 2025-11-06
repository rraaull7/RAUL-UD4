import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuInteractivo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int opcion;
do {
System.out.println("--- MENÚ INTERACTIVO ---");
System.out.println("1. Hola");
System.out.println("2. Hora");
System.out.println("3. Salir");
System.out.print("Elige una opción: ");
opcion = sc.nextInt();
sc.nextLine();

switch (opcion) {
case 1:

System.out.print("Ingresa tu nombre: ");
String nombre = sc.nextLine();
System.out.println("Hola " + nombre);
break;

case 2:

String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
System.out.println(hora);
break;

case 3:
System.out.print("Adios!! ");
break;


default:
System.out.println("Opción no válida, intenta de nuevo.");
break;


} 
} while (opcion != 3);
sc.close();
}
}

