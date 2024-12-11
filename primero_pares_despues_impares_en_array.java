package apuntes_examen;

import java.util.Random;

public class primero_pares_despues_impares_en_array {
        public static void main(String[] args) {
            // Crear un array de 10 elementos
            int[] array = new int[10];

            // Rellenar el array con números aleatorios entre 12 y 89
            Random rand = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(78) + 12; // Genera números entre 12 y 89
            }

            // parte de arriba del array
            System.out.print("Array original:\n[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(i);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            /*imprime array original*/
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            // Crear un array para almacenar los números pares y otro para los impares
            int[] pares = new int[10];
            int[] impares = new int[10];

            int indexPares = 0;
            int indexImpares = 0;

            // Separar los números pares e impares
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    pares[indexPares++] = array[i];
                } else {
                    impares[indexImpares++] = array[i];
                }
            }

            // Crear un nuevo array para juntar los pares al principio y los impares al final
            int[] resultado = new int[10];
            int j = 0;

            // Añadir los pares al principio
            for (int i = 0; i < indexPares; i++) {
                resultado[j++] = pares[i];
            }

            // Añadir los impares al final
            for (int i = 0; i < indexImpares; i++) {
                resultado[j++] = impares[i];
            }

            // Mostrar el array resultante con los índices
            System.out.print("\nArray nuevo:\n[");
            for (int i = 0; i < resultado.length; i++) {
                System.out.print(i);
                if (i < resultado.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            System.out.print("[");
            for (int i = 0; i < resultado.length; i++) {
                System.out.print(resultado[i]);
                if (i < resultado.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
}
