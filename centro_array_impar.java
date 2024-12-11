package apuntes_examen;

public class centro_array_impar {
    public static void main(String[] args) {
        // Ejemplo de array bidimensional de tamaño impar
        int[][] a = {
                {45, 92, 14, 20, 25},
                {35, 72, 24, 45, 42},
                {32, 42, 64, 23, 41},
                {98, 45, 94, 11, 18},
                {51, 22, 63, 31, 59}
        };

        for (int i = 0; i < a.length; i++) {  // Recorremos las filas
            for (int j = 0; j < a[i].length; j++) {  // Recorremos las columnas de cada fila
                System.out.print(a[i][j] + "\t");  // Imprimimos el elemento de la matriz con tabulación
            }
            System.out.println();  // Salto de línea después de cada fila
        }

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
            // En caso de que no sea impar, puedes manejar como desees, por ejemplo:
            // Agregar más condiciones si las dimensiones son pares.
            centroArray = new int[0];  // Aquí solo para tener un comportamiento predeterminado.
        }

        return centroArray;
    }
}
