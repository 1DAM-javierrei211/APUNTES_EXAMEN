package apuntes_examen.ENTREGABLE2122;

class Libro extends Multimedia {
    private String autor;
    private int anio;
    private String editorial;
    private String isbn;
    private int paginas;

    public Libro(String titulo, String autor, int anio, String editorial, String isbn, int paginas) {
        super(titulo);
        this.autor = autor;
        this.anio = anio;
        this.editorial = editorial;
        this.isbn = isbn;
        this.paginas = paginas;
    }

    public int getAnio() { return anio; }
}
