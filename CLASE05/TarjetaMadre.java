package CLASE05;

public class TarjetaMadre {

    private Procesador procesador;
    private Memoria memoria;
    private Almacenamiento almacenamiento;
    private Grafica grafica;

    public TarjetaMadre(int almacenamiento, int memoria, int capacidadProcesador, int nucleosProcesador, int grafica) {
        this.procesador = new Procesador(capacidadProcesador, nucleosProcesador);
        this.memoria = new Memoria(memoria);
        this.almacenamiento = new Almacenamiento(almacenamiento);  
        this.grafica = new Grafica(grafica);

    }

    public void RegistrartipoHD(String tipo){
        this.almacenamiento.setTipo(tipo);
    }
    
    public void getMotherBoardComponents() {

        almacenamiento.mostrarDetalles();
        System.out.println("Componentes de la tarjeta madre");
        memoria.mostrarDetalles();
        procesador.mostrarDetalles();
        grafica.mostrarDetalles();

    }

}
