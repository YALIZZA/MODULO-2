package Reto02;

import java.util.Scanner;

public class Main{
    
   public static void main(String[] args) {
       

       System.out.println("¡Estas en la aplicacion de Emergencias!");
       System.out.println("Ingrese el tipo de Emergencia");
       System.out.println("1. Incendio");
       System.out.println("2. Robo");
       System.out.println("3. Accidente");
       Emergencia emergencia = new Emergencia("cra 5 10 12", 3, 15, 1);
       //emergencia.settipoEmergencia(entrada.nextInt());
       System.out.println("Ingrese la ubicacion de la Emergencia");
       Scanner entrada = new Scanner(System.in);
       System.out.println("la emergencia es " + emergencia.gettipoEmergencia() + " ubicada en " + entrada.nextLine());
       System.out.println("");
       entrada.close();
       System.out.println("la emergencia fue registrada con exito.");
       System.out.println("Por favor siga las indicaciones dadas por las autoridades competentes.");
    
   }

  // void menuEmergencia();
}
