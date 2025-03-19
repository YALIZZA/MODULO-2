package Reto02;

import java.util.Scanner;

public class Emergencia{

//gestion de emergencias urbanas    
//1. bomberos, ambulancias y policia
//2. asignar recursos segun la prioridad.
//3. evaluar rendimiento del sistema 

//4. crear clases de emergencias con atributos y metodos
//5. clase principal Emergencia qeu almacene tipo:
// tipo de emergencia, ubicacion, nivel de gravedad y tiempo de respuesta
//6. disenar gerarquia y herencia
//    Incendio, accidente vehicular, robo.
 
Scanner entrada = new Scanner(System.in);

 private int tipoEmergencia;
 private String ubicacion;
 private int nivelGravedad;
 private int tiempoRespuesta;
 boolean Atendido;

//metodo constructor
public Emergencia(int tipoEmergencia, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
    this.tipoEmergencia = tipoEmergencia;
    this.ubicacion = ubicacion;
    this.nivelGravedad = nivelGravedad;
    this.tiempoRespuesta = tiempoRespuesta;
}

public int getTipoEmergencia() {
   // witch(tipoEmergencia){
  //
    return tipoEmergencia;
}

public void setTipoEmergencia(int tipoEmergencia) {
    this.tipoEmergencia = tipoEmergencia;
}

public String getUbicacion() {
    return ubicacion;
}

public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
}

public int getNivelGravedad() {
    return nivelGravedad;
}

public void setNivelGravedad(int nivelGravedad) {
    this.nivelGravedad = nivelGravedad;
}

public int getTiempoRespuesta() {
    return tiempoRespuesta;
}

public void setTiempoRespuesta(int tiempoRespuesta) {
    this.tiempoRespuesta = tiempoRespuesta;
}

public boolean isAtendido() {
    return Atendido;
}

public void setAtendido(boolean atendido) {
    Atendido = atendido;
}

    public void mostrarInformacion() {
        System.out.println("Tipo de Emergencia: " + tipoEmergencia);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Nivel de Gravedad: " + nivelGravedad);
        System.out.println("Tiempo de Respuesta: " + tiempoRespuesta);
    }

    private int menuEmergencia () {
        System.out.println("¡Estas en la aplicacion de Emergencias!");
        System.out.println("Ingrese el tipo de Emergencia");
        System.out.println("1. Incendio");
        System.out.println("2. Robo");
        System.out.println("3. Accidente");
        System.out.println("4. Salir");
        System.out.println("Ingrese una opcion: ");
        return entrada.nextInt();
}

private void asignarRecursos() {
    final int VehiculosAmbulancia;
    private int VehiculosPolicia;
    protected int VehiculosBombero;
    protected int RecursosPolicia;
    protected int RecursosAmbulancia;
    protected int RecursosBombero;

    if (tipoEmergencia == 1) {
        VehiculosAmbulancia = 2;
        VehiculosPolicia = 2;
        VehiculosBombero = 3;
        RecursosPolicia = 100;
        RecursosAmbulancia = 100;
        RecursosBombero = 100;
    } else if (tipoEmergencia == 2) {
        VehiculosAmbulancia = 1;
        VehiculosPolicia = 3;
        VehiculosBombero = 0;
        RecursosPolicia = 100;
        RecursosAmbulancia = 100;
        RecursosBombero = 100;
    } else if (tipoEmergencia == 3) {
        VehiculosAmbulancia = 2;
        VehiculosPolicia = 2;
        VehiculosBombero = 3;
        RecursosPolicia = 100;
        RecursosAmbulancia = 100;
        RecursosBombero = 100;
    }
}


}