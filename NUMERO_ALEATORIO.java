package apuntes_examen;

import java.util.Random;

public class NUMERO_ALEATORIO {
    public static void main(String[] args) {
        // Ejemplo 1
        int[] a = {111, 222, 333, 444};
        System.out.println("Número aleatorio de a: " + aleatorioDeArray(a));

        // Ejemplo 2
        int[] b = {52, 37};
        System.out.println("Número aleatorio de b: " + aleatorioDeArray(b));
    }



    // Función que devuelve un número aleatorio del array
    public static int aleatorioDeArray(int[] a) {
        // Comprobamos que el array no esté vacío
        if (a.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }

        // Crear una instancia de la clase Random
        Random rand = new Random();

        // Generar un índice aleatorio entre 0 y el tamaño del array - 1
        int indiceAleatorio = rand.nextInt(a.length);

        // Devolver el número en el índice aleatorio
        return a[indiceAleatorio];
    }
}
