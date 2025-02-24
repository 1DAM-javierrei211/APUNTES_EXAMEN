package apuntes_examen.ENTREGABLE2122;

// Clase Main para pruebas
public class ej1 {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Pelicula peli = new Pelicula("Inception", "Nolan", 2010, 148, "WB", "USA");
        Serie serie = new Serie("Breaking Bad", "Vince Gilligan", 5);
        Libro libro = new Libro("1984", "Orwell", 1949, "Secker", "123456789", 328);

        serie.addCapitulo("S01E01");
        serie.addCapitulo("S01E02");

        catalogo.addMultimedia(peli);
        catalogo.addMultimedia(serie);
        catalogo.addMultimedia(libro);

        peli.play();
        peli.pause();
        peli.stop();

        serie.play();
        serie.pause();
        serie.stop();

        System.out.println();
        System.out.println(peli);
        System.out.println();

        libro.darPorFinalizado();
        System.out.println("Número de elementos: " + catalogo.numeroDeElementos());
    }
}


