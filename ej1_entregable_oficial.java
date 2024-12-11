package apuntes_examen;

import java.util.Scanner;

public class ej1_entregable_oficial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la palabra a adivinar
        System.out.print("Introduce la palabra a adivinar: ");
        String palabraAdivinar = scanner.nextLine();

        // Inicializar el resultado parcial con guiones
        String resultadoParcial = "-".repeat(palabraAdivinar.length());

        // Variable para la letra a buscar
        char letra;

        // Mientras el resultado parcial no sea igual a la palabra a adivinar
        while (!resultadoParcial.equals(palabraAdivinar)) {
            // Pedir al usuario que ingrese una letra
            System.out.print("Introduce una letra: ");
            letra = scanner.next().charAt(0);

            // Llamar a la función palabraAhorcado para actualizar el resultado parcial
            resultadoParcial = palabraAhorcado(palabraAdivinar, resultadoParcial, letra);

            // Mostrar el resultado parcial
            System.out.println("Resultado parcial: " + resultadoParcial);
        }

        // Si la palabra fue adivinada correctamente
        System.out.println("¡Felicidades! La palabra es: " + palabraAdivinar);
    }
    // Función palabraAhorcado
    public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra) {
        // Convertir la cadena de resultado parcial a un array de caracteres para poder modificarlo
        char[] resultado = resultado_parcial.toCharArray();

        // Recorrer la palabra a adivinar
        for (int i = 0; i < cadena_a_adivinar.length(); i++) {
            // Si la letra coincide con la letra en la cadena, actualizamos el resultado parcial
            if (cadena_a_adivinar.charAt(i) == letra) {
                resultado[i] = letra;  // Reemplazamos el guion por la letra correcta
            }
        }

        // Devolvemos la cadena modificada
        return new String(resultado);
    }
}
