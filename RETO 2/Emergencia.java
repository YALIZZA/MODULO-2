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
 


private  int tipoEmergencia;
private String ubicacion;
private int nivelGravedad;
private int tiempoRespuesta;
private boolean Atendido;

public Emergencia(String ubicacion, int nivelGravedad, int tiempoRespuesta, int tipoEmergencia) {
    this.tipoEmergencia = tipoEmergencia;
    this.ubicacion = ubicacion;
    this.nivelGravedad = nivelGravedad;
    this.tiempoRespuesta = tiempoRespuesta;
}

public static void main (String[] args) throws Exception {
    System.out.println("¡Estas en la aplicacion de Emergencias!");
// Emergencia emergencia= new Emergencia(tipoEmergencia());
    System.out.println("Ingrese la ubicacion de la Emergencia");
    Scanner entrada = new Scanner(System.in);
    System.out.println("la emergencia es " + gettipoEmergencia() + " ubicada en " + entrada.next());
        System.out.println("");
        System.out.println("la emergencia fue registrada con exito.");
        System.out.println("Por favor siga las indicaciones dadas por las autoridades competentes.");
    
    }
    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }
    
    public int gettipoEmergencia() {
        return tipoEmergencia;
}

public Emergencia(int tipoEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
    }

public void settipoEmergencia(int tipoEmergencia) {
    System.out.println("Ingrese el tipo de Emergencia");
    System.out.println("1. Incendio");
    System.out.println("2. Robo");
    System.out.println("3. Accidente");
    this.tipoEmergencia = entrada.nextInt();
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