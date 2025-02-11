package CLASE03;

public interface nadador {

    public static String estilo = "Libre";
    void nadar();

    default void clavado(){
        System.out.println("Al agua!!!!");
    }

    static void patear(){
        System.out.println("patada!!!");
    }
}

