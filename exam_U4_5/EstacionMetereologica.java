package apuntes_examen.exam_U4_5;

import java.util.Arrays;

public class EstacionMetereologica {
    private static int contador = 0;
    private int id;
    private String ciudad, pais;
    private double altitud;
    private Sensor[] sensores;

    public EstacionMetereologica(int id, String ciudad, String pais, double altitud, Sensor[] sensores) {
        id = ++contador;
        this.ciudad = ciudad;
        this.pais = pais;
        this.altitud = altitud;
        this.sensores = sensores;
    }

    @Override
    public String toString() {
        return "Estación: ID " + id + ", Ubicación: " + ciudad + ", " + pais + ", Altitud: " + altitud + "m, Sensores: " + Arrays.toString(sensores);
    }
}
