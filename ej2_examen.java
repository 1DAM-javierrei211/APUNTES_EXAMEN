package apuntes_examen;

import java.util.Arrays;

public class ej2_examen {
    public static void main(String[] args) {
        int[] numeros = {12, 14, 23, 12, 67, 81};

        int[] resultado = vector_sin_repetidos(numeros);

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(resultado));
    }

    public static int[] vector_sin_repetidos(int[] array_numeros) {
        int[] resultado = {};
        for (int i = 0; i < array_numeros.length; i++) {
            if (!esta(array_numeros[i], resultado)) {
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = array_numeros[i];
            }
        }
        System.out.println(Arrays.toString(resultado));
        return resultado;
    }

    public static boolean esta(int numero, int[] array) {
        boolean resultado = false;
        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                resultado = true;
            }
        }
        return resultado;
    }
    }





