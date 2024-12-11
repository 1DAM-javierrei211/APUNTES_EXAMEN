package apuntes_examen;

public class coger_cuadrado_dentro_cuadrado {
    public static void main(String[] args) {
        // Definir el array bidimensional
        int[][] a = {
                {45, 92, 14, 20, 25, 78},
                {35, 72, 24, 45, 42, 60},
                {97, 65, 83, 71, 36, 12},
                {32, 42, 64, 23, 41, 39},
                {98, 45, 94, 11, 18, 48}
        };

        // Llamar a la función subcorteza
        int[] resultado = subcorteza(a);

        // Mostrar el resultado
        System.out.println("Array unidimensional extraído:");
        for (int i : resultado) {
            System.out.print(i + " ");
        }
    }

    public static int[] subcorteza(int[][] n) {
        // Verificar que la matriz es suficientemente grande
        if (n.length < 3 || n[0].length < 3) {
            throw new IllegalArgumentException("La matriz debe ser de al menos 3x3.");
        }

        // Cálculo del número total de elementos de la capa siguiente
        int totalElements = 2 * (n.length - 2 + n[0].length - 2); // Fórmula para contar los elementos de la capa siguiente
        int[] resultado = new int[totalElements];
        int index = 0;

        // Recorrer la capa siguiente en sentido horario
        // Parte superior (segunda fila, de izquierda a derecha)
        for (int i = 1; i < n[0].length - 1; i++) {
            resultado[index++] = n[1][i];
        }

        // Columna derecha (de arriba a abajo, desde la segunda fila hasta la penúltima fila)
        for (int i = 1; i < n.length - 1; i++) {
            resultado[index++] = n[i][n[0].length - 2];
        }

        // Parte inferior (penúltima fila, de derecha a izquierda)
        for (int i = n[0].length - 2; i > 0; i--) {
            resultado[index++] = n[n.length - 2][i];
        }

        // Columna izquierda (de abajo hacia arriba, desde la penúltima fila hasta la segunda fila)
        for (int i = n.length - 2; i > 0; i--) {
            resultado[index++] = n[i][0];
        }

        return resultado;
    }
}
