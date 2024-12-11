package apuntes_examen;

import java.util.Scanner;

public class numeros_comprendidos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero para empezar");
        int inicio = teclado.nextInt();
        System.out.println("Introduce un numero para terminar");
        int fin = teclado.nextInt();
        comprendidos(inicio, fin);


    }
    public static void comprendidos (int inicio, int fin){
        System.out.println("Los numeros comprendidos entre "+inicio+" "+ fin+" son: ");
        for (int i = inicio+1; i < fin; i++) {
            System.out.print(i+", ");
        }

    }
}
