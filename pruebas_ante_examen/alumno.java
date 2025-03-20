package apuntes_examen.pruebas_ante_examen;

public class alumno extends persona {
    private int idalumno;
    private int nota_media;

    public alumno(String nombre, String dni, int nota_media, int idalumno) {
        super(nombre, dni);
        this.nota_media = nota_media;
        this.idalumno = idalumno;
    }

    @Override
    public String toString() {
        return "alumno{" +
                "idalumno=" + idalumno +
                ", nota_media=" + nota_media +
                ", Dni='" + Dni + '\'' +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }
}
