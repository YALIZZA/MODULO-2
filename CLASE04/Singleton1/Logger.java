package Singleton1;

public class Logger {
    
    private static Logger instancia;

    private Logger(){
    }

    public static Logger getIstancia(){
        if (instancia == null) {
            instancia = new Logger();
        } 
        return instancia;
    }

    public void log(String Mensaje) {
        System.out.println("[LOG]: " + Mensaje );
    }

}
