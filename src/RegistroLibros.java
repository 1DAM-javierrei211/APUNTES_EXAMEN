package apuntes_examen.src;


    // Clase RegistroLibros que almacena un array de libros
    class RegistroLibros {
        private Libro[] libros;
        private int cantidadLibros;

        public RegistroLibros(int maxLibros) {
            libros = new Libro[maxLibros];
            cantidadLibros = 0;
        }

        public boolean agregarLibro(String titulo, String autor) {
            if (cantidadLibros >= libros.length) return false;
            try {
                libros[cantidadLibros++] = new Libro(titulo, autor);
                return true;
            } catch (InvalidBookException e) {
                System.out.println("Error: " + e.getMessage());
                return false;
            }
        }

        public boolean buscaLibro(String titulo) {
            for (int i = 0; i < cantidadLibros; i++) {
                if (libros[i].toString().startsWith(titulo + ":")) return true;
            }
            return false;
        }

        public void cargarRegistroDesdeFichero(String nombreArchivo) {
            try (java.util.Scanner scanner = new java.util.Scanner(new java.io.File(nombreArchivo))) {
                while (scanner.hasNextLine() && cantidadLibros < libros.length) {
                    String linea = scanner.nextLine();
                    String[] partes = linea.split(": ");
                    if (partes.length == 2) {
                        agregarLibro(partes[0], partes[1]);
                    }
                }
            } catch (java.io.FileNotFoundException e) {
                System.out.println("Error: Archivo no encontrado.");
            }
        }

        public void cargarRegistroAFichero(String nombreArchivo) {
            try (java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.File(nombreArchivo))) {
                for (int i = 0; i < cantidadLibros; i++) {
                    writer.println(libros[i].toString());
                }
            } catch (java.io.IOException e) {
                System.out.println("Error al escribir en el archivo.");
            }
        }

        public void cargarRegistroAFichero() {
            cargarRegistroAFichero("registro.txt");
        }
    }

