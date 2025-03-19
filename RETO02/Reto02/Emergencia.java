package Reto02;


public class Emergencia{

//gestion de emergencias urbanas    
//1. bomberos, ambulancias y policia
//2. asignar recursis seegun prioridad.
//3. evaluar rendimiento del sistema 

//4. crear clases de emergencias con atributos y metodos
//5. clase principal Emergencia qeu almacene tipo:
// tipo de emergencia, ubicacion, nivel de gravedad y tiempo de respuesta
//6. disenar gerarquia y herencia
//    Incendio, accidente vehicular, robo.
 
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
}