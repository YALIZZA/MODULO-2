package Reto02;
//package RETO02;

public class Bombero extends Emergencia {
    
    private int cantidadVehiculos, recursos;

    public Bombero(int tipoEmergencia, String ubicacion, int nivelGravedad, int tiempoRespuesta, int cantidadVehiculos,
            int recursos) {
        super(tipoEmergencia, ubicacion, nivelGravedad, tiempoRespuesta);
        this.cantidadVehiculos = cantidadVehiculos;
        this.recursos = recursos;
    }

    public int getCantidadVehiculos() {
        cantidadVehiculos = 10;
        if()
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
       
    }

    public int getRecursos() {
        return recursos;
    }

    public void setRecursos(int recursos) {
       
    }
    

    
}
