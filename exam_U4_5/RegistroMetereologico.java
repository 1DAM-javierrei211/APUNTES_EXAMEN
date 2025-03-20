package apuntes_examen.exam_U4_5;

import java.util.Objects;

public abstract class RegistroMetereologico {
    private static int contador = 0;
    private int IdRegistroMetereologico;
protected String Fecha;
protected int TempMin;
protected int TempMax;
protected int PorcentajeLluviayHumedad;
protected int VelocidadViento;

    public RegistroMetereologico(String fecha, int tempMin, int tempMax, int porcentajeLluviayHumedad, int velocidadViento) {
        IdRegistroMetereologico = ++contador;
        TempMin = tempMin;
        TempMax = tempMax;
        PorcentajeLluviayHumedad = porcentajeLluviayHumedad;
        VelocidadViento = velocidadViento;
    }

    public int getIdRegistroMetereologico() {
        return IdRegistroMetereologico;
    }

    public void setIdRegistroMetereologico(int idRegistroMetereologico) {
        IdRegistroMetereologico = idRegistroMetereologico;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public int getTempMin() {
        return TempMin;
    }

    public void setTempMin(int tempMin) {
        TempMin = tempMin;
    }

    public int getTempMax() {
        return TempMax;
    }

    public void setTempMax(int tempMax) {
        TempMax = tempMax;
    }

    public int getPorcentajeLluviayHumedad() {
        return PorcentajeLluviayHumedad;
    }

    public void setPorcentajeLluviayHumedad(int porcentajeLluviayHumedad) {
        PorcentajeLluviayHumedad = porcentajeLluviayHumedad;
    }

    public int getVelocidadViento() {
        return VelocidadViento;
    }

    public void setVelocidadViento(int velocidadViento) {
        VelocidadViento = velocidadViento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistroMetereologico that = (RegistroMetereologico) o;
        return IdRegistroMetereologico == that.IdRegistroMetereologico && TempMin == that.TempMin && TempMax == that.TempMax && PorcentajeLluviayHumedad == that.PorcentajeLluviayHumedad && VelocidadViento == that.VelocidadViento && Objects.equals(Fecha, that.Fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdRegistroMetereologico, Fecha, TempMin, TempMax, PorcentajeLluviayHumedad, VelocidadViento);
    }
}
