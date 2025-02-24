package apuntes_examen.ENTREGABLE2122;

// Clase Catalogo
class Catalogo {
    private Multimedia[] elementos;

    public Catalogo() {
        this.elementos = new Multimedia[0];
    }

    public void addMultimedia(Multimedia elemento) {
        Multimedia[] nuevoArray = new Multimedia[elementos.length + 1];
        System.arraycopy(elementos, 0, nuevoArray, 0, elementos.length);
        nuevoArray[elementos.length] = elemento;
        elementos = nuevoArray;
    }

    public boolean eliminarMultimedia(Multimedia elemento) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == elemento) {
                Multimedia[] nuevoArray = new Multimedia[elementos.length - 1];
                System.arraycopy(elementos, 0, nuevoArray, 0, i);
                System.arraycopy(elementos, i + 1, nuevoArray, i, elementos.length - i - 1);
                elementos = nuevoArray;
                return true;
            }
        }
        return false;
    }

    public int numeroDeElementos() { return elementos.length; }
}

