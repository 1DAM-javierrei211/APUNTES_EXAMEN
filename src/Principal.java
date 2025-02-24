package apuntes_examen.src;

public class Principal {
    public static void main(String[] args) {
        RegistroLibros registro = new RegistroLibros(5);

        // Agregamos libros
        registro.agregarLibro("hola", "George Orwell");
        registro.agregarLibro("Cien años de soledad", "Gabriel García Márquez");
        registro.agregarLibro("El Principito", "Antoine de Saint-Exupéry");

        // Buscamos un libro
        System.out.println("¿Está 'hola' en el registro? " + registro.buscaLibro("hola"));

        // Guardamos en archivo
        registro.cargarRegistroAFichero();

        // Cargamos desde archivo
        RegistroLibros nuevoRegistro = new RegistroLibros(5);
        nuevoRegistro.cargarRegistroDesdeFichero("registro.txt");

        // Probamos la excepción
        try {
            registro.agregarLibro("El código Da Vinci", "Dan Brown2");
        } catch (Exception e) {
            System.out.println("Error capturado en main: " + e.getMessage());
        }
    }
}