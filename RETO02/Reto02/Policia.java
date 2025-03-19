package Reto02;
//package RETO02;

public class Policia extends Emergencia {
    private int cantidadVehiculos, recursos;

    public Policia(int tipoEmergencia, String ubicacion, int nivelGravedad, int tiempoRespuesta, int cantidadVehiculos,
            int recursos) {
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
    