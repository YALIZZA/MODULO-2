
package modelo.strategy;

public class StrategyPrioridadGravedad implements IPrioridad {
    @Override
    public void establecerPrioridad() {
        System.out.println("Prioridad: Alta por gravedad.");
    }
}
