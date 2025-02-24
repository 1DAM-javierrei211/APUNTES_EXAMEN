package apuntes_examen.entregable_anterior_estructura;

import java.util.Arrays;

public class Supermercado {
    private static String cadena;
    private String nombre;

    private Producto[] lista_prod;
    private Empleado[] lista_empl;

    Supermercado() {
        lista_prod = new Producto[0];
        lista_empl = new Empleado[0];
    }

    public Supermercado(String nombre, Producto[] lista_prod, Empleado[] lista_empl) {
        this();
        this.nombre = nombre;
        this.lista_prod = lista_prod;
        this.lista_empl = lista_empl;
    }

    public Supermercado(String nombre) {
        this();
        this.nombre = nombre;
    }

    public static String getCadena() {
        return cadena;
    }

    public static void setCadena(String cadena) {
        Supermercado.cadena = cadena;
    }

    public void mostrar_informacion() {
        System.out.println("Cadena: " + cadena);
        System.out.println("Nombre: " + nombre);
        if (lista_prod != null) {
            for (int i = 0; i < lista_prod.length; i++) {
                lista_prod[i].mostrar_informacion();
            }
        }
        mostrar_empleados();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto[] getLista_prod() {
        return lista_prod;
    }

    public void setLista_prod(Producto[] lista_prod) {
        this.lista_prod = lista_prod;
    }

    public Empleado[] getLista_empl() {
        return lista_empl;
    }

    public void setLista_empl(Empleado[] lista_empl) {
        this.lista_empl = lista_empl;
    }

    public void anyadir_producto(Producto prod) {
        Producto[] arr = new Producto[lista_prod.length + 1];
        System.arraycopy(lista_prod, 0, arr, 0, lista_prod.length);
        arr[arr.length - 1] = prod;
        lista_prod = arr;
    }

    public void anyadir_empleado(Empleado empl) {
        lista_empl = Arrays.copyOf(lista_empl, lista_empl.length + 1);
        lista_empl[lista_empl.length - 1] = empl;
    }

    public boolean eliminar_empleado(int id_empleado) {
        Empleado[] arr = new Empleado[lista_empl.length - 1];
        boolean sig = false;
        for (int i = 0; i < lista_empl.length; i++) {
            if (lista_empl[i].getId() == id_empleado) {
                sig = true;
            } else {
                if (sig) {
                    arr[i - 1] = lista_empl[i];
                } else {
                    arr[i] = lista_empl[i];
                }
            }
        }

        lista_empl = arr;
        return sig;
    }

    public void mostrar_nombre_productos() {
        if (lista_prod != null) {
            for (int i = 0; i < lista_prod.length; i++) {
                System.out.println(" - " + lista_prod[i].getNombre());
            }
        }

    }

    public void mostrar_unidades_productos() {
        if (lista_prod != null) {
            int sum = 0;
            for (int i = 0; i < lista_prod.length; i++) {
                sum += lista_prod[i].getUnidades();
            }
            System.out.println("El supermercado " + nombre + " tiene " + sum + " productos.");
        }
    }

    public void mostrar_empleados() {
        if (lista_empl != null) {
            for (int i = 0; i < lista_empl.length; i++) {
                lista_empl[i].mostrar_informacion();
            }
        }
    }
}
