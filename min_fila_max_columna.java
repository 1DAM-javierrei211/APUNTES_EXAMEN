package apuntes_examen;
import java.util.Random;
import java.util.Scanner;

public class min_fila_max_columna {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario el número de filas y columnas
            System.out.print("Introduce el número de filas: ");
            int filas = scanner.nextInt();
            System.out.print("Introduce el número de columnas: ");
            int columnas = scanner.nextInt();

            // Crear la matriz de enteros
            int[][] matriz = new int[filas][columnas];

            // Llenar la matriz con números aleatorios entre 11 y 1003
            Random rand = new Random();
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = rand.nextInt(993) + 11; // Aleatorio entre 11 y 1003
                }
            }

            // Imprimir la matriz
            System.out.println("Matriz generada:");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }

            // Comprobar si cada elemento es un punto de silla
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (esPuntoDeSilla(matriz, i, j)) {
                        System.out.println("El número " + matriz[i][j] + " en la posición (" + i + "," + j + ") es un punto de silla.");
                    }
                }
            }


        }

        // Función que verifica si un elemento en la matriz es un punto de silla
        public static boolean esPuntoDeSilla(int[][] x, int i, int j) {
            int elemento = x[i][j];

            // Verificar si es el mínimo en su fila
            boolean esMinimoEnFila = true;
            for (int col = 0; col < x[i].length; col++) {
                if (x[i][col] < elemento) {
                    esMinimoEnFila = false;
                    break;
                }
            }

            // Verificar si es el máximo en su columna
            boolean esMaximoEnColumna = true;
            for (int fila = 0; fila < x.length; fila++) {
                if (x[fila][j] > elemento) {
                    esMaximoEnColumna = false;
                    break;
                }
            }

            // Si es el mínimo en su fila y el máximo en su columna, es un punto de silla
            return esMinimoEnFila && esMaximoEnColumna;
        }
    }

