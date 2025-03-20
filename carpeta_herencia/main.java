package apuntes_examen.carpeta_herencia;

public class main {
    public static void main(String[] args) {
        cajero c1 = new cajero("Redun", "dw", "hola", 1, "jefe", 1);
        cajero c2 = new cajero("dant", "dwverg", "holaaaaa", 2, "subdito", 2);

        GestorEmpleado gestorEmpleado = new GestorEmpleado();

        System.out.println(c1);
        System.out.println(c2);

        gestorEmpleado.add_empleado(c1);
        gestorEmpleado.add_empleado(c2);
        System.out.println(gestorEmpleado);
        gestorEmpleado.delete_empleado(c2);
        System.out.println(gestorEmpleado);
        c1.realizartransaccion();
        c1.realizartransaccion();
        c1.realizartransaccion();
        c1.realizartransaccion();

    }
}
