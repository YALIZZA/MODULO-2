

public class Emergencia {

    static Scanner Entrada = new Scanner(System.in);


    private final String tipo;
    private final String ubicacion;
    private final int nivelGravedad; // = {"1.bajo", "2.medio",  "3.alto"}; 
    private final int tiempoRespuesta;//minutos
    private boolean atendido;


    
    public Emergencia(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.nivelGravedad = nivelGravedad;
        this.tiempoRespuesta = tiempoRespuesta;
    }


    public String getTipo() {
        
        return tipo;
    }


    public String getUbicacion() {
        System.out.println("Ingrese la ubicacon de la Emergencai");
        
        return ubicacion;
    }


    public int getNivelGravedad() {
        System.out.println("Ingrese el nivel de gravedad");
        System.out.println("1. Bajo ");
        System.out.println("2. Medio");
        System.out.println("3. Alto");

                return nivelGravedad;
    }


    public int getTiempoRespuesta() {
        // if(nivelGravedad >= 1 || <3) {
        //     System.out.println("los vehiculos asignados llegan en 15 minutos");
        // } else {System.out.println("Los vehivulos asignados llegan en menos de 10 minutos");}
        return tiempoRespuesta;
    }


    @Override
    public String toString() {
        return "Emergencia [tipo=" + tipo + ", ubicacion=" + ubicacion + ", nivelGravedad=" + nivelGravedad
                + ", tiempoRespuesta=" + tiempoRespuesta + "]";
    }



}
