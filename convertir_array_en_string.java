package apuntes_examen;

import java.util.Scanner;

public class convertir_array_en_string {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] a1 = {}; // Ejemplo con array vacío
        int[] a2 = {8}; // Ejemplo con un solo número
        int[] a3 = {6, 2, 5, 0, 1};
        int[] a4 = new int[3];// Ejemplo con varios números

        for (int i = 0; i < a4.length; i++) {
            a4[i]= teclado.nextInt();
        }

        System.out.println(convierteArrayEnString(a1)); // Devuelve ""
        System.out.println(convierteArrayEnString(a2)); // Devuelve "8"
        System.out.println(convierteArrayEnString(a3));
        System.out.println(convierteArrayEnString(a4));// Devuelve lo que pongas en el scanner
    }

    public static String convierteArrayEnString(int[] a) {
        // Creamos un StringBuilder para construir la cadena de forma eficiente
        StringBuilder resultado = new StringBuilder();

        // Recorremos el array y vamos agregando cada número al StringBuilder
        for (int numero : a) {
            resultado.append(numero);
        }

        // Devolvemos la cadena resultante
        return resultado.toString();
    }
}


