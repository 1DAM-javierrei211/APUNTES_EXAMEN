package apuntes_examen;

public class corteza_del_array {
    public static void main(String[] args) {
        // Ejemplo de array bidimensional
        int[][] a = {
                {45, 92, 14, 20, 25, 78},
                {35, 72, 24, 45, 42, 60},
                {32, 42, 64, 23, 41, 39},
                {98, 45, 94, 11, 18, 48}
        };

        for (int i = 0; i < a.length; i++) {  // Recorremos las filas
            for (int j = 0; j < a[i].length; j++) {  // Recorremos las columnas de cada fila
                System.out.print(a[i][j] + "\t");  // Imprimimos el elemento de la matriz con tabulación
            }
            System.out.println();  // Salto de línea después de cada fila
        }

        System.out.println();

        // Llamar a la función corteza y mostrar el resultado
        int[] resultado = corteza(a);
        System.out.print("Corteza: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }

    // Función para extraer la capa exterior de una matriz bidimensional
    public static int[] corteza(int[][] n) {
        // Obtener las dimensiones de la matriz
        int filas = n.length;
        int columnas = n[0].length;

        // Crear un array para almacenar la capa exterior
        int[] capa = new int[2 * (filas + columnas) - 4]; // Fórmula para el número de elementos en la capa exterior

        int index = 0;

        // Recorrer la capa exterior en sentido de las agujas del reloj
        // 1. Primera fila
        for (int j = 0; j < columnas; j++) {
            capa[index++] = n[0][j]; // Primera fila
        }

        // 2. Última columna (sin contar la primera fila)
        for (int i = 1; i < filas; i++) {
            capa[index++] = n[i][columnas - 1]; // Última columna
        }

        // 3. Última fila (sin contar la última columna)
        if (filas > 1) { // Verificar si hay más de una fila
            for (int j = columnas - 2; j >= 0; j--) {
                capa[index++] = n[filas - 1][j]; // Última fila
            }
        }

        // 4. Primera columna (sin contar la primera fila ni la última fila)
        if (columnas > 1) { // Verificar si hay más de una columna
            for (int i = filas - 2; i > 0; i--) {
                capa[index++] = n[i][0]; // Primera columna
            }
        }

        return capa;
    }
}
