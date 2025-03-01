package CLASE07;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.management.timer.TimerMBean;

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


        Timer temporizador = new Timer();


        temporizador.schedule(new TimerTask() {
            private int contador = 0;
            private final String mensaje = "Tu puedes sigue estudiante programacion";

            @Override
            public void run(){
                System.out.println(mensaje);
                if (contador == 5){
                    temporizador.cancel();
                } 
             }

         }, 0, 2000);


         //lambda
         Operacion suma = (x, y) -> x + y;
         suma.ejecutar(10, 8);

         Sumar sumaClase = new Sumar();
         sumaClase.ejecutar(10, 8);
    
         List<String> Palabras = new ArrayList<>();

         Palabras.add("hola");
         Palabras.add("como estas???");
         Palabras.add("chao");

         List<String> filtradas = Palabras.stream().filter(palabra ->palabra.endsWith("?")).collect(Collectors.toList());
        }
}
