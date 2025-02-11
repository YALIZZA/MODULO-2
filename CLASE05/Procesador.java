package CLASE05;

public class Procesador {

    private int capacidad;
    private int nucleos;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Procesador(int capacidad, int nucleos) {
        this.capacidad = capacidad;
        this.nucleos = nucleos;
    }

    

    public Procesador(int capacidad) {
        this.capacidad = capacidad;
    }

    public void mostrarDetalles(){
        System.out.println("La procesador es de: " + this.capacidad + "GHZ y tiene " + this.nucleos + " nucleos.");
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

}
