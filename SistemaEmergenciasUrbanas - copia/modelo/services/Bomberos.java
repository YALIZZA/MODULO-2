
package modelo.services;

import modelo.interfaces.IServicioEmergencia;

public class Bomberos implements IServicioEmergencia {
    private int unidadesDisponibles = 5;

    @Override
    public void atenderEmergencia() {
        if (unidadesDisponibles > 0) {
            unidadesDisponibles--;
            System.out.println("Bomberos atendiendo incendio.");
        } else {
            System.out.println("No hay camiones de bomberos disponibles.");
        }
    }

    @Override
    public String getEstado() {
        return "Camiones de bomberos disponibles: " + unidadesDisponibles;
    }
}
