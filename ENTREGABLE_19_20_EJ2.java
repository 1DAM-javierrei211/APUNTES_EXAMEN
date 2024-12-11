package apuntes_examen;

import java.util.Scanner;

public class ENTREGABLE_19_20_EJ2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] numeros = new int[4][5];

        // Solicitar 20 números al usuario
        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Número [" + (i + 1) + "][" + (j + 1) + "]: ");
                numeros[i][j] = teclado.nextInt();
            }
        }

        // Mostrar la matriz con sumas parciales
        imprimirMatrizConSumas(numeros);
    }

    public static void imprimirMatrizConSumas(int[][] matriz) {
        int[] sumaFilas = new int[4];
        int[] sumaColumnas = new int[5];
        int sumaTotal = 0;

        System.out.println("\nTabla con sumas parciales:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%5d", matriz[i][j]);
                sumaFilas[i] += matriz[i][j];

                sumaColumnas[j] += matriz[i][j];
                sumaTotal += matriz[i][j];
            }
            System.out.printf(" |%5d\n", sumaFilas[i]);
        }

        // Imprimir sumas de columnas
        for (int j = 0; j < 5; j++) {
            System.out.printf("%5d", sumaColumnas[j]); /* porcentaje 5 es un espacio entre las filas */ /*el ln es para saltar de linea*/
        }
        System.out.printf(" |%5d\n", sumaTotal);
    }
}
