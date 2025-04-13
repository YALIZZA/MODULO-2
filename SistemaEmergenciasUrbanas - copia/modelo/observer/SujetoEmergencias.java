
package modelo.observer;

import java.util.ArrayList;
import java.util.List;

public class SujetoEmergencias {
    private List<ObserverEmergencias> observadores = new ArrayList<>();

    public void agregarObservador(ObserverEmergencias observador) {
        observadores.add(observador);
    }

    public void notificar(String mensaje) {
        for (ObserverEmergencias o : observadores) {
            o.actualizar(mensaje);
        }
    }
}
