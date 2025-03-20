package apuntes_examen.pruebas_ante_examen;

public class menu {
    public static void main(String[] args) {
        alumno a1 = new alumno("Javier", "2432432M", 4, 1);
        alumno a2 = new alumno("Javiereinoso", "2432434543522M", 8, 2);

        GestorAlumno gestorAlumno = new GestorAlumno();


        gestorAlumno.add_alumno(a1);
        gestorAlumno.add_alumno(a2);
        System.out.println(gestorAlumno);

        gestorAlumno.delete_alumno(a1);
        System.out.println(gestorAlumno);
    }
}
