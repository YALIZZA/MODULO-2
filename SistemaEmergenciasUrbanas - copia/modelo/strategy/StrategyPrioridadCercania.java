
package modelo.strategy;

public class StrategyPrioridadCercania implements IPrioridad {
    @Override
    public void establecerPrioridad() {
        System.out.println("Prioridad: Cercanía al incidente.");
    }
}
