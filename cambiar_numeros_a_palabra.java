package apuntes_examen;

import java.util.Scanner;

public class cambiar_numeros_a_palabra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Llamamos a la función con el número deseado
        System.out.println("introduce un numero para cambiarlo a letras");
        int numero = teclado.nextInt();
        String resultado = convierteEnPalabras(numero);

        // Imprimir el resultado
        System.out.println(resultado);
    }

    public static String convierteEnPalabras(int n) {
        // Crear un array con las palabras correspondientes a los dígitos
        String[] palabras = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};

        // Convertir el número a una cadena de texto
        String numeroStr = String.valueOf(n);

        // Crear un StringBuilder para construir la cadena de resultado
        StringBuilder resultado = new StringBuilder();

        // Recorrer cada carácter (dígito) de la cadena
        for (int i = 0; i < numeroStr.length(); i++) {
            // Obtener el dígito en la posición i
            char digitoChar = numeroStr.charAt(i);

            // Convertir el carácter a un número entero
            int digito = Character.getNumericValue(digitoChar);

            // Añadir la palabra correspondiente al StringBuilder
            resultado.append(palabras[digito]);

            // Si no es el último dígito, añadir una coma y un espacio
            if (i < numeroStr.length() - 1) {
                resultado.append(", ");
            }
        }

        // Devolver la cadena resultante
        return resultado.toString();
    }
}
