package apuntes_examen;

import java.util.Arrays;
import java.util.Scanner;

public class ej1_examen2021_mezcla {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la longitud del primer vector ");
        int long_v1 = teclado.nextInt();
        System.out.println("Introduce la longitud del segundo vector ");
        int long_v2 = teclado.nextInt();


        int [] v1 = new int[long_v1];
        int [] v2 = new int[long_v2];

        for (int i = 0; i < long_v1; i++) {
            v1[i]= (int) (Math.random() * (9 - 1 + 1)) + 1;
        }

        for (int i = 0; i < long_v2; i++) {
            v2[i]= (int) (Math.random() * (9 - 1 + 1)) + 1;
        }

        System.out.println("El primer array es: "+ Arrays.toString(v1));
        System.out.println("El segundo array es: "+ Arrays.toString(v2));

        System.out.println("El array unidos es "+ Arrays.toString(mezcla(v1, v2)));

    }
    public static int[] mezcla(int[] v1, int[] v2){
         int contador_A = 0;
            int contador_B = 0;
            int contador_general = 0;

            // Crear el array de resultado con el tamaño total
            int[] res = new int[v1.length + v2.length];

            // Alternar elementos de v1 y v2
            while (contador_A < v1.length || contador_B < v2.length) {
                if (contador_A < v1.length) {
                    res[contador_general++] = v1[contador_A++];
                }
                if (contador_B < v2.length) {
                    res[contador_general++] = v2[contador_B++];
                }
            }

            return res;
        }


}
