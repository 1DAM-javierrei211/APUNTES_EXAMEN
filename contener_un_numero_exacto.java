package apuntes_examen;

public class contener_un_numero_exacto {
    public static void main(String[] args) {
        int[] x = {4, 22, 44, 482, 45, 33, 440};  // Array de ejemplo
        int[] resultado = filtraCon4(x);
        System.out.println("Contienen el numero 4");
        // Mostrar el resultado
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }

    // Función que filtra los números que contienen el dígito "4"
    public static int[] filtraCon4(int[] x) {
        // Contar cuántos números contienen el dígito "4"
        int contador = 0;

        // Usamos un for extendido para contar cuántos números contienen el "4"
        for (int i = 0; i < x.length; i++) {  // Iteramos con el índice
            if (contieneCuatro(x[i])) {  // Comprobamos si el número en x[i] contiene "4"
                contador++;  // Aumentamos el contador si contiene "4"
            }
        }

        // Si no se encuentra ningún número con "4", devolver [-1]
        if (contador == 0) {
            return new int[] {-1};
        }

        // Crear el array de resultado con la cantidad necesaria
        int[] resultado = new int[contador];
        int index = 0;

        // Llenar el array resultado con los números que contienen "4"
        for (int i = 0; i < x.length; i++) {  // Iteramos nuevamente con el índice
            if (contieneCuatro(x[i])) {  // Si el número contiene "4"
                resultado[index++] = x[i];  // Lo agregamos al resultado
            }
        }

        return resultado;
    }

    // Función que verifica si un número contiene el dígito "4"
    public static boolean contieneCuatro(int num) {
        while (num > 0) {
            if (num % 10 == 4) {  // Comprobamos si el último dígito es "4"
                return true;  // Si encontramos un "4", devolvemos true
            }
            num /= 10;  // Eliminamos el último dígito
        }
        return false;  // Si no encontramos un "4", devolvemos false
    }
}
