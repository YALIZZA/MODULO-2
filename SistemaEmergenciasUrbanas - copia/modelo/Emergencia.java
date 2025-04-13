
package modelo;

import modelo.strategy.IPrioridad;

public class Emergencia {
    private String tipo;
    private String ubicacion;
    private String gravedad;
    private int vehiculos;
    private IPrioridad estrategia;

    public Emergencia(String tipo, String ubicacion, String gravedad, int vehiculos) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.gravedad = gravedad;
        this.vehiculos = vehiculos;
    }

    public void setEstrategia(IPrioridad estrategia) {
        this.estrategia = estrategia;
    }

    public void manejarPrioridad() {
        if (estrategia != null) {
            estrategia.establecerPrioridad();
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void procesar() {
        System.out.println("Procesando emergencia: " + tipo + " con " + vehiculos + " vehículos.");
    }
}
