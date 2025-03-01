import java.util.Scanner;

public class main {

    static Scanner Entrada = new Scanner(System.in);

    public static void Usuario (String[] args) throws Exception {

       
       //ubicacion// String
       //tipo de gravedad//1. bajo  2. medio   3. alto
       //vehiculos asignados// dependiendo de tipo de gravedad y de tipo de accidente 
     
        int opcion;
        do {
            mostrarMenu();
                        //opcion = scanner.nextInt();
                        switch (opcion) {
                            case 1 -> Incendio();
                            case 2 -> Robo();
                            case 3 -> Accidente();
                            case 4 -> System.out.println("¡Gracias por usar el informarnos de la emergencia");
                            default -> System.out.println("Opción no válida. Intenta de nuevo.");
                        }
                    } while (opcion != 4);
                }
            
         private static void mostrarMenu() {
            System.out.println("Bienvenido a la aplicacion de Emergencias");
            System.out.println("Ingrese el tipo de Emergencia");
            System.out.println("1. Incendio");
            System.out.println("2. Robo");
            System.out.println("3. Accidente");  
            System.out.println("4. Salir");  
        
        }

        
}  
