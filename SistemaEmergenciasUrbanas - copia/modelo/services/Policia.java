
package modelo.services;

import modelo.interfaces.IServicioEmergencia;

public class Policia implements IServicioEmergencia {
    private int unidadesDisponibles = 8;

    @Override
    public void atenderEmergencia() {
        if (unidadesDisponibles > 0) {
            unidadesDisponibles--;
            System.out.println("Policía en camino.");
        } else {
            System.out.println("No hay patrullas disponibles.");
        }
    }

    @Override
    public String getEstado() {
        return "Patrullas disponibles: " + unidadesDisponibles;
    }
}
