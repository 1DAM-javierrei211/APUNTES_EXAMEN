package apuntes_examen.exam_U4_5;

import java.util.Arrays;

public class PronosticoMetereologico extends RegistroMetereologico implements Analizable{

private Fuente [] FuenteUtilizada;

    public PronosticoMetereologico(String fecha, int tempMin, int tempMax, int porcentajeLluviayHumedad, int velocidadViento, Fuente[] fuenteUtilizada) {
        super(fecha, tempMin, tempMax, porcentajeLluviayHumedad, velocidadViento);
        FuenteUtilizada = fuenteUtilizada;
    }

    @Override
    public String analizarTendencia() {
        return "La tendencia climatica es "+TempMin+" en las temperaturas mas bajas y "+TempMax+" en las temperaturas mas altas";
    }

    @Override
    public Boolean esEventoExtremo() {
        if (TempMax>40 || VelocidadViento>100){
            return true;
        } else {
            return false;
        }
    }

    public Fuente[] getFuenteUtilizada() {
        return FuenteUtilizada;
    }

    public void setFuenteUtilizada(Fuente[] fuenteUtilizada) {
        FuenteUtilizada = fuenteUtilizada;
    }

    @Override
    public String toString() {
        return "PronosticoMetereologico{" +
                "FuenteUtilizada=" + Arrays.toString(FuenteUtilizada) +
                ", Fecha='" + Fecha + '\'' +
                ", TempMin=" + TempMin +
                ", TempMax=" + TempMax +
                ", PorcentajeLluviayHumedad=" + PorcentajeLluviayHumedad +
                ", VelocidadViento=" + VelocidadViento +
                '}';
    }
}
