package CLASE06;

abstract class Animals {

    private String raza;

    //metodo obstracto
    abstract void hacerSonido();

    //metodo concreto
    void dormir(){
        System.out.println("Roncanco.....ZzzzzZ" + raza);
    }


    void Rascarse(){
        System.out.println("rascarse");
    }
}
