package apuntes_examen;
import java.util.Random;
import java.util.Scanner;

public class ej3_entregable_oficial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            // Solicitar al usuario el número de filas y columnas
            System.out.print("Introduce el número de filas: ");
            int filas = scanner.nextInt();
            System.out.print("Introduce el número de columnas: ");
            int columnas = scanner.nextInt();

            // Crear la matriz bidimensional
            int[][] matriz = new int[filas][columnas];

            // Rellenar la matriz con números aleatorios entre 14 y 78
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = 14 + random.nextInt(65);  // 65 porque 78 - 14 + 1 = 65
                }
            }

            // Arrays para almacenar los números pares e impares
            int[] pares = new int[filas * columnas];
            int[] impares = new int[filas * columnas];
            int contPares = 0, contImpares = 0;

            // Extraer los números de las intersecciones
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    // Si la fila es par y la columna es par, lo añadimos al array de pares
                    if (i % 2 == 0 && j % 2 == 0) {
                        pares[contPares++] = matriz[i][j];
                    }
                    // Si la fila es impar y la columna es impar, lo añadimos al array de impares
                    if (i % 2 != 0 && j % 2 != 0) {
                        impares[contImpares++] = matriz[i][j];
                    }
                }
            }

            // Crear los arrays con los tamaños correctos (sin elementos vacíos)
            int[] paresFinales = new int[contPares];
            int[] imparesFinales = new int[contImpares];

            System.arraycopy(pares, 0, paresFinales, 0, contPares);
            System.arraycopy(impares, 0, imparesFinales, 0, contImpares);

            // Mostrar la matriz
            System.out.println("\nMatriz:");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            // Mostrar los arrays de pares e impares
            System.out.println("\nPares:");
            for (int i = 0; i < paresFinales.length; i++) {
                System.out.print(paresFinales[i] + " ");
            }
            System.out.println();

            System.out.println("\nImpares:");
            for (int i = 0; i < imparesFinales.length; i++) {
                System.out.print(imparesFinales[i] + " ");
            }
            System.out.println();

            // Sumar, calcular la media, máximo y mínimo de los arrays pares e impares
            calcularEstadisticas(paresFinales, "pares");
            calcularEstadisticas(imparesFinales, "impares");
        }

        // Función para calcular la suma, media, máximo y mínimo
        public static void calcularEstadisticas(int[] array, String tipo) {
            if (array.length == 0) {
                System.out.println("No hay " + tipo + " en la matriz.");
                return;
            }

            int suma = 0;
            int max = array[0];
            int min = array[0];

            for (int num : array) {
                suma += num;
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }

            int media = suma / array.length;

            // Mostrar los resultados
            System.out.println("Suma de " + tipo + ": " + suma);
            System.out.println("Media de " + tipo + ": " + media);
            System.out.println("Máximo de " + tipo + ": " + max);
            System.out.println("Mínimo de " + tipo + ": " + min);
        }
}
