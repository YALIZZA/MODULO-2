
package controlador;

import modelo.Emergencia;
import modelo.services.*;
import modelo.strategy.*;
import modelo.interfaces.IServicioEmergencia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaEmergencias {
    private static List<Emergencia> emergencias = new ArrayList<>();
    private static List<IServicioEmergencia> servicios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        servicios.add(new Ambulancia());
        servicios.add(new Bomberos());
        servicios.add(new Policia());

        while (true) {
            System.out.println("\n--- MENÚ SISTEMA DE EMERGENCIAS ---");
            System.out.println("1. Registrar nueva emergencia");
            System.out.println("2. Ver estado de los recursos");
            System.out.println("3. Atender emergencia");
            System.out.println("4. Mostrar estadísticas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarEmergencia(scanner);
                    break;
                case 2:
                    verEstadoRecursos();
                    break;
                case 3:
                    atenderEmergencia();
                    break;
                case 4:
                    mostrarEstadisticas();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }

    private static void registrarEmergencia(Scanner scanner) {
        System.out.println("Ingrese el tipo de emergencia (Incendio, Accidente, Robo): ");
        String tipo = scanner.nextLine();
        System.out.println("Ingrese la ubicación: ");
        String ubicacion = scanner.nextLine();
        System.out.println("Ingrese nivel de gravedad (Bajo, Medio, Alto): ");
        String gravedad = scanner.nextLine();
        System.out.println("Ingrese cantidad de vehículos a asignar: ");
        int vehiculos = scanner.nextInt();
        scanner.nextLine();

        Emergencia emergencia = new Emergencia(tipo, ubicacion, gravedad, vehiculos);
        emergencias.add(emergencia);
        System.out.println("Emergencia registrada exitosamente.");
    }

    private static void verEstadoRecursos() {
        System.out.println("\nEstado de los recursos disponibles:");
        for (IServicioEmergencia servicio : servicios) {
            System.out.println(servicio.getEstado());
        }
    }

    private static void atenderEmergencia() {
        if (emergencias.isEmpty()) {
            System.out.println("No hay emergencias pendientes.");
            return;
        }
        Emergencia emergencia = emergencias.remove(0);
        System.out.println("Atendiendo emergencia: " + emergencia.getTipo());
        emergencia.procesar();
    }

    private static void mostrarEstadisticas() {
        System.out.println("\nEstadísticas del sistema:");
        System.out.println("Total de emergencias atendidas: " + (5 - emergencias.size()));
        System.out.println("Recursos disponibles: " + servicios.size());
    }
}
