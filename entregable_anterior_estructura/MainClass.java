package apuntes_examen.entregable_anterior_estructura;

import java.time.LocalDate;

public class MainClass {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juanito Juan", "+34 652145874", LocalDate.of(2020, 5, 1), Empleado.tipo_empleado.cajero);
        Empleado e2 = new Empleado("El Dandi", "+34 685412365", LocalDate.now());
        Empleado e3 = new Empleado("Joaquin Pichardo", "+34 632145698", LocalDate.of(1999, 2, 9), Empleado.tipo_empleado.gerente);

        Producto p1 = new Producto("Pera", 49.99f, 500);
        Producto p2 = new Producto("Chuletas de cerdo", 19.99f, Producto.tipo_producto.carnes, 10);
        Producto p3 = new Producto("Hormiga culona", 60.99f, Producto.tipo_producto.panaderia, 3);

        Supermercado s1 = new Supermercado("Supermercados el montanes");
        Supermercado.setCadena("Grupo el Martinez");

        s1.anyadir_empleado(e1);
        s1.anyadir_empleado(e2);
        s1.anyadir_empleado(e3);

        s1.anyadir_producto(p1);
        s1.anyadir_producto(p2);
        s1.anyadir_producto(p3);

        s1.eliminar_empleado(e2.getId());

        s1.mostrar_informacion();
    }
}