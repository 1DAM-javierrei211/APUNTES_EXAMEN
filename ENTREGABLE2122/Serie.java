package apuntes_examen.ENTREGABLE2122;

import java.util.Random;

// Clase Serie
class Serie extends Multimedia implements Reproducible {
    private String creador;
    private int temporadas;
    private String[] capitulos;

    public Serie(String titulo, String creador, int temporadas) {
        super(titulo);
        this.creador = creador;
        this.temporadas = temporadas;
        this.capitulos = new String[0];
    }

    public void addCapitulo(String capitulo) {
        String[] nuevoArray = new String[capitulos.length + 1];
        System.arraycopy(capitulos, 0, nuevoArray, 0, capitulos.length);
        nuevoArray[capitulos.length] = capitulo;
        capitulos = nuevoArray;
    }

    public boolean eliminarCapitulo(String capitulo) {
        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i].equals(capitulo)) {
                String[] nuevoArray = new String[capitulos.length - 1];
                System.arraycopy(capitulos, 0, nuevoArray, 0, i);
                System.arraycopy(capitulos, i + 1, nuevoArray, i, capitulos.length - i - 1);
                capitulos = nuevoArray;
                return true;
            }
        }
        return false;
    }

    @Override
    public void play() {
        if (capitulos.length > 0) {
            String capitulo = capitulos[new Random().nextInt(capitulos.length)];
            System.out.println("Reproduciendo serie " + getTitulo() + ", capítulo " + capitulo);
        }
    }
    @Override
    public void pause() { System.out.println("Pausando serie " + getTitulo()); }
    @Override
    public void stop() { System.out.println("Parando serie " + getTitulo()); }

}