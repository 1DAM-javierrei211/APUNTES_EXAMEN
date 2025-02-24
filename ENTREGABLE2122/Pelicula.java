package apuntes_examen.ENTREGABLE2122;

// Clase Pelicula
class Pelicula extends Multimedia implements Reproducible {
    private String director;
    private int anio;
    private int duracion;
    private String productora;
    private String pais;

    public Pelicula(String titulo, String director, int anio, int duracion, String productora, String pais) {
        super(titulo);
        this.director = director;
        this.anio = anio;
        this.duracion = duracion;
        this.productora = productora;
        this.pais = pais;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getProductora() {
        return productora;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "director='" + director + '\'' +
                ", anio=" + anio +
                ", duracion=" + duracion +
                ", productora='" + productora + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    public int getAnio() { return anio; }

    @Override
    public void play() { System.out.println("Reproduciendo película " + getTitulo()); }
    @Override
    public void pause() { System.out.println("Pausando película " + getTitulo()); }
    @Override
    public void stop() { System.out.println("Parando película " + getTitulo()); }
}
