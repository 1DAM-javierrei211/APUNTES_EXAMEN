package apuntes_examen;

import java.util.Random;

public class tabla_de_paises_max_med_min {
    public static void main(String[] args) {
        // Array con los nombres de los países
        String[] pais = {"España", "Rusia", "Japón", "Australia"};

        // Array de estaturas aleatorias (4 filas, 10 columnas)
        int[][] estaturas = new int[4][10];

        // Generación de datos aleatorios para las estaturas (entre 140 y 210 cm)
        Random random = new Random();
        for (int i = 0; i < estaturas.length; i++) {
            for (int j = 0; j < estaturas[i].length; j++) {
                estaturas[i][j] = 140 + random.nextInt(71); // 140 a 210 (71 es el rango de números aleatorios)
            }
        }

        // Mostrar las estaturas de cada país
        for (int i = 0; i < pais.length; i++) {
            System.out.print(pais[i] + ": ");
            for (int j = 0; j < estaturas[i].length; j++) {
                System.out.print(estaturas[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de mostrar las estaturas de un país
        }

        // Calcular la media, la estatura mínima y la máxima para cada país
        for (int i = 0; i < pais.length; i++) {
            int suma = 0;
            int minimo = estaturas[i][0];
            int maximo = estaturas[i][0];

            // Calcular la suma, mínima y máxima
            for (int j = 0; j < estaturas[i].length; j++) {
                suma += estaturas[i][j];
                if (estaturas[i][j] < minimo) {
                    minimo = estaturas[i][j];
                }
                if (estaturas[i][j] > maximo) {
                    maximo = estaturas[i][j];
                }
            }

            // Calcular la media (despreciando decimales)
            int media = suma / estaturas[i].length;

            // Mostrar los resultados para cada país
            System.out.println("\nEstadísticas para " + pais[i] + ":");
            System.out.println("Media: " + media + " cm");
            System.out.println("Mínima: " + minimo + " cm");
            System.out.println("Máxima: " + maximo + " cm");
        }
    }

}
