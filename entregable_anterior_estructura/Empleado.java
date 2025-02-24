package apuntes_examen.entregable_anterior_estructura;

import java.time.LocalDate;

public class Empleado {
    private static int cuenta_id;
    private String nombre_completo;
    private int id;
    private String telefono;
    private LocalDate fecha_contrata;
    private tipo_empleado tipo;

    Empleado() {
        cuenta_id++;
        id = cuenta_id;
        tipo = tipo_empleado.reponedor;
    }

    public Empleado(String nombre_completo, String telefono, LocalDate fecha_contrata, tipo_empleado tipo) {
        this();

        this.nombre_completo = nombre_completo;
        this.telefono = telefono;
        this.fecha_contrata = fecha_contrata;
        this.tipo = tipo;
    }

    public Empleado(String nombre_completo, String telefono, LocalDate fecha_contrata) {
        this();

        this.nombre_completo = nombre_completo;
        this.telefono = telefono;
        this.fecha_contrata = fecha_contrata;
    }

    public static void mostrar_num_empleados() {
        System.out.println("El numero total de empleados es: " + cuenta_id);
    }

    public void mostrar_informacion() {
        System.out.println("Empleado:");
        System.out.println(" - ID: " + id);
        System.out.println(" - Nombre completo: " + nombre_completo);
        System.out.println(" - Telefono: " + telefono);
        System.out.println(" - Fecha contratacion: " + fecha_contrata);
        System.out.println(" - Tipo: " + tipo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public enum tipo_empleado {cajero, reponedor, gerente, seguridad}
}
