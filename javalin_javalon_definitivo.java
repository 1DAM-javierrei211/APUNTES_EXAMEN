package apuntes_examen;
import java.util.Scanner;
public class javalin_javalon_definitivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo 1 - Frase en Dialecto 1
        String frase1 = "Javalín, javalón Hola, ¿cómo estás?";
        System.out.println("Frase original: " + frase1);
        System.out.println("Mensaje traducido: " + traduce(frase1));

        // Ejemplo 2 - Frase en Dialecto 2
        String frase2 = "Hola, ¿cómo estás? javalén, len, len";
        System.out.println("Frase original: " + frase2);
        System.out.println("Mensaje traducido: " + traduce(frase2));

        // Ejemplo 3 - Frase no en idioma de Javalandia
        String frase3 = "¡Hola, cómo estás!";
        System.out.println("Frase original: " + frase3);
        System.out.println("Mensaje traducido: " + traduce(frase3));
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
