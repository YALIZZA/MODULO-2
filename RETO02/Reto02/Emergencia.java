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

 private String tipoEmergencia;
 private String ubicacion;
 private int nivelGravedad;
 private int tiempoRespuesta;
 boolean Atendido;

//metodo constructor
public Emergencia(String tipoEmergencia, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
    this.tipoEmergencia = tipoEmergencia;
    this.ubicacion = ubicacion;
    this.nivelGravedad = nivelGravedad;
    this.tiempoRespuesta = tiempoRespuesta;
}

/**
 * This method ask the user to input the type of emergency and returns the name of the emergency selected.
 * @return String with the name of the emergency selected.
 */
public String getTipoEmergencia() {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el tipo de Emergencia");
    System.out.println("1. Incendio");
    System.out.println("2. Robo");
    System.out.println("3. Accidente");
    System.out.println("4. Salir");
    System.out.println("Ingrese una opcion: ");
    int tipoEmergencia = entrada.nextInt();
    String nombreEmergencia = null;
    switch(tipoEmergencia){
        
        case 1: nombreEmergencia = "Incendio";
            break;
        case 2: nombreEmergencia = "Robo";
            break;
        case 3: nombreEmergencia = "Accidente";
            break;
        case 4: nombreEmergencia = "Salir";
            System.out.println("4. A salido de la aplicacion de Emergencias.");
    }
   return nombreEmergencia;
   
}

public void setTipoEmergencia(String tipoEmergencia) {
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


}