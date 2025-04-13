
package modelo.services;

import modelo.interfaces.IServicioEmergencia;

public class Ambulancia implements IServicioEmergencia {
    private int unidadesDisponibles = 10;

    @Override
    public void atenderEmergencia() {
        if (unidadesDisponibles > 0) {
            unidadesDisponibles--;
            System.out.println("Ambulancia en camino.");
        } else {
            System.out.println("No hay ambulancias disponibles.");
        }
    }

    @Override
    public String getEstado() {
        return "Ambulancias disponibles: " + unidadesDisponibles;
    }
}
