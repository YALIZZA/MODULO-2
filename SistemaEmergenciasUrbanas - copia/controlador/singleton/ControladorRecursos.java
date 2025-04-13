
package controlador.singleton;

import java.util.HashMap;
import java.util.Map;

public class ControladorRecursos {
    private static ControladorRecursos instancia;
    private Map<String, Integer> recursosDisponibles;

    private ControladorRecursos() {
        recursosDisponibles = new HashMap<>();
        recursosDisponibles.put("ambulancia", 5);
        recursosDisponibles.put("bomberos", 3);
        recursosDisponibles.put("policia", 4);
    }

    public static ControladorRecursos getInstancia() {
        if (instancia == null) {
            instancia = new ControladorRecursos();
        }
        return instancia;
    }

    public int obtenerRecursos(String tipo) {
        return recursosDisponibles.getOrDefault(tipo.toLowerCase(), 0);
    }

    public void asignarRecurso(String tipo) {
        recursosDisponibles.put(tipo, recursosDisponibles.getOrDefault(tipo, 0) - 1);
    }
}
