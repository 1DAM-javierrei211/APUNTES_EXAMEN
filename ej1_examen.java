package apuntes_examen;

import java.util.Arrays;

public class ej1_examen {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int [] res = pares_impares(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(res));

    }
    public static int [] pares_impares (int [] array){
        int[] resultado = new int [array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                resultado [index++]= array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0){
                resultado [index++]= array[i];
            }
        }

        return resultado;
    }
}
