package CLASE05;
public class Computador {

    private TarjetaMadre tarjetaMadre;

    public Computador() {
    this.tarjetaMadre = new TarjetaMadre(1000, 16, 4, 8, 64 );
    tarjetaMadre.RegistrartipoHD("SSD");
    }

    public void mostarConfiguracion(){

        System.out.println("Configuracion de la PC:");
        tarjetaMadre.getMotherBoardComponents();

    }

    
}
