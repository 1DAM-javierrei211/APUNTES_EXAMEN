package apuntes_examen;

public class ej2_entregable_oficial_hecho_con_funcione {
    public static void main(String[] args) {
        // Ejemplo 1
        int[] v1 = {1, 2, 3, 4, 5, 6};
        int[] v2 = {4, 9, 12, 5, 7};
        int pos = 2;

        // Llamada a la función e impresión del resultado
        int[] resultado1 = insertarEnVector(v1, v2, pos);
        System.out.print("Resultado 1: ");
        for (int i = 0; i < resultado1.length; i++) {
            System.out.print(resultado1[i] + " ");
        }
        System.out.println();

        // Ejemplo 2
        int[] v3 = {6, 12, 8, 9, 3, 13};
        int[] v4 = {13, 11, 4, 8, 6, 1};
        int pos2 = -1;

        // Llamada a la función e impresión del resultado
        int[] resultado2 = insertarEnVector(v3, v4, pos2);
        System.out.print("Resultado 2: ");
        for (int i = 0; i < resultado2.length; i++) {
            System.out.print(resultado2[i] + " ");
        }
        System.out.println();

        // Ejemplo 3
        int[] v5 = {6, 12, 8, 9, 3, 13};
        int[] v6 = {13, 11, 4, 8, 6, 1};
        int pos3 = 7;

        // Llamada a la función e impresión del resultado
        int[] resultado3 = insertarEnVector(v5, v6, pos3);
        System.out.print("Resultado 3: ");
        for (int i = 0; i < resultado3.length; i++) {
            System.out.print(resultado3[i] + " ");
        }
    }

    // Función que inserta v2 en v1 en la posición pos
    public static int[] insertarEnVector(int[] v1, int[] v2, int pos) {
        // Si la posición es menor que 0, devolver solo el array v1
        if (pos < 0) {
            return v1;
        }

        // Si la posición es mayor que la longitud de v1, devolver solo el array v2
        if (pos > v1.length) {
            return v2;
        }

        // Si la posición es igual a la longitud de v1, se añade v2 al final de v1
        if (pos == v1.length) {
            int[] result = new int[v1.length + v2.length];
            // Copiar los elementos de v1
            for (int i = 0; i < v1.length; i++) {
                result[i] = v1[i];
            }
            // Copiar los elementos de v2
            for (int i = 0; i < v2.length; i++) {
                result[v1.length + i] = v2[i];
            }
            return result;
        }

        // Si la posición está en medio, insertar v2 en la posición dada
        int[] result = new int[v1.length + v2.length];
        // Copiar los elementos de v1 antes de la posición
        for (int i = 0; i < pos; i++) {
            result[i] = v1[i];
        }
        // Copiar los elementos de v2
        for (int i = 0; i < v2.length; i++) {
            result[pos + i] = v2[i];
        }
        // Copiar los elementos de v1 después de la posición
        for (int i = pos; i < v1.length; i++) {
            result[pos + v2.length + i - pos] = v1[i];
        }

        return result;
    }
}
