package s16lab01;

public class S16Lab01SensorMain {
    public static void main(String[] args) throws InterruptedException {
        // El sensor calcula 128 muestras por lote antes de revisar la siguiente señal.
        final int TAMANO_LOTE = 128;
        SensorSimulado sensor = new SensorSimulado(TAMANO_LOTE);
        Thread hilo = new Thread(sensor, "sensor");
        try {
            hilo.start();
            // Espera a que el trabajador haya iniciado antes de pedir la parada.
            sensor.esperarPrimerLote();
            sensor.solicitarDetencion();
            // join permite leer el resumen final sin carreras con el trabajador.
            hilo.join(5_000);
            if (hilo.isAlive()) {
                throw new IllegalStateException("El sensor no termino");
            }
            System.out.println("Resultado: " + sensor.consultarResultado());
            System.out.println("Lotes: " + sensor.consultarLotes());
            System.out.println("Muestras: " + sensor.consultarMuestras());
            System.out.println("Resumen coherente: " + sensor.resumenCoherente());
            System.out.println("Hilo vivo: " + hilo.isAlive());
            if (!sensor.resumenCoherente()) {
                throw new IllegalStateException("Resumen incorrecto");
            }
            if (!sensor.consultarResultado().equals("DETENIDO_POR_BANDERA")) {
                System.out.println("No concluyente: repetir sin pausas de Debug");
            }
        } finally {
            // Si hubo un fallo o vencio el plazo, solicita una salida y evita dejarlo activo.
            sensor.solicitarDetencion();
            if (hilo.isAlive()) {
                hilo.interrupt();
                hilo.join(1_000);
            }
        }
    }
}
