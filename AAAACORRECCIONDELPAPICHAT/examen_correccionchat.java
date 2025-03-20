package apuntes_examen.AAAACORRECCIONDELPAPICHAT;
import java.util.*;
public class examen_correccionchat {


    // Interfaz Analizable
    interface Analizable {
        String analizarTendencia();
        boolean esEventoExtremo();
    }

    // Enumerado para sensores
    enum Sensor {
        TEMPERATURA, HUMEDAD, VIENTO, PRECIPITACION;
    }

    // Clase abstracta RegistroMeteorologico
    abstract class RegistroMeteorologico implements Analizable {
        private static int contador = 0;
        protected final int id;
        protected String fecha;

        public RegistroMeteorologico(String fecha) {
            this.id = ++contador;
            this.fecha = fecha;
        }

        public int getId() {
            return id;
        }

        public String getFecha() {
            return fecha;
        }

        @Override
        public abstract String toString();

        @Override
        public abstract boolean esEventoExtremo();

        @Override
        public abstract String analizarTendencia();

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            RegistroMeteorologico that = (RegistroMeteorologico) obj;
            return id == that.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    // Clase RegistroDiario
    class RegistroDiario extends RegistroMeteorologico {
        private double tempMin, tempMax, humedad, precipitacion, velocidadViento;
        private EstacionMeteorologica estacion;

        public RegistroDiario(String fecha, double tempMin, double tempMax, double humedad, double precipitacion, double velocidadViento, EstacionMeteorologica estacion) {
            super(fecha);
            this.tempMin = tempMin;
            this.tempMax = tempMax;
            this.humedad = humedad;
            this.precipitacion = precipitacion;
            this.velocidadViento = velocidadViento;
            this.estacion = estacion;
        }

        @Override
        public boolean esEventoExtremo() {
            return tempMax > 40 || velocidadViento > 100 || precipitacion > 50;
        }

        @Override
        public String analizarTendencia() {
            return "Análisis de tendencias climáticas basado en datos históricos.";
        }

        @Override
        public String toString() {
            return "Registro Diario (ID " + id + "): " + fecha + ", Temp: " + tempMin + "-" + tempMax + "°C, Humedad: " + humedad + "%, Precip: " + precipitacion + "mm, Viento: " + velocidadViento + " km/h";
        }
    }

    // Clase PronosticoMeteorologico
    class PronosticoMeteorologico extends RegistroMeteorologico {
        private double tempMinPrevista, tempMaxPrevista, probLluvia, velocidadViento;
        private String fuente;

        public PronosticoMeteorologico(String fecha, double tempMinPrevista, double tempMaxPrevista, double probLluvia, double velocidadViento, String fuente) {
            super(fecha);
            this.tempMinPrevista = tempMinPrevista;
            this.tempMaxPrevista = tempMaxPrevista;
            this.probLluvia = probLluvia;
            this.velocidadViento = velocidadViento;
            this.fuente = fuente;
        }

        @Override
        public boolean esEventoExtremo() {
            return tempMaxPrevista > 40 || velocidadViento > 100 || probLluvia > 80;
        }

        @Override
        public String analizarTendencia() {
            return "Tendencia basada en modelos meteorológicos de " + fuente;
        }

        @Override
        public String toString() {
            return "Pronóstico (ID " + id + "): " + fecha + ", Temp Prevista: " + tempMinPrevista + "-" + tempMaxPrevista + "°C, Prob Lluvia: " + probLluvia + "%, Viento: " + velocidadViento + " km/h, Fuente: " + fuente;
        }
    }

    // Clase EstacionMeteorologica
    class EstacionMeteorologica {
        private static int contador = 0;
        private final int id;
        private String ciudad, pais;
        private double altitud;
        private Sensor[] sensores;

        public EstacionMeteorologica(String ciudad, String pais, double altitud, Sensor[] sensores) {
            this.id = ++contador;
            this.ciudad = ciudad;
            this.pais = pais;
            this.altitud = altitud;
            this.sensores = sensores;
        }

        @Override
        public String toString() {
            return "Estación (ID " + id + "): " + ciudad + ", " + pais + ", Altitud: " + altitud + "m, Sensores: " + Arrays.toString(sensores);
        }
    }

    // Clase CentroMeteorologico
    class CentroMeteorologico {
        private RegistroMeteorologico[] registros;

        public CentroMeteorologico() {
            this.registros = new RegistroMeteorologico[0];
        }

        public void agregarRegistro(RegistroMeteorologico registro) {
            registros = Arrays.copyOf(registros, registros.length + 1);
            registros[registros.length - 1] = registro;
            System.out.println("Registro agregado: ID " + registro.getId());
        }

        public boolean eliminarRegistro(int id) {
            boolean eliminado = false;
            RegistroMeteorologico[] temp = new RegistroMeteorologico[0];

            for (RegistroMeteorologico r : registros) {
                if (r.getId() != id) {
                    temp = Arrays.copyOf(temp, temp.length + 1);
                    temp[temp.length - 1] = r;
                } else {
                    eliminado = true;
                }
            }
            registros = temp;

            if (eliminado) {
                System.out.println("Registro eliminado: ID " + id);
            } else {
                System.out.println("Registro con ID " + id + " no encontrado.");
            }
            return eliminado;
        }

        public void ordenarPorFecha() {
            if (registros.length == 0) {
                System.out.println("No hay registros para ordenar.");
                return;
            }
            Arrays.sort(registros, Comparator.comparing(RegistroMeteorologico::getFecha));
            System.out.println("Registros ordenados por fecha.");
        }

        public void mostrarRegistros() {
            if (registros.length == 0) {
                System.out.println("No hay registros en el sistema.");
            } else {
                for (RegistroMeteorologico r : registros) {
                    System.out.println(r);
                }
            }
        }
    }

    // Clase Main para pruebas
    public class Main {
        public void main(String[] args) {
            EstacionMeteorologica estacion1 = new EstacionMeteorologica("Madrid", "España", 650, new Sensor[]{Sensor.TEMPERATURA, Sensor.HUMEDAD, Sensor.VIENTO});
            CentroMeteorologico centro = new CentroMeteorologico();

            RegistroDiario registro1 = new RegistroDiario("2025-03-19", 12, 25, 60, 5, 20, estacion1);
            PronosticoMeteorologico pronostico1 = new PronosticoMeteorologico("2025-03-20", 10, 28, 40, 15, "Modelo Global");

            centro.agregarRegistro(registro1);
            centro.agregarRegistro(pronostico1);

            System.out.println("\nLista de registros:");
            centro.mostrarRegistros();

            System.out.println("\nOrdenando registros...");
            centro.ordenarPorFecha();
            centro.mostrarRegistros();

            System.out.println("\nEliminando registro ID " + registro1.getId());
            centro.eliminarRegistro(registro1.getId());
            centro.mostrarRegistros();
        }
    }

}
