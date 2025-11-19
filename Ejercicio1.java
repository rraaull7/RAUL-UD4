

import java.util.Scanner;

public class Ejercicio1 {

    // Método que busca y reemplaza texto
    public static String buscarYRemplazarTexto(String p1, String p2, String p3) {
        if (p1.contains(p2)) {
            return p1.replace(p2, p3);
        } else {
            return "Texto no encontrado";
        }
    }

    public static char buscarLetra(String texto,int posicion){
if(posicion>texto.length()){
    return ' ';

}else{
    return texto.charAt(posicion);
}

    }

    public static int BuscarNumeroOcurrencias (String texto,char c){
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == c) {
                contador++;
            }
        }
        return contador;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu texto: ");
        String texto = sc.nextLine();

        System.out.print("Texto a buscar: ");
        String textoARemplazar = sc.nextLine();

        System.out.print("Nuevo texto: ");
        String textoNuevo = sc.nextLine();

        // Llamada al método y mostrar resultado
        String TextoRemplazado = buscarYRemplazarTexto(texto, textoARemplazar, textoNuevo);

        sc.close();
    }
}

