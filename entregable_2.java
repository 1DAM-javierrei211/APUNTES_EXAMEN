package apuntes_examen;

import java.util.Arrays;
import java.util.Scanner;

public class entregable_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

     int []   v1 = {1,2,3,4,5,6};
     int []   v2 = {4,9,12,5,7};
     int pos;

        System.out.println("Introduce la posición en el que quieres que se inserte el vector: ");
        pos = teclado.nextInt();



        System.out.println(Arrays.toString(insertarEnVector(v1,v2,pos)));


    }
    public static int[] insertarEnVector(int[] v1, int [] v2, int pos){
       int [] resultado = {};
        if (pos<0){
            for (int i = 0; i < v1.length; i++) {
                resultado = Arrays.copyOf(resultado, resultado.length+1);
                resultado[resultado.length-1]= v1[i];
            }
        } else if (pos>=7){
            for (int i = pos- v2.length; i < v2.length; i++) {
                resultado = Arrays.copyOf(resultado, resultado.length+1);
                resultado[resultado.length-1]= v2[i];
            }
        } else {
            for (int i = 0; i < pos; i++) {
                resultado = Arrays.copyOf(resultado, resultado.length+1);
                resultado[resultado.length-1]= v1[i];
            }
            for (int i = 0; i < v2.length; i++) {
                resultado = Arrays.copyOf(resultado, resultado.length+1);
                resultado[resultado.length-1]= v2[i];
            }
            for (int i = pos; i < v1.length; i++) {
                resultado = Arrays.copyOf(resultado, resultado.length+1);
                resultado[resultado.length-1]= v1[i];
            }
        }


        return resultado;
    }

}
