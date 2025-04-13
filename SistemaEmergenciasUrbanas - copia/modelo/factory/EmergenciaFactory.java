
package modelo.factory;

import modelo.interfaces.IServicioEmergencia;
import modelo.services.Ambulancia;
import modelo.services.Bomberos;
import modelo.services.Policia;

public class EmergenciaFactory {
    public static IServicioEmergencia crearEmergencia(String tipo) {
        switch (tipo.toLowerCase()) {
            case "ambulancia":
                return new Ambulancia();
            case "bomberos":
                return new Bomberos();
            case "policia":
                return new Policia();
            default:
                throw new IllegalArgumentException("Tipo de emergencia desconocido: " + tipo);
        }
    }
}
