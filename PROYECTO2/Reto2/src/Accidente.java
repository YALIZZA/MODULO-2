public class Accidente extends Emergencia{

    public Accidente(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
            super(tipo, ubicacion, nivelGravedad, tiempoRespuesta);
            
        }
    
        @Override
    public void NivelRiesgo() {
        
        System.out.println("1. Bajo");
        System.out.println("2. Medio");
        System.out.println("3. Alto");  
        throw new UnsupportedOperationException("Unimplemented method 'NivelRiesgo'");
    }

    @Override
    public void AsignacionVehiulos() {
        
        throw new UnsupportedOperationException("Unimplemented method 'AsignacionVehiulos'");
    }

    
} 
