package apuntes_examen;

public class convertir_nums_a_textos_especificos {
    public static void main(String[] args) {
        // Ejemplo de uso de la función
        int numero = 213;
        String resultado = convierteEnMorse(numero);
        System.out.println("Número " + numero + " en Morse: " + resultado);

        // Otro ejemplo
        numero = 789;
        resultado = convierteEnMorse(numero);
        System.out.println("Número " + numero + " en Morse: " + resultado);
    }

    // Función que convierte un número en su equivalente en Morse
    public static String convierteEnMorse(int n) {
        // Tabla de símbolos en Morse para los dígitos del 0 al 9
        String[] morse = {
                "_ _ _ _ _", // 0
                ". _ _ _ _", // 1
                ". . _ _ _", // 2
                ". . . _ _", // 3
                ". . . . _", // 4
                ". . . . .", // 5
                "_ . . . .", // 6
                "_ _ . . .", // 7
                "_ _ _ . .", // 8
                "_ _ _ _ ."  // 9
        };

        // Convertir el número a cadena
        String nStr = String.valueOf(n);

        // Usar un StringBuilder para construir la cadena de Morse
        StringBuilder morseCode = new StringBuilder();

        // Iterar sobre cada dígito del número
        for (int i = 0; i < nStr.length(); i++) {
            // Convertir el dígito a entero
            int digit = Character.getNumericValue(nStr.charAt(i));

            // Agregar la representación en Morse del dígito al StringBuilder
            morseCode.append(morse[digit]);

            // Agregar un espacio entre los caracteres Morse
            if (i < nStr.length() - 1) {
                morseCode.append(" ");
            }
        }

        // Convertir el StringBuilder a cadena y devolver el resultado
        return morseCode.toString();
    }
}
