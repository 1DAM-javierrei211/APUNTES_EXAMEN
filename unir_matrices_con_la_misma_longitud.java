package apuntes_examen;

public class unir_matrices_con_la_misma_longitud {
    public static void main(String[] args) {
        // Ejemplo 1
        String[][] matriz1 = {
                {"HOLA", "PERRO", "C++"},
                {"ADIOS", "GATO", "PYTHON"},
                {"HASTALUEGO", "VACA", "JAVA"}
        };

        String[][] matriz2 = {
                {"BD", "SOBRESALIENTE", "PEPE"},
                {"LM", "NOTABLE", "MANUEL"},
                {"PROG", "APROBADO", "ROSA"}
        };

        // Ejemplo 2
        String[][] matriz3 = {
                {"HOLA", "PERRO", "C++"},
                {"ADIOS", "GATO", "PYTHON"},
                {"HASTALUEGO", "VACA", "JAVA"}
        };

        String[][] matriz4 = {
                {"BD", "SOBRESALIENTE"},
                {"LM", "NOTABLE"},
                {"PROG", "APROBADO"}
        };

        // Unir matrices y mostrar resultados
        String[][] resultado1 = unirMatrices(matriz1, matriz2);
        String[][] resultado2 = unirMatrices(matriz3, matriz4);

        // Imprimir resultados
        System.out.println("Resultado de unir las matrices 1 y 2:");
        imprimirMatriz(resultado1);

        System.out.println("\nResultado de unir las matrices 3 y 4:");
        imprimirMatriz(resultado2);
    }

    // Función para unir dos matrices de cadenas
    public static String[][] unirMatrices(String[][] matriz1, String[][] matriz2) {
        // Verificamos si las matrices tienen las mismas dimensiones
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            // Si las dimensiones no coinciden, devolvemos una matriz vacía
            return new String[0][0];
        }

        // Si tienen la misma dimensión, creamos una nueva matriz con el doble de columnas
        int filas = matriz1.length;
        int columnas = matriz1[0].length + matriz2[0].length;
        String[][] resultado = new String[filas][columnas];

        // Unir las dos matrices
        for (int i = 0; i < filas; i++) {
            // Copiar los elementos de la primera matriz
            for (int j = 0; j < matriz1[0].length; j++) {
                resultado[i][j] = matriz1[i][j];
            }
            // Copiar los elementos de la segunda matriz
            for (int j = 0; j < matriz2[0].length; j++) {
                resultado[i][matriz1[0].length + j] = matriz2[i][j];
            }
        }

        return resultado;
    }

    // Función para imprimir una matriz
    public static void imprimirMatriz(String[][] matriz) {
        if (matriz.length == 0) {
            System.out.println("{}");
            return;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
