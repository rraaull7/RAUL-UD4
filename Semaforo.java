import java.util.Scanner;

public class Semaforo {

    public String accionSemaforoIf(String color){
       if (color == null) return "Color inválido";

        color = color.trim().toLowerCase();

        if (color.isEmpty()) {
        return "Color inválido";
        } else if (color.equals("rojo")) {
        return "Para";
        } else if (color.equals("amarillo")) {
        return "Atento";
        } else if (color.equals("verde")) {
        return "Pasa";
        } else {
        return "Color inválido";
        }
    }
    

    public String accionSemaforoSwitch(String color){
        
 if (color == null) return "Color inválido";

        color = color.trim().toLowerCase();

        if (color.isEmpty()) return "Color inválido";

        switch (color) {
        case "rojo":
        return "Para";
        case "amarillo":
        return "Atento";
        case "verde":
        return "Pasa";
        default:
        return "Color inválido";
        }
    }
        
    public static void main(String[] args){
        Semaforo semaforo = new Semaforo();
        // Pedir color al usuario usando Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un color del semáforo: ");
        String color = sc.nextLine();
        
    // Llamar a método accionSemaforoIf
    String accionIf = semaforo.accionSemaforoIf(color);
    // Llamar a método accionSemaforoSwitch

    String accionSwitch = semaforo.accionSemaforoSwitch(color);
    // Mostrar por pantalla (System.out) el resultado
    System.out.println("Resultado con if: " + accionIf);
     // Mostrar por pantalla (System.out) el resultado
    System.out.println("Resultado con switch: " + accionSwitch);

    sc.close();
    }
}