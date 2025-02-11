package CLASE05;

public class Almacenamiento {

    private int capacidad;
    private String tipo;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;

    }


    
    public Almacenamiento(int capacidad, String tipo) {
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public Almacenamiento(int capacidad) {
        this.capacidad = capacidad;
    } 

    public void mostrarDetalles(){
        System.out.println("El almacenamiento es de: " + this.capacidad + "GHZ.");
        System.out.println("El almacenamiento es de tipo : " + this.tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
