package CLASE03;

public class Avion implements Vehiculo{

    @Override
    public void moverse() {
        
        System.out.println("El Avion vuela");
    }

    @Override
    public int obtenerVelocidad() {
        return 300;
    }

    @Override
    public void cambiarMarcha(int cambio) {
        System.out.println("Se cambio a :" + cambio + "marcha");
        
    }


}
