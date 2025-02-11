package CLASE06.RetoBase;

public class Robo extends Emergencia implements Responder{

    public Robo(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(tipo, ubicacion, nivelGravedad, tiempoRespuesta);
        
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Patruya en camino");
        System.out.println("Paramedicos en camino");
    }

    @Override
    public void evaluarEstado() {
       System.out.println("Resvision de area en proceso");
       System.out.println("Revisar el estado de los afectados");
    }

}
