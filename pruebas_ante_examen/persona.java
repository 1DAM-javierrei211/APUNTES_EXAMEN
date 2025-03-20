package apuntes_examen.pruebas_ante_examen;

import java.util.Objects;

public class persona {
   protected String Dni;
   protected String Nombre;

    public persona(String nombre, String dni) {
        Nombre = nombre;
        Dni = dni;
    }

    @Override
    public String toString() {
        return "persona{" +
                "Dni='" + Dni + '\'' +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        persona persona = (persona) o;
        return Objects.equals(Dni, persona.Dni) && Objects.equals(Nombre, persona.Nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Dni, Nombre);
    }


}
