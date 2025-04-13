package Reto02;

public class Ambulancia  extends Emergencia{
    
    private int cantidadVehiculos, recursos;

    public Ambulancia(int tipoEmergencia, String ubicacion, int nivelGravedad, int tiempoRespuesta,
            int cantidadVehiculos, int recursos) {
        super(tipoEmergencia, ubicacion, nivelGravedad, tiempoRespuesta);
        this.cantidadVehiculos = cantidadVehiculos;
        this.recursos = recursos;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        this.cantidadVehiculos = cantidadVehiculos;
    }

    public int getRecursos() {
        return recursos;
    }

    public void setRecursos(int recursos) {
        this.recursos = recursos;
    }
    
}
