package apuntes_examen.carpeta_herencia;

import java.util.Arrays;

public class GestorEmpleado {

    private cajero [] listacajero;

    public GestorEmpleado() {
       this.listacajero =new cajero [0];


    }

    public void add_empleado(cajero c){
        listacajero = Arrays.copyOf(listacajero, listacajero.length+1);
        listacajero[listacajero.length-1]= c;
    }

    public boolean delete_empleado (cajero c){
        boolean resultado = false;
        cajero [] listamomentanea = new cajero[0];
        for (int i = 0; i < listacajero.length; i++) {
            if (!listacajero[i].equals(c)){
                listamomentanea = Arrays.copyOf(listamomentanea, listamomentanea.length+1);
                listamomentanea[listamomentanea.length-1]= listacajero[i];
            } else {
                resultado= true;
                System.out.println("Ha eliminado un dato");
            }
        }

        listacajero= listamomentanea;
        return resultado;
    }

    @Override
    public String toString() {
        return "GestorEmpleado{" +
                "listacajero=" + Arrays.toString(listacajero) +
                '}';
    }


}
