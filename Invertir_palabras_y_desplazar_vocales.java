package apuntes_examen;

import java.util.Arrays;
import java.util.Scanner;

public class Invertir_palabras_y_desplazar_vocales {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = teclado.nextLine();

        // Usar la función 'invertir'
        String[] invertido = invertir(palabra);
        System.out.println("Cadena invertida y en mayúsculas: " + Arrays.toString(invertido));

        // Usar la función 'desplazarVocales'
        String[] desplazado = desplazarVocales(palabra);
        System.out.println("Cadena con vocales desplazadas: " + Arrays.toString(desplazado));
    }
    public static String[] invertir(String cadena) {
        // Convertir la cadena a mayúsculas
        cadena = cadena.toUpperCase();

        // Crear un array de tipo String para almacenar los caracteres
        String[] resultado = new String[cadena.length()];

        // Recorremos la cadena desde el final y colocamos cada carácter en el array
        for (int i = 0; i < cadena.length(); i++) {
            // Invertir la cadena colocando el carácter de la posición (longitud - i - 1)
            resultado[i] = String.valueOf(cadena.charAt(cadena.length() - i - 1));
        }

        // Devolver el array con las letras invertidas
        return resultado;
    }

    public static String[] desplazarVocales(String cadena) {
        // Crear un array de tipo String para almacenar los caracteres
        String[] resultado = new String[cadena.length()];

        // Recorrer cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i); // Obtener el carácter en la posición i

            // Desplazar las vocales
            switch (c) {
                case 'a':
                    resultado[i] = "e";
                    break;
                case 'e':
                    resultado[i] = "i";
                    break;
                case 'i':
                    resultado[i] = "o";
                    break;
                case 'o':
                    resultado[i] = "u";
                    break;
                case 'u':
                    resultado[i] = "a";
                    break;
                default:
                    resultado[i] = String.valueOf(c); // No es una vocal, se mantiene igual
                    break;
            }
        }

        // Devolver el array con las letras modificadas
        return resultado;
    }

}
