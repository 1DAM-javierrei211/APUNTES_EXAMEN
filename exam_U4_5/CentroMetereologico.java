package apuntes_examen.exam_U4_5;

import java.util.Arrays;

public class CentroMetereologico {

    private RegistroMetereologico [] ListaRegistros;

     public registrometereologico () {
        this.ListaRegistros = new RegistroMetereologico[0];
    }

    public void add_registro (RegistroMetereologico a){
        ListaRegistros = Arrays.copyOf(ListaRegistros, ListaRegistros.length+1);
        ListaRegistros[ListaRegistros.length-1]=a;
    }

    public boolean delete_registro (RegistroMetereologico a){
        boolean res = false;
        RegistroMetereologico [] Lista_provisional = new RegistroMetereologico[0];

        for (int i = 0; i < ListaRegistros.length; i++) {
            if (!ListaRegistros[i].equals(a)){
                Lista_provisional = Arrays.copyOf(Lista_provisional, Lista_provisional.length+1);
                Lista_provisional[Lista_provisional.length-1]= a;

            } else{
                res= true;
                System.out.println("Se ha eliminado un registro de la lista");
            }
        }
        return res;
    }
}
