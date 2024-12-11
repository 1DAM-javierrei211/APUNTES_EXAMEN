package apuntes_examen;

import java.util.Random;

public class esquina_inferior_izquierda_a_esquina_superior_derecha {
    public static void main(String[] args) {
        // Definir el tamaño del array
        int filas = 9;
        int columnas = 9;

        // Crear el array bidimensional
        int[][] array = new int[filas][columnas];

        // Rellenar el array con números aleatorios entre 500 y 900
        Random random = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = random.nextInt(401) + 500; // Genera números entre 500 y 900
            }
        }

        // Mostrar el array completo
        System.out.println("Array generado:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar la diagonal desde la esquina inferior izquierda a la esquina superior derecha
        System.out.println("\nDiagonal de la esquina inferior izquierda a la esquina superior derecha:");
        int max = array[filas - 1][0];
        int min = array[filas - 1][0];
        int suma = 0;
        int count = 0;

        // Recorrer la diagonal
        for (int i = 0; i < filas; i++) {
            int valorDiagonal = array[filas - 1 - i][i];
            System.out.print(valorDiagonal + "\t");

            // Calcular el máximo, mínimo y la suma de los valores de la diagonal
            if (valorDiagonal > max) {
                max = valorDiagonal;
            }
            if (valorDiagonal < min) {
                min = valorDiagonal;
            }
            suma += valorDiagonal;
            count++;
        }

        // Calcular la media
        int media = (int) suma / count;

        // Mostrar los resultados
        System.out.println("\n\nMáximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + (int) media); // Despreciamos los decimales
    }
}
