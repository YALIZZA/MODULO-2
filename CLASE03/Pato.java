package CLASE03;

public class Pato implements volador, nadador{

    @Override
    public void nadar() {
        System.out.println("El pato esta nadando");
    }

    @Override
    public void volar() {
        System.out.println("El pato esta volando");
    }

}
