package apuntes_examen.carpeta_herencia;

import java.util.Objects;

public class empleado {
    protected int id_empleado;
    protected String Nombre;
    protected String Apellido;
    protected  String SegundoApellido;

    public empleado(String segundoApellido, String apellido, String nombre, int id_empleado) {
        SegundoApellido = segundoApellido;
        Apellido = apellido;
        Nombre = nombre;
        this.id_empleado = id_empleado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        empleado empleado = (empleado) o;
        return id_empleado == empleado.id_empleado;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_empleado);
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        SegundoApellido = segundoApellido;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    @Override
    public String toString() {
        return "empleado{" +
                "id_empleado=" + id_empleado +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", SegundoApellido='" + SegundoApellido + '\'' +
                '}';
    }
}
