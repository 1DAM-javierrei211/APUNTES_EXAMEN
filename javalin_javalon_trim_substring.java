package apuntes_examen;
import java.util.Scanner;
public class javalin_javalon_trim_substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la frase al usuario
        System.out.print("Introduce la frase en el idioma de Javalandia: ");
        String frase = scanner.nextLine();

        // Traducir la frase
        String mensaje = traduce(frase);

        // Mostrar el resultado
        System.out.println("Mensaje traducido: " + mensaje);
    }

    // Función traduce que maneja los dos dialectos y elimina las muletillas
    public static String traduce(String frase) {
        // Eliminar los posibles espacios al principio y al final de la frase
        frase = frase.trim();

        // Comprobar si la frase está en el idioma de Javalandia (Dialect 1 o Dialect 2)
        if (frase.startsWith("Javalín, javalón")) {
            // Frase en dialecto 1, eliminamos la muletilla al principio
            return frase.substring("Javalín, javalón".length()).trim();
        } else if (frase.endsWith("javalén, len, len")) {
            // Frase en dialecto 2, eliminamos la muletilla al final
            return frase.substring(0, frase.length() - "javalén, len, len".length()).trim();
        } else {
            // No es un idioma de Javalandia
            return "La frase no está en el idioma de Javalandia.";
        }
    }
}
