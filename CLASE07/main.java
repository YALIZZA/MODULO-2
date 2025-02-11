package CLASE07;

public class main {

    public static void main(String[] args) {

        Alarmas Alarma1 = new Alarmas("qwer1234");
        Alarma1.getCodigo();

        Alarmas.SensorHumo sensorCocina = Alarma1.new SensorHumo("1234dfggh", "primerPiso");
        Alarmas.SensorHumo sensorSala = Alarma1.new SensorHumo("123gh", "segundoPiso");

        sensorCocina.detectarHumo();
        sensorSala.lanzarAlerta();


        Notificacion notificacionEmail = new Notificacion(){
        @Override
        public void enviar(String mensaje){
            System.out.println("Envio de email: " + mensaje);
        }
        };

        notificacionEmail.enviar("reunion para manana!!!!");
    }
}
