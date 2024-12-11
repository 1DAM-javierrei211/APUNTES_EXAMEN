package apuntes_examen;

public class unir_dos_numeros_formar_uno {
    public static void main(String[] args) {
        // Ejemplo 1
        long numero1 = 123;
        long numero2 = 456;
        long resultado1 = juntaNumeros(numero1, numero2);
        System.out.println("Resultado de juntar " + numero1 + " y " + numero2 + ": " + resultado1);

        // Ejemplo 2
        long numero3 = 78;
        long numero4 = 9001;
        long resultado2 = juntaNumeros(numero3, numero4);
        System.out.println("Resultado de juntar " + numero3 + " y " + numero4 + ": " + resultado2);

        // Ejemplo 3 con números más grandes
        long numero5 = 98765432;
        long numero6 = 1234567890;
        long resultado3 = juntaNumeros(numero5, numero6);
        System.out.println("Resultado de juntar " + numero5 + " y " + numero6 + ": " + resultado3);
    }

    // Función que junta dos números para formar uno
    public static long juntaNumeros(long a, long b) {
        // Convertir ambos números a cadenas
        String acadena = String.valueOf(a);
        String bcadena = String.valueOf(b);

        // Concatenar las cadenas
        String resultadoStr = acadena + bcadena;

        // Convertir la cadena concatenada de vuelta a un número
        long resultado = Long.parseLong(resultadoStr);

        return resultado;
    }
}
