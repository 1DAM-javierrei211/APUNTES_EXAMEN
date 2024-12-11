package apuntes_examen;

import java.util.Scanner;

public class entregable_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [][] matriz = {
                {"a","b","c"},
                {"d","e","f"},
                {"g","h","i"}
        };
        System.out.println("La matriz original es: ");
        // Imprimir el array en forma de cuadrado
        for (int i = 0; i < matriz.length; i++) {  // Recorremos las filas
            for (int j = 0; j < matriz[i].length; j++) {  // Recorremos las columnas de cada fila
                System.out.print(matriz[i][j] + "\t");  // Imprimimos el elemento de la matriz con tabulación
            }
            System.out.println();  // Salto de línea después de cada fila
        }

        String [] fila = {"j","k","l"};

        int pos;

        System.out.println("Introduce la posición en la que quieres que se inserte la fila: " );
        pos = teclado.nextInt();
        System.out.println("La matriz despues de que se inserte la fila es ");
        String [][] nueva_matriz = insertarFilaEnMatriz(matriz,fila, pos);
        // Imprimir el array en forma de cuadrado
        for (int i = 0; i < nueva_matriz.length; i++) {  // Recorremos las filas
            for (int j = 0; j < nueva_matriz[i].length; j++) {  // Recorremos las columnas de cada fila
                System.out.print(nueva_matriz[i][j] + "\t");  // Imprimimos el elemento de la matriz con tabulación
            }
            System.out.println();  // Salto de línea después de cada fila
        }
    }
    // Función para insertar una fila en la matriz en la posición indicada
    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {
        // Creamos una nueva matriz con una fila más
        String[][] resultado = new String[matriz.length + 1][matriz[0].length];

        // Copiamos las filas anteriores hasta la posición en la que vamos a insertar la nueva fila
        for (int i = 0; i < pos; i++) {
            resultado[i] = matriz[i];
        }

        // Insertamos la nueva fila en la posición indicada
        resultado[pos] = fila;

        // Copiamos las filas que quedan después de la posición de inserción
        for (int i = pos; i < matriz.length; i++) {
            resultado[i + 1] = matriz[i];
        }

        // Devolvemos la nueva matriz con la fila insertada
        return resultado;
    }


}
