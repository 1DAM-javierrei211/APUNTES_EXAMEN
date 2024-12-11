package apuntes_examen;

import java.util.Arrays;
import java.util.Scanner;

public class entregable_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de filas del array: ");
        int filas = teclado.nextInt();
        System.out.println("Introduce el numero de columnas del array: ");
        int columnas = teclado.nextInt();

        int [][] matriz = new int [filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * (78 - 14 + 1)) + 14;
            }
        }

        // Imprimir el array en forma de cuadrado
        for (int i = 0; i < matriz.length; i++) {  // Recorremos las filas
            for (int j = 0; j < matriz[i].length; j++) {  // Recorremos las columnas de cada fila
                System.out.print(matriz[i][j] + "\t");  // Imprimimos el elemento de la matriz con tabulación
            }
            System.out.println();  // Salto de línea después de cada fila
        }
        int [] array_pares = array_pares(matriz);
        System.out.println("Array de los pares "+Arrays.toString(array_pares));
        int [] array_impares = array_impares(matriz);
        System.out.println("Array de los impares "+Arrays.toString(array_impares));

    }
       public static int [] array_pares (int [][] matriz){
       int [] res = {};

           for (int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz[i].length; j++) {
                   if (i%2==0 && j%2==0){
                       res = Arrays.copyOf(res, res.length+1);
                       res [res.length-1]= matriz[i][j];
                   }
               }
           }

        return res;
       }

    public static int [] array_impares (int [][] matriz){
        int [] res = {};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i%2!=0 && j%2!=0){
                    res = Arrays.copyOf(res, res.length+1);
                    res [res.length-1]= matriz[i][j];
                }
            }
        }

        return res;
    }
    }

