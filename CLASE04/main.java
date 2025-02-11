import CLASE04.Singleton;

public class main {
    public static void main(String[] args) {

        //Singleton
        Logger logger1 = Logger.getIstancia();
        Logger logger2 = Logger.getIstancia();

        logger1.log("Se imprimio el pasaporte");
        logger2.log("Se imprimio la historia clinica");

        System.out.println(logger1);
        System.out.println(logger2);
        System.out.println(logger1 == logger2);


        //Factory
        Forma forma1 = FormaFactory.getForma(tipoForma.CIRCULO);
        forma1.dibujar();
        Forma forma2 = FormaFactory.getForma(tipoForma.RECTANGULO);
        forma2.dibujar();
        Forma forma3 = FormaFactory.getForma(tipoForma.TRIANGULO);
        forma3.dibujar();

        System.out.println(forma1 == forma2);


    }
}