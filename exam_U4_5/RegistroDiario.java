package apuntes_examen.exam_U4_5;

public class RegistroDiario  extends RegistroMetereologico implements Analizable {

    private int PrecipitacionAcumulada;
    private int VelpromedioViento;
    private EstacionMetereologica EstacionUtilizada;

    public RegistroDiario(String fecha, int tempMin, int tempMax, int porcentajeLluviayHumedad, int velocidadViento, EstacionMetereologica estacionUtilizada, int velpromedioViento, int precipitacionAcumulada) {
        super(fecha, tempMin, tempMax, porcentajeLluviayHumedad, velocidadViento);
        EstacionUtilizada = estacionUtilizada;
        VelpromedioViento = velpromedioViento;
        PrecipitacionAcumulada = precipitacionAcumulada;
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

    @Override
    public String toString() {
        return "RegistroDiario{" +
                "PrecipitacionAcumulada=" + PrecipitacionAcumulada +
                ", VelpromedioViento=" + VelpromedioViento +
                ", EstacionUtilizada=" + EstacionUtilizada +
                ", Fecha='" + Fecha + '\'' +
                ", TempMin=" + TempMin +
                ", TempMax=" + TempMax +
                ", PorcentajeLluviayHumedad=" + PorcentajeLluviayHumedad +
                ", VelocidadViento=" + VelocidadViento +
                '}';
    }
}
