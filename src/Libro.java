package apuntes_examen.src;


    class Libro implements Comparable<Libro> {
        private String titulo;
        private String autor;

        public Libro(String titulo, String autor) throws InvalidBookException {
            if (titulo.matches(".*\\d.*") || autor.matches(".*\\d.*")) {
                throw new InvalidBookException ("El título y el autor no pueden contener números.");
            }
            this.titulo = titulo;
            this.autor = autor;
        }

        @Override
        public String toString() {
            return titulo + ": " + autor;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Libro libro = (Libro) obj;
            return titulo.equals(libro.titulo) && autor.equals(libro.autor);
        }

        @Override
        public int compareTo(Libro otro) {
            return this.titulo.compareTo(otro.titulo);
        }
    }

