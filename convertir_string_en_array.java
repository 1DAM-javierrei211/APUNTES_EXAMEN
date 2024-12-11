package apuntes_examen;

import java.util.Scanner;

public class convertir_string_en_array {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numeros en el string");
        String palabra = teclado.nextLine();

        // Prueba de la función con diferentes cadenas
        int[] resultado = convierteStringEnArray(palabra);

        // Mostrar el array resultante
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }

    // Función que convierte un String en un array de enteros
    public static int[] convierteStringEnArray(String a) {

        // Crear un array de enteros con la misma longitud que el String
        int[] resultado = new int[a.length()];

        // Llenar el array con los números de la cadena
        for (int i = 0; i < a.length(); i++) {
            // Convertir cada carácter a su valor entero correspondiente
            resultado[i] = a.charAt(i) - '0';  // '0' tiene el valor 48 en ASCII, por eso restamos '0'
        }

        return resultado;
    }
}
