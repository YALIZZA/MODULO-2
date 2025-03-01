public class Robo extends Emergencia implements Respuesta{

    public Robo(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
            super(tipo, ubicacion, nivelGravedad, tiempoRespuesta);
            
        }
    
        @Override
    public void NivelRiesgo() {
        
        throw new UnsupportedOperationException("Unimplemented method 'NivelRiesgo'");
    }

    @Override
    public void AsignacionVehiulos() {
       
        throw new UnsupportedOperationException("Unimplemented method 'AsignacionVehiulos'");
    }
    
}
