package apuntes_examen;

public class Imprimir_array_forma_cuadrado {
    public static void main(String[] args) {
        // Definir el array bidimensional
        int[][] a = {
                {45, 92, 14, 20, 25, 78},
                {35, 72, 24, 45, 42, 60},
                {97, 65, 83, 71, 36, 12},
                {32, 42, 64, 23, 41, 39},
                {98, 45, 94, 11, 18, 48}
        };

        // Imprimir el array en forma de cuadrado
        for (int i = 0; i < a.length; i++) {  // Recorremos las filas
            for (int j = 0; j < a[i].length; j++) {  // Recorremos las columnas de cada fila
                System.out.print(a[i][j] + "\t");  // Imprimimos el elemento de la matriz con tabulación
            }
            System.out.println();  // Salto de línea después de cada fila
        }
    }
}
