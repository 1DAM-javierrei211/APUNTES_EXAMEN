package apuntes_examen.ENTREGABLE2122;

// Clase abstracta Multimedia
abstract class Multimedia {
    private static int idCounter = 1;
    private int id;
    private String titulo;
    private boolean finalizado;

    public Multimedia(String titulo) {
        this.id = idCounter++;
        this.titulo = titulo;
        this.finalizado = false;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public boolean isFinalizado() { return finalizado; }

    public void darPorFinalizado() {
        this.finalizado = true;
        System.out.println("Marcado como finalizado: " + titulo);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Finalizado: " + finalizado;
    }
}


