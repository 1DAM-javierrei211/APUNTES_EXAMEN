package apuntes_examen;

import java.util.Scanner;

public class javalin {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar la frase al usuario
            System.out.print("Introduce una frase: ");
            String frase = scanner.nextLine().trim();

            // Variables para las muletillas
            String muletillaInicio = "Javalín, javalón";
            String muletillaFin = "javalén, len, len";

            // Verificar si la frase pertenece al idioma de Javalandia
            if (frase.startsWith(muletillaInicio)) {
                // Dialecto 1: Comienza con "Javalín, javalón"
                String mensaje = frase.substring(muletillaInicio.length()).trim(); // Eliminar la muletilla inicial
                System.out.println("Frase en idioma de Javalandia (dialecto 1). Mensaje: \"" + mensaje + "\"");
            } else if (frase.endsWith(muletillaFin)) {
                // Dialecto 2: Termina con "javalén, len, len"
                String mensaje = frase.substring(0, frase.length() - muletillaFin.length()).trim(); // Eliminar la muletilla final
                System.out.println("Frase en idioma de Javalandia (dialecto 2). Mensaje: \"" + mensaje + "\"");
            } else {
                // No pertenece al idioma de Javalandia
                System.out.println("La frase no está escrita en el idioma de Javalandia.");
            }

            scanner.close();
        }
    }


