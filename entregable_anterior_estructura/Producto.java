package apuntes_examen.entregable_anterior_estructura;

public class Producto {
    private static int num_prod;
    private String nombre;
    private float precio;
    private tipo_producto tipo;
    private int unidades;

    Producto() {
        tipo = tipo_producto.frutas;
        num_prod++;
    }

    public Producto(String nombre, float precio, tipo_producto tipo, int unidades) {
        this();

        this.nombre = nombre;
        setPrecio(precio);
        this.tipo = tipo;
        setUnidades(unidades);
    }

    public Producto(String nombre, float precio, int unidades) {
        this();

        this.nombre = nombre;
        setPrecio(precio);
        setUnidades(unidades);
    }

    public static void mostrar_num_productos() {
        System.out.println("El numero de productos creados es: " + num_prod);
    }

    void mostrar_informacion() {
        System.out.println("Producto");
        System.out.println(" - Nombre: " + nombre);
        System.out.println(" - Precio: " + precio);
        System.out.println(" - Tipo: " + tipo);
        System.out.println(" - Unidades: " + unidades);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        if (unidades >= 1 && unidades <= 1000) {
            this.unidades = unidades;
        }
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if (precio >= 0.01 && precio <= 999.99) {
            this.precio = precio;
        }
    }

    public tipo_producto getTipo() {
        return tipo;
    }

    public void setTipo(tipo_producto tipo) {
        this.tipo = tipo;
    }

    public enum tipo_producto {frutas, verduras, lacteos, panaderia, carnes}
}
