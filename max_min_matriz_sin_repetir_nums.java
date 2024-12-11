package apuntes_examen;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class max_min_matriz_sin_repetir_nums {


        public static void main(String[] args) {
            // Crear un array de 5 filas por 9 columnas
            int[][] array = new int[5][9];

            // Rellenar el array con números únicos entre 100 y 1000
            llenarArraySinRepetir(array);

            // Buscar el valor máximo y mínimo en el array y sus posiciones
            int[] maxMinPos = encontrarMaxMin(array);

            // Imprimir el array en forma de cuadrado
            for (int i = 0; i < array.length; i++) {  // Recorremos las filas
                for (int j = 0; j < array[i].length; j++) {  // Recorremos las columnas de cada fila
                    System.out.print(array[i][j] + "\t");  // Imprimimos el elemento de la matriz con tabulación
                }
                System.out.println();  // Salto de línea después de cada fila
            }
            System.out.println();

            // Imprimir el resultado
            System.out.println("Posición del máximo: Fila " + maxMinPos[0] + ", Columna " + maxMinPos[1]);
            System.out.println("Posición del mínimo: Fila " + maxMinPos[2] + ", Columna " + maxMinPos[3]);
        }

        // Función para llenar el array sin números repetidos
        public static void llenarArraySinRepetir(int[][] array) {
            Random rand = new Random();
            Set<Integer> numerosUsados = new HashSet<>();  // Para asegurarnos de que no haya repetidos

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    int numero;
                    do {
                        numero = rand.nextInt(901) + 100;  // Genera un número entre 100 y 1000
                    } while (numerosUsados.contains(numero));  // Si el número ya fue usado, se genera otro

                    array[i][j] = numero;  // Asignar el número al array
                    numerosUsados.add(numero);  // Añadirlo al conjunto de números usados
                }
            }
        }

        // Función para encontrar el valor máximo y mínimo y sus posiciones
        public static int[] encontrarMaxMin(int[][] array) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int maxFila = -1, maxColumna = -1;
            int minFila = -1, minColumna = -1;

            // Recorrer el array para encontrar los valores máximo y mínimo
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                        maxFila = i;
                        maxColumna = j;
                    }
                    if (array[i][j] < min) {
                        min = array[i][j];
                        minFila = i;
                        minColumna = j;
                    }
                }
            }

            // Retornar las posiciones de los valores máximo y mínimo
            return new int[]{maxFila, maxColumna, minFila, minColumna};
        }
}
