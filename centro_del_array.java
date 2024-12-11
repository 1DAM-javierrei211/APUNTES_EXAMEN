package apuntes_examen;

public class centro_del_array {

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

        // Llamar a la función centro y mostrar el resultado
        int[] resultado = centro(a);
        System.out.print("Centro: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }

    // Función para obtener el centro de la matriz
    public static int[] centro(int[][] n) {
        int filas = n.length;
        int columnas = n[0].length;

        int[] centroArray;

        // Si la matriz tiene un número impar de filas y columnas, hay un único valor en el centro
        if (filas % 2 != 0 && columnas % 2 != 0) {
            centroArray = new int[1];
            centroArray[0] = n[filas / 2][columnas / 2];
        } else {
            // Si la matriz tiene un número par de filas o columnas, hay un conjunto de valores centrales
            // En este caso, se tomarían los cuatro elementos centrales.
            // Ajusta esto según cómo quieras manejar matrices con dimensiones pares.

            // Caso cuando hay 4 elementos centrales
            centroArray = new int[4];
            centroArray[0] = n[filas / 2 - 1][columnas / 2 - 1];
            centroArray[1] = n[filas / 2 - 1][columnas / 2];
            centroArray[2] = n[filas / 2][columnas / 2 - 1];
            centroArray[3] = n[filas / 2][columnas / 2];
        }

        return centroArray;
    }
}
