package apuntes_examen.exam_U4_5;


public class main {
    public static void main(String[] args) {
        EstacionMetereologica e1 = new EstacionMetereologica(1, "Sevilla", "España", 25, new Sensor[]{Sensor.TEMPERATURA, Sensor.HUMEDAD, Sensor.VIENTO});
        RegistroDiario r1 = new RegistroDiario("hola", 19,33,55,70, e1, 35,30);
        CentroMetereologico centro = new CentroMetereologico();

        PronosticoMetereologico p1 = new PronosticoMetereologico("25-04-2025", 10, 25, 30, 46, new Fuente[]{Fuente.estación, Fuente.modelo, Fuente.satélite, Fuente.otro});
        centro.add_registro(r1);

        System.out.println(r1);

    }
}
