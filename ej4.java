import java.util.Arrays;
import java.util.Scanner;


    public class ej4 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce una cadena de caracteres");
            String cadena = "Hola que tal estás hoy mar";

            for (String[] fila : matrizLetras(cadena)) {
                System.out.println(Arrays.toString(fila));
            }

        }

        public static String[][] matrizLetras(String cadena) {
            int cont = 0;
            cadena = cadena.replaceAll(" ", "");
            int filas = (int) Math.ceil(cadena.length() / 5.0);
            System.out.println(filas);

            String[][] res = new String[filas][5];

            System.out.println(cadena);

            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[i].length; j++) {
                    if (cont < cadena.length()) {
                        res[i][j] = String.valueOf(cadena.charAt(cont++));
                    } else {
                        res[i][j] = "";
                    }

                }
            }

            return res;
        }
    }

