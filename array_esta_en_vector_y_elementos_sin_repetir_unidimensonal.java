package apuntes_examen;

public class array_esta_en_vector_y_elementos_sin_repetir_unidimensonal {
    public static void main(String[] args) {

        System.out.println("Este es el ejemplo 1");
        // Ejemplo 1
        int[] v1 = {1, 2, 3};
        int[] v2 = {4, 5, 6};
        int[] resultado = unirSinRepetidos(v1, v2);
        mostrarArray(resultado);

        System.out.println();
        System.out.println("Este es el ejemplo 2");
        // Ejemplo 2
        int[] v1_2 = {1, 2, 3};
        int[] v2_2 = {3, 2, 5};
        int[] resultado2 = unirSinRepetidos(v1_2, v2_2);
        mostrarArray(resultado2);
    }

    // Función que verifica si un número está en un array
    public static boolean esta(int[] vector, int num) {
        // Recorremos el array para ver si el número está presente
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                return true;  // Si encontramos el número, retornamos true
            }
        }
        return false;  // Si no encontramos el número, retornamos false
    }

    // Función que une dos arrays sin elementos repetidos
    public static int[] unirSinRepetidos(int[] v1, int[] v2) {
        // Primero, creamos un array suficientemente grande para los dos arrays
        int[] resultado = new int[v1.length + v2.length];
        int index = 0;

        // Agregamos los elementos de v1 al resultado
        for (int i = 0; i < v1.length; i++) {
            resultado[index++] = v1[i];
        }

        // Agregamos los elementos de v2 al resultado, solo si no están ya en v1
        for (int i = 0; i < v2.length; i++) {
            if (!esta(v1, v2[i])) {  // Usamos la función 'esta' para evitar duplicados
                resultado[index++] = v2[i];
            }
        }

        // Creamos un array final con el tamaño exacto de los elementos válidos
        int[] finalResult = new int[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = resultado[i];
        }

        return finalResult;
    }

    // Función para mostrar el array por pantalla
    public static void mostrarArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
