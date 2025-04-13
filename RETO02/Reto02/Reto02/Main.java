package Reto02;

import java.util.Scanner;

public class Main {
    
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      
      Emergencia e1 = new Emergencia(1, "CAlle 34 12", 3,100);
      e1.setTipoEmergencia(e1.getTipoEmergencia());
      //e1.mostrarInformacion();
      /* int opcion;
        do {
            menuEmergencia();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> settipoEmergencia();
                case 2 -> setUbicacion();
                case 3 -> gestionarRecursos();
                case 4 -> iniciarSimulacion();
                case 5 -> System.out.println("¡Gracias por usar el simulador! Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);
        */
       System.out.println("Ingrese la ubicacion de la Emergencia");
       //System.out.println("la emergencia es " + emergencia.gettipoEmergencia() + " ubicada en " + entrada.nextLine());
       System.out.println("");
       
       System.out.println("la emergencia fue registrada con exito.");
       System.out.println("Por favor siga las indicaciones dadas por las autoridades competentes.");
    
       //entrada.close();
   }
   public static int menuEmergencia () {
      Scanner entrada = new Scanner(System.in);
      System.out.println("¡Estas en la aplicacion de Emergencias!");
      System.out.println("Ingrese el tipo de Emergencia");
      System.out.println("1. Incendio");
      System.out.println("2. Robo");
      System.out.println("3. Accidente");
      System.out.println("4. Salir");
      System.out.println("Ingrese una opcion: ");
      return entrada.nextInt();

     // switch (tipoEmergencia) {
         
      }
      //entrada.close();


/* public static int menuEmergencia () {
   Scanner entrada = new Scanner(System.in);
   System.out.println("¡Estas en la aplicacion de Emergencias!");
   System.out.println("Ingrese el tipo de Emergencia");
   System.out.println("1. Incendio");
   System.out.println("2. Robo");
   System.out.println("3. Accidente");
   System.out.println("4. Salir");
   System.out.println("Ingrese una opcion: ");
   return entrada.nextInt();

   switch (tipoEmergencia) {
      
   } */
private static void asignarRecursos() {
  final int VehiculosAmbulancia;
  final int VehiculosPolicia;
  final int VehiculosBombero;
  final int RecursosPolicia;
  final int RecursosAmbulancia;
  final int RecursosBombero;

 // if (tipoEmergencia == 1) {
      VehiculosAmbulancia = 2;
      VehiculosPolicia = 2;
      VehiculosBombero = 3;
      RecursosPolicia = 100;
      RecursosAmbulancia = 100;
      RecursosBombero = 100;
 // } else if (tipoEmergencia == 2) {
    //  VehiculosAmbulancia = 1;
      //VehiculosPolicia = 3;
      //VehiculosBombero = 0;
      //RecursosPolicia = 100;
      //RecursosAmbulancia = 100;
     // RecursosBombero = 100;
 // } else if (tipoEmergencia == 3) {
     // VehiculosAmbulancia = 2;
     // VehiculosPolicia = 2;
     // VehiculosBombero = 3;
      //RecursosPolicia = 100;
      //RecursosAmbulancia = 100;
      //RecursosBombero = 100;
  }
}
//entrada.close();
//}
