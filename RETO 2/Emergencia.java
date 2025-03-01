import java.util.Scanner;

public class Emergencia{
    Scanner entrada = new Scanner(System.in);

    
//gestion de emergencias urbanas    
//1. bomberos, ambulancias y policia
//2. asignar recursis seegun prioridad.
//3. evaluar rendimiento del sistema 

//4. crear clases de emergencias con atributos y metodos
//5. clase principal Emergencia qeu almacene tipo:
// tipo de emergencia, ubicacion, nivel de gravedad y tiempo de respuesta
//6. disenar gerarquia y herencia
//    Incendio, accidente vehicular, robo.
 


private final int tipoEmergencia;
private final String ubicacion;
private final int nivelGravedad;
private final int tiempoRespuesta;
private boolean Atendido;

public Emergencia(String ubicacion, int nivelGravedad, int tiempoRespuesta, int tipoEmergencia) {
    this.tipoEmergencia = tipoEmergencia;
    this.ubicacion = ubicacion;
    this.nivelGravedad = nivelGravedad;
    this.tiempoRespuesta = tiempoRespuesta;
}

public static void main (String[] args) throws Exception {
    System.out.println("¡Estas en la aplicacion de Emergencias!");
    
    //Emergencia Emergencia = new Emergencia();
    //System.out.println("la emergencia es " + Emergencia.gettipoEmergencia);
    System.out.println("");
    System.out.println("la emergencia fue registrada con exito.");
    System.out.println("Por favor siga las indicaciones dadas por las autoridades competentes.");

}
public int gettipoEmergencia() {
    System.out.println("Ingrese el tipo de Emergencia");
    System.out.println("1. Incendio");
    System.out.println("2. Robo");
    System.out.println("3. Accidente");
    //String tipoEmergencia = entrada.nextLine();
    return tipoEmergencia;
}

public String getUbicacion() {
    System.out.println("Ingrese la ubicacon de la Emergencia");
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
    if(nivelGravedad >= 1 || nivelGravedad <3) {
         System.out.println("los vehiculos asignados llegan en 15 minutos");
     } else {System.out.println("Los vehivulos asignados llegan en menos de 10 minutos");}
    return tiempoRespuesta;
}

public boolean isAtendido() {
    System.out.println("¿La emergencia fue atendida?");
    System.out.println("1. Si");
    System.out.println("2. No");
    return Atendido;
}

public void setAtendido(boolean atendido) {
    Atendido = atendido;
}



    

@Override
public String toString() {
    return "Emergencia []";
}


}