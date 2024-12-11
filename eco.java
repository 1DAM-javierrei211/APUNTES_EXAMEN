package apuntes_examen;

import java.util.Scanner;

public class eco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String eco = "eco";

        System.out.println("Cuantas veces quieres que se imprima eco");
        int num_veces = teclado.nextInt();
        imprimir_eco(num_veces, eco);


    }
    public static void imprimir_eco (int num_veces, String eco){
        for (int i = 0; i < num_veces; i++) {
            System.out.println(eco);
        }
    }
}
