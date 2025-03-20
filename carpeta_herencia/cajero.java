package apuntes_examen.carpeta_herencia;

import java.util.Objects;

public class cajero extends empleado implements transacciones{
    private int idempleado;
    private String Cargo;
    int contador = 0;

    @Override
    public void realizartransaccion(){
       int contprovisional = contador;
        for (int i = contprovisional; i < contador+1 ; i++) {
            System.out.println("Esta es la transaccion "+i);

        }
        contador = contador+1;
    }



    public cajero(String segundoApellido, String apellido, String nombre, int id_empleado, String cargo, int idempleado) {
        super(segundoApellido, apellido, nombre, id_empleado);
        Cargo = cargo;
        this.idempleado = idempleado;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        cajero cajero = (cajero) o;
        return idempleado == cajero.idempleado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idempleado);
    }
}
