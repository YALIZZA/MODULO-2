package CLASE03;

import java.util.ArrayList;
import java.util.List;

public class main {//ususario 
        
    public static void main(String[] args) {
        //creacion de lista
        List<Vehiculo> Vehiculos = new ArrayList<>();
        Vehiculos.add(new Carro());
        Vehiculos.add(new Avion());
        Vehiculos.add(new Moto());
        System.out.println(Vehiculos);

        for (Vehiculo Vehiculo : Vehiculos) {
             Vehiculo.moverse();
        }
        
        nadador.patear();
        
        Pato pato = new Pato();
        pato.volar();
        pato.nadar();
        pato.clavado();
        


    }

     

}
