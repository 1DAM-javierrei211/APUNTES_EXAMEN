package apuntes_examen.pruebas_ante_examen;

import java.util.Arrays;

public class GestorAlumno {
    private alumno [] ListaAlumno;

    public GestorAlumno() {
        this.ListaAlumno = new alumno[0] ;
    }

    public void add_alumno (alumno a){
        ListaAlumno = Arrays.copyOf(ListaAlumno, ListaAlumno.length+1);
        ListaAlumno[ListaAlumno.length-1]=a;
    }

    public boolean delete_alumno (alumno a){
        boolean res = false;
        alumno [] Lista_provisional = new alumno[0];

        for (int i = 0; i < ListaAlumno.length; i++) {
            if (!ListaAlumno[i].equals(a)){
                Lista_provisional = Arrays.copyOf(Lista_provisional, Lista_provisional.length+1);
                Lista_provisional[Lista_provisional.length-1]= a;

            } else{
                res= true;
                System.out.println("Se ha eliminado un alumno de la lista");
            }

        }
        ListaAlumno = Lista_provisional;

        return res;
    }

    @Override
    public String toString() {
        return "GestorAlumno{" +
                "ListaAlumno=" + Arrays.toString(ListaAlumno) +
                '}';
    }
}
