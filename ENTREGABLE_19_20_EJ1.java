package apuntes_examen;

import java.util.Scanner;

public class ENTREGABLE_19_20_EJ1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] mesas = generarMesasAleatorias(10);

        while (true) {
            imprimirEstadoMesas(mesas);
            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            int grupo = teclado.nextInt();

            if (grupo == -1) {
                System.out.println("Gracias. Hasta pronto.");
                break;
            }

            if (grupo < 1 || grupo > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + grupo + ", haga grupos de 4 personas como máximo e intente de nuevo.");

            }

            int mesaAsignada = asignarMesa(mesas, grupo);

            if (mesaAsignada == -1) {
                System.out.println("Lo siento, en estos momentos no queda sitio.");
            } else {
                System.out.println("Por favor, siéntense en la mesa número " + (mesaAsignada + 1) + ".");
            }
        }
    }

    public static int[] generarMesasAleatorias(int cantidad) {
        int[] mesas = new int[cantidad];
        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = (int) (Math.random() * 5); // Ocupación entre 0 y 4
        }
        return mesas;
    }

    public static void imprimirEstadoMesas(int[] mesas) {
        System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
        System.out.print("│Mesa no  │");
        for (int i = 0; i < mesas.length; i++) {
            System.out.printf(" %2d │", i + 1);
        }
        System.out.println("\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
        System.out.print("│Ocupación│");
        for (int ocupacion : mesas) {
            System.out.printf(" %2d │", ocupacion);
        }
        System.out.println("\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    }

    public static int asignarMesa(int[] mesas, int grupo) {
        // Buscar mesa completamente vacía
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 0) {
                mesas[i] = grupo;
                return i;
            }
        }

        // Buscar mesa con espacio suficiente
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] + grupo <= 4) {
                mesas[i] += grupo;
                return i;
            }
        }

        // No hay espacio disponible
        return -1;
    }
}
